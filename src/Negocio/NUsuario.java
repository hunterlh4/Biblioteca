package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EUsuario;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NUsuario implements INegocio<EUsuario> {

	@Override
	public int Agregar(EUsuario Obj) {
		// TODO Auto-generated method stub
		
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_USUARIO");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Usuario: " + e.getMessage());
			return 0;
		}
	
	}

	@Override
	public boolean Modificar(EUsuario Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_USUARIO");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		

	}

	@Override
	public boolean Eliminar(EUsuario Obj) {
		// TODO Auto-generated method stub
		
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_USUARIO");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<EUsuario> Listar() {
		List<EUsuario> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EUsuario(), "SP_LISTAR_USUARIO");
			Lista = (List<EUsuario>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EUsuario());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
