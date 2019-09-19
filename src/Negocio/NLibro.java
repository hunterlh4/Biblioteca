package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ELibro;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NLibro implements INegocio<ELibro> {

	@Override
	public int Agregar(ELibro Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Libro");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Libro: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ELibro Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Libro");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ELibro Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Libro");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ELibro> Listar() {
	
		List<ELibro> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ELibro(), "SP_LISTAR_USUARIO");
			Lista = (List<ELibro>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ELibro());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
