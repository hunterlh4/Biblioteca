package Negocio;
import java.sql.ResultSet;
import java.util.List;
import Entidad.EKardex;
import Interface.INegocio;
import Utilidad.Inicializador;

public class NKardex implements INegocio<EKardex> {

	@Override
	public int Agregar(EKardex Obj) {
		// TODO Auto-generated method stub
		try {
			ResultSet r = NConexion.Ejecutar(Obj, "SP_AGREGAR_Kardex");

			r.first();
			return r.getInt("lid");
		} catch (Exception e) {
			System.out.println("Error al Agregar Kardex: " + e.getMessage());
			return 0;
		}
	}

	@Override
	public boolean Modificar(EKardex Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_MODIFICAR_Kardex");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean Eliminar(EKardex Obj) {
		// TODO Auto-generated method stub
		try {
			int afectados = NConexion.EjecutarActualizacion(Obj, "SP_ELIMINAR_Kardex");
			return afectados > 0;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EKardex> Listar() {
	
		List<EKardex> Lista =  null;
		// TODO Auto-generated method stub
		
		
		try {
			ResultSet r = NConexion.Ejecutar(new EKardex(), "SP_LISTAR_USUARIO");
			Lista = (List<EKardex>) (List<?>) Inicializador.IniciarlizarArrayObjetos(r, new EKardex());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lista;
		

	}

}
