package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.ELibroAutor;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NLibroAutor implements INegocio<ELibroAutor> {

	@Override
	public int Agregar(ELibroAutor Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_LibroAutor");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar LibroAutor: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(ELibroAutor Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_LibroAutor");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(ELibroAutor Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_LibroAutor");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<ELibroAutor> Listar() {
	
		List<ELibroAutor> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new ELibroAutor(), "SP_LISTAR_USUARIO");
			Lista = (List<ELibroAutor>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new ELibroAutor());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
