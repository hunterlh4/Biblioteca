package Interface;


import java.util.List;


public interface INegocio<T> {
	public int Agregar(T Obj);

	public boolean Modificar(T Obj);

	public boolean Eliminar(T Obj);

	public List<T> Listar();
}
