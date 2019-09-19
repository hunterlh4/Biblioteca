package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EKardexDetalle;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NKardexDetalle implements INegocio<EKardexDetalle> {

	@Override
	public int Agregar(EKardexDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_KardexDetalle");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar KardexDetalle: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EKardexDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_KardexDetalle");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EKardexDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_KardexDetalle");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EKardexDetalle> Listar() {
	
		List<EKardexDetalle> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EKardexDetalle(), "SP_LISTAR_USUARIO");
			Lista = (List<EKardexDetalle>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EKardexDetalle());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
