package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EAutor;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NAutor implements INegocio<EAutor> {

	@Override
	public int Agregar(EAutor Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Autor");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Autor: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EAutor Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Autor");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EAutor Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Autor");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EAutor> Listar() {
	
		List<EAutor> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EAutor(), "SP_LISTAR_USUARIO");
			Lista = (List<EAutor>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EAutor());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
