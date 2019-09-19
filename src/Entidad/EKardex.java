package Entidad;

import java.sql.Date;

public class EKardex {
	private int Id;
	private int IdLibro;
	private String Ruc;
	private String RazonSocial;
	private String Nombre;
	private double Total;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getIdLibro() {
		return IdLibro;
	}
	public void setIdLibro(int idLibro) {
		IdLibro = idLibro;
	}
	public String getRuc() {
		return Ruc;
	}
	public void setRuc(String ruc) {
		Ruc = ruc;
	}
	public String getRazonSocial() {
		return RazonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal(double total) {
		Total = total;
	}
	
	
}
