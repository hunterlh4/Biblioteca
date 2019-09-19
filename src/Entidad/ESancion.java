package Entidad;

public class ESancion {
	
	private int Id;
	private int PrestamoId;
	private int UsuarioId;
	private String Descripcion;
	private String Documento;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPrestamoId() {
		return PrestamoId;
	}
	public void setPrestamoId(int prestamoId) {
		PrestamoId = prestamoId;
	}
	public int getUsuarioId() {
		return UsuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		UsuarioId = usuarioId;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getDocumento() {
		return Documento;
	}
	public void setDocumento(String documento) {
		Documento = documento;
	}
	
}
