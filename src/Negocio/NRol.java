package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ERol;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NRol implements INegocio<ERol> {

	@Override
	public int Agregar(ERol Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Rol");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Rol: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ERol Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Rol");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ERol Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Rol");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ERol> Listar() {
	
		List<ERol> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ERol(), "SP_LISTAR_USUARIO");
			Lista = (List<ERol>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ERol());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
