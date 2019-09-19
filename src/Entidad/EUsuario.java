package Entidad;

public class EUsuario {

	private int Id;
	private String Dni;
	private String Codigo;
	private String Nombres;
	private String Apellidos;
	private String Clave;
	private String Correo;
	private boolean Activo;
	private int RolId;
	private int FacultadId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public boolean isActivo() {
		return Activo;
	}
	public void setActivo(boolean activo) {
		Activo = activo;
	}
	public int getRolId() {
		return RolId;
	}
	public void setRolId(int rolId) {
		RolId = rolId;
	}
	public int getFacultadId() {
		return FacultadId;
	}
	public void setFacultadId(int facultadId) {
		FacultadId = facultadId;
	}
	
	
	
}
