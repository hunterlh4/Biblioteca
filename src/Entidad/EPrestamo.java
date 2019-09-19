package Entidad;

import java.sql.Date;

public class EPrestamo {
	private int Id;
	private int UsuarioBibliotecariaId;
	private int UsuarioId;
	private Date FechaEntrega;
	private Date FechaDevolucion;
	private String Estado;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUsuarioBibliotecariaId() {
		return UsuarioBibliotecariaId;
	}
	public void setUsuarioBibliotecariaId(int usuarioBibliotecariaId) {
		UsuarioBibliotecariaId = usuarioBibliotecariaId;
	}
	public int getUsuarioId() {
		return UsuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		UsuarioId = usuarioId;
	}
	public Date getFechaEntrega() {
		return FechaEntrega;
	}
	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}
	public Date getFechaDevolucion() {
		return FechaDevolucion;
	}
	public void setFechaDevolucion(Date fechaDevolucion) {
		FechaDevolucion = fechaDevolucion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
