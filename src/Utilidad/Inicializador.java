package Utilidad;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public abstract class Inicializador<T> {

	public static <T> List<T> IniciarlizarArrayObjetos(ResultSet Resultado, T obj) {

		List<T> Lista = new ArrayList<T>();
		List<String> Columnas = null;
		try {
			Class<?> clase = Class.forName(obj.getClass().getName());
			Object instancia = null;
			Columnas = ObtenerColumnasValidas(Resultado.getMetaData(), obj);
			while (Resultado.next() && Columnas.size() > 0) {
				instancia = clase.getDeclaredConstructor().newInstance();

				for (int i = 0; i < Columnas.size(); i++) {
					switch (obj.getClass().getField(Columnas.get(i)).getType().getName()) {
					case "int":
						SetPropiedad(instancia, Columnas.get(i), Resultado.getInt(Columnas.get(i)));
						break;
					case "java.lang.String":
						SetPropiedad(instancia, Columnas.get(i), Resultado.getString(Columnas.get(i)));
						break;
					case "double":
						SetPropiedad(instancia, Columnas.get(i), Resultado.getDouble(Columnas.get(i)));
						break;
					case "boolean":
						SetPropiedad(instancia, Columnas.get(i), Resultado.getBoolean(Columnas.get(i)));
						break;
					default:
						// code block
					}

				}
				Lista.add((T) instancia);
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return (List<T>) Lista;
	}

	public static boolean TienePropiedad(Object obj, String NombrePropiedad) {
		boolean TF = false;
		try {
			for (Field propiedad : obj.getClass().getFields()) {
				if (propiedad.getName().equals(NombrePropiedad)) {
					TF = true;
					break;
				}
			}
		} catch (Exception e) {

		}
		return TF;
	}

	public static List<String> ObtenerColumnasValidas(ResultSetMetaData MetadataR, Object obj) {
		List<String> Columnas = new ArrayList<>();
		try {
			for (int i = 1; i <= MetadataR.getColumnCount(); i++) {

				if (TienePropiedad(obj, MetadataR.getColumnName(i))) {
					Columnas.add(MetadataR.getColumnName(i));
				}
			}
		} catch (Exception e) {
			System.err.println("ERROR EN ObtenerColumnasValidas");
			e.printStackTrace();
		}

		return Columnas;
		/*
		 * for(String col : Columnas){ System.out.println("["+col+"]"); }
		 */
	}

	public static boolean SetPropiedad(Object object, String fieldName, Object fieldValue) {
		Class<?> clazz = object.getClass();
		while (clazz != null) {
			try {
				Field field = clazz.getDeclaredField(fieldName);
				field.setAccessible(true);
				field.set(object, fieldValue);
				return true;
			} catch (NoSuchFieldException e) {
				clazz = clazz.getSuperclass();
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
		}
		return false;
	}
}
