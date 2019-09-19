package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EModulo;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NModulo implements INegocio<EModulo> {

	@Override
	public int Agregar(EModulo Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Modulo");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Modulo: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EModulo Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Modulo");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EModulo Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Modulo");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EModulo> Listar() {
	
		List<EModulo> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EModulo(), "SP_LISTAR_USUARIO");
			Lista = (List<EModulo>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EModulo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
