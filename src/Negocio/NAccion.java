package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EAccion;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NAccion implements INegocio<EAccion> {

	@Override
	public int Agregar(EAccion Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Accion");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Accion: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EAccion Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Accion");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EAccion Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_accion");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EAccion> Listar() {
	
		List<EAccion> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EAccion(), "SP_LISTAR_USUARIO");
			Lista = (List<EAccion>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EAccion());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
