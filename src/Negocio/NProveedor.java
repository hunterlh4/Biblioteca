package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EProveedor;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NProveedor implements INegocio<EProveedor> {

	@Override
	public int Agregar(EProveedor Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "Sp_Agregar_Proveedor");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Proveedor: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EProveedor Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "Sp_Modificar_Proveedor");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EProveedor Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Proveedor");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EProveedor> Listar() {
	
		List<EProveedor> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EProveedor(), "SP_LISTAR_USUARIO");
			Lista = (List<EProveedor>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EProveedor());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
