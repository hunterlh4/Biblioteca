package Negocio;


import java.lang.reflect.Field;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

public abstract class NConexion {
	private static Connection Singleton = null;
	  private static Connection CnxMySQL = null;
	    private static Connection CnxSQLServer = null;
	private NConexion() {
	}

	private static void conectar() {
		try {
			
			/*
			Singleton = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/biblioteca?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");
			System.out.println("Conexion Exitos�");
			*/
			
			 MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
	            ds.setServerName("localhost");
	            ds.setPort(3306);
	            ds.setDatabaseName("bdbiblioteca");
	            CnxMySQL = ds.getConnection("root","");
			
		} catch (Exception e) {
			System.out.println("Error de Conexion: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

	public static Connection Db() {
		if (Singleton == null) {
			conectar();
		}
		return Singleton;
	}

	public static Field ObjetoContieneCampo(Object object, String fieldName) {
		List<Field> Lista = Arrays.stream(object.getClass().getFields()).filter(f -> f.getName().equals(fieldName))
				.collect(Collectors.toList());
		if (Lista.size() > 0) {
			return Lista.get(0);
		}
		return null;
	}

	/*
	 * public static boolean ExisteEnLista(String Texto, List<String> Lista) { for
	 * (String str : Lista) { if (str.equals(Texto)) { return true; }
	 * 
	 * } return false; }
	 */

	// Obtiene parametros del procedimiento almacenado
	private static List<String> ParametrosDeSP(String procedimiento) {
		try {
			List<String> Parametros = new ArrayList<String>();
			CallableStatement stmt = Db().prepareCall("CALL SP_INFORMACION_PROCEDIMIENTO('" + procedimiento + "')");
			ResultSet r = stmt.executeQuery();
			while (r.next()) {
				Parametros.add(r.getString("PARAMETER_NAME"));
//			System.out.println(r.getString("PARAMETER_NAME"));
			}
			return Parametros;
		} catch (SQLException e1) {
			e1.printStackTrace();
			return null;
		}
	}

	// Retorna un String que se usar� para construir un CallableStatement
	private static String ContruirStrProcedimiendo(String Procedimiendo, int CantidadParametros) {
		String[] ListaInterrogantes = new String[CantidadParametros];
		Arrays.fill(ListaInterrogantes, "?");
		String StrProcedimiento = "{ CALL " + Procedimiendo + "(" + String.join(",", ListaInterrogantes) + ")}";
		System.out.println(StrProcedimiento);
		return StrProcedimiento;
	}

	// Agregar un parametro que requiere el CallableStatement
	private static void AgregarParametro(Field atributo, CallableStatement stmt, Object obj) {
		String tipo = atributo.getAnnotatedType().getType().getTypeName();
		try {
			if (tipo.equals("int")) {
				stmt.setInt(("_" + atributo.getName()), (int) atributo.get(obj));
			} else if (tipo.equals("java.lang.String")) {
				System.out.println("ADMITIDO PARAMETRO :" + (atributo.getName()) + " con valor " + atributo.get(obj));
				stmt.setString(("_" + atributo.getName()), (String) atributo.get(obj));
			} else if (tipo.equals("double")) {
				stmt.setDouble("_" + atributo.getName(), (double) atributo.get(obj));
			} else if (tipo.equals("boolean")) {
				stmt.setBoolean("_" + atributo.getName(), (boolean) atributo.get(obj));
				System.out.println("ADMITIDO PARAMETRO :" + (atributo.getName()) + " con valor " + atributo.get(obj));
			} else {
				System.out.println("NO ADMITIDO PARAMETRO : " + (atributo.getName()) + " con valor " + atributo.get(obj)
						+ " TYPE " + atributo.getAnnotatedType().getType().getTypeName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Crea un CallableStatement listo para ejecutar con sus parametros
	// correspondientes
	private static CallableStatement ConstruirProcedimiento(Object Obj, String StrProcedimiento) {
		try {
			List<String> Parametros = ParametrosDeSP(StrProcedimiento);
			CallableStatement Stmt = Db().prepareCall(ContruirStrProcedimiendo(StrProcedimiento, Parametros.size()));

			for (String Parametro : Parametros) {
				Field Campo = ObjetoContieneCampo(Obj, Parametro.substring(1));
				if (Campo != null) {
					AgregarParametro(Campo, Stmt, Obj);
				}
			}
			return Stmt;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// Ejecutar un CallableStatement que previamente debe estar listo para ejecutar
	// con sus parametros correspondientes
	public static ResultSet Ejecutar(Object Obj, String StrProcedimiento) {
		CallableStatement stmt = ConstruirProcedimiento(Obj, StrProcedimiento);
		ResultSet Resultado = null;
		try {
			Resultado = stmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Resultado;
	}

	public static int EjecutarActualizacion(Object Obj, String StrProcedimiento) {
		CallableStatement stmt = ConstruirProcedimiento(Obj, StrProcedimiento);
		int Resultado = -2;
		try {
			Resultado = stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error en EjecutarActualizacion__:" + e.getMessage());
		}
		return Resultado;
	}
	
	
}


