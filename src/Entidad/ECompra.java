package Entidad;

import java.sql.Date;

public class ECompra {
	private int Id;
	private int UsuarioId;
	private int ProveedorId;
	private Date FechaRegistro;
	private Date FechaCompra;
	private double Total;
	private String Descripcion;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public int getUsuarioId() {
		return UsuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		UsuarioId = usuarioId;
	}
	public int getProveedorId() {
		return ProveedorId;
	}
	public void setProveedorId(int proveedorId) {
		ProveedorId = proveedorId;
	}
	public Date getFechaRegistro() {
		return FechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}
	public Date getFechaCompra() {
		return FechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		FechaCompra = fechaCompra;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
}
