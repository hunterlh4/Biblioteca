package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EPrestamo;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NPrestamo implements INegocio<EPrestamo> {

	@Override
	public int Agregar(EPrestamo Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Prestamo");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Prestamo: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EPrestamo Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Prestamo");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EPrestamo Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Prestamo");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EPrestamo> Listar() {
	
		List<EPrestamo> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EPrestamo(), "SP_LISTAR_USUARIO");
			Lista = (List<EPrestamo>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EPrestamo());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
