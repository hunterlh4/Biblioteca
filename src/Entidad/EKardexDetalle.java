package Entidad;

import java.sql.Date;

public class EKardexDetalle {
	
	private int Id;
	private int BibliotecaId;
	private int KardexId;
	
	private int TipoMovimientoId;
	private int Cantidad;
	private double CostoUnitario;
	
	private double CostoTotal;
	
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getBibliotecaId() {
		return BibliotecaId;
	}

	public void setBibliotecaId(int bibliotecaId) {
		BibliotecaId = bibliotecaId;
	}

	public int getKardexId() {
		return KardexId;
	}

	public void setKardexId(int kardexId) {
		KardexId = kardexId;
	}

	public int getTipoMovimientoId() {
		return TipoMovimientoId;
	}

	public void setTipoMovimientoId(int tipoMovimientoId) {
		TipoMovimientoId = tipoMovimientoId;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return CostoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		CostoUnitario = costoUnitario;
	}

	public double getCostoTotal() {
		return CostoTotal;
	}

	public void setCostoTotal(double costoTotal) {
		CostoTotal = costoTotal;
	}
	
}
