package Entidad;

import java.sql.Date;

public class ECompraDetalle {
	private int Id;
	private int CompraId;
	private int LibroId;
	private double Precio;
	private int Cantidad;
	private double SubTotal;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getCompraId() {
		return CompraId;
	}
	public void setCompraId(int compraId) {
		CompraId = compraId;
	}
	public int getLibroId() {
		return LibroId;
	}
	public void setLibroId(int libroId) {
		LibroId = libroId;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getCantidad() {
		return Cantidad;
	}
	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	public double getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(double subTotal) {
		SubTotal = subTotal;
	}
	
}
