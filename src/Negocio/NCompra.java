package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ECompra;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NCompra implements INegocio<ECompra> {

	@Override
	public int Agregar(ECompra Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Compra");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Compra: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ECompra Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Compra");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ECompra Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Compra");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ECompra> Listar() {
	
		List<ECompra> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ECompra(), "SP_LISTAR_USUARIO");
			Lista = (List<ECompra>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ECompra());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
