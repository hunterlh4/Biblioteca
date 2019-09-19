package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ETipoMovimiento;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NTipoMovimiento implements INegocio<ETipoMovimiento> {

	@Override
	public int Agregar(ETipoMovimiento Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_TipoMovimiento");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar TipoMovimiento: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ETipoMovimiento Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_TipoMovimiento");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ETipoMovimiento Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_TipoMovimiento");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ETipoMovimiento> Listar() {
	
		List<ETipoMovimiento> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ETipoMovimiento(), "SP_LISTAR_USUARIO");
			Lista = (List<ETipoMovimiento>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ETipoMovimiento());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
