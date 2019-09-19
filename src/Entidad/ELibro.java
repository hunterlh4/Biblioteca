package Entidad;
import java.sql.Date;
public class ELibro {

	private int Id;
	private String Titulo;
	private double Precio;
	private String Editorial;
	private int Cantidad;
	private Date FechaCreacion;
	private int LibroAutorId;
	private String Resumen;
	private int CategoriaId;
	private int RelacionMateriaId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public int getLibroAutorId() {
		return LibroAutorId;
	}
	public void setLibroAutorId(int libroAutorId) {
		LibroAutorId = libroAutorId;
	}
	public String getResumen() {
		return Resumen;
	}
	public void setResumen(String resumen) {
		Resumen = resumen;
	}
	public int getCategoriaId() {
		return CategoriaId;
	}
	public void setCategoriaId(int categoriaId) {
		CategoriaId = categoriaId;
	}
	public int getRelacionMateriaId() {
		return RelacionMateriaId;
	}
	public void setRelacionMateriaId(int relacionMateriaId) {
		RelacionMateriaId = relacionMateriaId;
	}
	
	
}
