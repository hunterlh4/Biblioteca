package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ESancion;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NSancion implements INegocio<ESancion> {

	@Override
	public int Agregar(ESancion Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Sancion");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Sancion: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ESancion Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Sancion");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ESancion Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Sancion");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ESancion> Listar() {
	
		List<ESancion> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ESancion(), "SP_LISTAR_USUARIO");
			Lista = (List<ESancion>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ESancion());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
