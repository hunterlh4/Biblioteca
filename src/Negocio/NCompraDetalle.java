package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ECompraDetalle;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NCompraDetalle implements INegocio<ECompraDetalle> {

	@Override
	public int Agregar(ECompraDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_CompraDetalle");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar CompraDetalle: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ECompraDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_CompraDetalle");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ECompraDetalle Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_CompraDetalle");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ECompraDetalle> Listar() {
	
		List<ECompraDetalle> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ECompraDetalle(), "SP_LISTAR_USUARIO");
			Lista = (List<ECompraDetalle>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ECompraDetalle());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
