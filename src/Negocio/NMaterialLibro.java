package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EMaterialLibro;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NMaterialLibro implements INegocio<EMaterialLibro> {

	@Override
	public int Agregar(EMaterialLibro Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_MaterialLibro");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar MaterialLibro: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EMaterialLibro Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_MaterialLibro");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EMaterialLibro Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_MaterialLibro");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EMaterialLibro> Listar() {
	
		List<EMaterialLibro> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EMaterialLibro(), "SP_LISTAR_USUARIO");
			Lista = (List<EMaterialLibro>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EMaterialLibro());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
