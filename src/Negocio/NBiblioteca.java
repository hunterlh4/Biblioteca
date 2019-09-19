package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EBiblioteca;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NBiblioteca implements INegocio<EBiblioteca> {

	@Override
	public int Agregar(EBiblioteca Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Biblioteca");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Biblioteca: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EBiblioteca Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Biblioteca");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EBiblioteca Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Biblioteca");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EBiblioteca> Listar() {
	
		List<EBiblioteca> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EBiblioteca(), "SP_LISTAR_USUARIO");
			Lista = (List<EBiblioteca>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EBiblioteca());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
