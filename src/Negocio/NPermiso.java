package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EPermiso;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NPermiso implements INegocio<EPermiso> {

	@Override
	public int Agregar(EPermiso Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Permiso");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Permiso: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EPermiso Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Permiso");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EPermiso Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Permiso");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EPermiso> Listar() {
	
		List<EPermiso> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EPermiso(), "SP_LISTAR_USUARIO");
			Lista = (List<EPermiso>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EPermiso());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
