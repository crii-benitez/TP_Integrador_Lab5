package com.SiGeBan.models.entity;

import java.util.Date;

public class Movimientos {
	private Cuentas numeroDecuentaOrigen;
	private Cuentas numeroDecuentaDestino;
	private Date fechaDeMovimiento;
	private String detalle;
	private double importe;
	
	public Movimientos() {
		// TODO Auto-generated constructor stub
	}

	
	public Cuentas getNumeroDecuentaOrigen() {
		return numeroDecuentaOrigen;
	}

	public void setNumeroDecuentaOrigen(Cuentas numeroDecuentaOrigen) {
		this.numeroDecuentaOrigen = numeroDecuentaOrigen;
	}

	public Cuentas getNumeroDecuentaDestino() {
		return numeroDecuentaDestino;
	}

	public void setNumeroDecuentaDestino(Cuentas numeroDecuentaDestino) {
		this.numeroDecuentaDestino = numeroDecuentaDestino;
	}

	public Date getFechaDeMovimiento() {
		return fechaDeMovimiento;
	}

	public void setFechaDeMovimiento(Date fechaDeMovimiento) {
		this.fechaDeMovimiento = fechaDeMovimiento;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}


}
