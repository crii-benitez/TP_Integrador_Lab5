package com.SiGeBan.models.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Movimientos {
	// propiedades
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMovimiento;
	private String detalle;
	private double importe;
	private LocalDate fechaDeMovimiento;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "numeroCuentaOrigen")
	private Cuentas numeroDecuentaOrigen;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "numeroCuentaDestino")
	private Cuentas numeroDecuentaDestino;

	// constructor
	public Movimientos() {
	}

	public Movimientos(String detalle, double importe, LocalDate fechaDeMovimiento, Cuentas numeroDecuentaOrigen, Cuentas numeroDecuentaDestino) {
		super();
		this.detalle = detalle;
		this.importe = importe;
		this.fechaDeMovimiento = fechaDeMovimiento;
		this.numeroDecuentaOrigen = numeroDecuentaOrigen;
		this.numeroDecuentaDestino = numeroDecuentaDestino;
	}

	// metodos
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

	public LocalDate getFechaDeMovimiento() {
		return fechaDeMovimiento;
	}

	public void setFechaDeMovimiento(LocalDate fechaDeMovimiento) {
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

	public int getIdMovimiento() {
		return idMovimiento;
	}

	public void setIdMovimiento(int idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

}
