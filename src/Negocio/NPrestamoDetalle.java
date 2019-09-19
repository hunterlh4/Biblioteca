package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EPrestamoDetalle;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NPrestamoDetalle implements INegocio<EPrestamoDetalle> {

	@Override
	public int Agregar(EPrestamoDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_PrestamoDetalle");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar PrestamoDetalle: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EPrestamoDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_PrestamoDetalle");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EPrestamoDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_PrestamoDetalle");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EPrestamoDetalle> Listar() {
	
		List<EPrestamoDetalle> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EPrestamoDetalle(), "SP_LISTAR_USUARIO");
			Lista = (List<EPrestamoDetalle>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EPrestamoDetalle());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
