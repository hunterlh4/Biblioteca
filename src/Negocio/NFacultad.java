package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EFacultad;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NFacultad implements INegocio<EFacultad> {

	@Override
	public int Agregar(EFacultad Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Facultad");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Facultad: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EFacultad Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Facultad");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EFacultad Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Facultad");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EFacultad> Listar() {
	
		List<EFacultad> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EFacultad(), "SP_LISTAR_USUARIO");
			Lista = (List<EFacultad>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EFacultad());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
