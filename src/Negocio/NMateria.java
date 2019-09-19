package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EMateria;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NMateria implements INegocio<EMateria> {

	@Override
	public int Agregar(EMateria Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Materia");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Materia: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EMateria Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Materia");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EMateria Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Materia");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EMateria> Listar() {
	
		List<EMateria> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EMateria(), "SP_LISTAR_USUARIO");
			Lista = (List<EMateria>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EMateria());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
