package Entidad;

import java.sql.Date;

public class EPrestamoDetalle {
	private int Id;
	private int LibroId;
	private int Cantidad;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getLibroId() {
		return LibroId;
	}
	public void setLibroId(int libroId) {
		LibroId = libroId;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	
}
