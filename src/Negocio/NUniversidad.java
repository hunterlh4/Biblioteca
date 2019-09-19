package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EUniversidad;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NUniversidad implements INegocio<EUniversidad> {

	@Override
	public int Agregar(EUniversidad Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Universidad");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Universidad: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EUniversidad Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Universidad");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EUniversidad Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Universidad");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EUniversidad> Listar() {
	
		List<EUniversidad> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EUniversidad(), "SP_LISTAR_USUARIO");
			Lista = (List<EUniversidad>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EUniversidad());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
