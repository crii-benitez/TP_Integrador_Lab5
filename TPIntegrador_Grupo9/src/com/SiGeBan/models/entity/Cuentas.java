package com.SiGeBan.models.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cuentas implements Serializable {
	// propiedades
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCuenta;
	private LocalDate fechaDeCreacion;
	private String cbu;
	private String numeroDeCuenta;
	private String alias;
	private double saldo;
	private Boolean  activa;

	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="tipoDeCuenta")
	private TiposDeCuentas tipoDeCuenta;

	// Constructor
	public Cuentas() {
	}

	public Cuentas(String cbu, String numeroDeCuenta, String alias, LocalDate fechaDeCreacion,
			double saldo, TiposDeCuentas tipoDeCuenta) {
		this.fechaDeCreacion = fechaDeCreacion;
		this.numeroDeCuenta = numeroDeCuenta;
		this.cbu = cbu;
		this.alias = alias;
		this.saldo = saldo;
		this.tipoDeCuenta = tipoDeCuenta;
	}

	// metodos
	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public void setTipoDeCuenta(TiposDeCuentas tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public TiposDeCuentas getTipoDeCuenta() {
		return tipoDeCuenta;
	}
	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public String getNombreCuenta() {
		return alias;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.alias = nombreCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public Boolean getActiva() {
		return activa;
	}

	public void setActiva(Boolean activa) {
		this.activa = activa;
	}

	@Override
	public String toString() {
		return "Cuentas [idCuenta=" + idCuenta + ", fechaDeCreacion=" + fechaDeCreacion + ", cbu=" + cbu
				+ ", numeroDeCuenta=" + numeroDeCuenta + ", alias=" + alias + ", saldo=" + saldo + ", activa=" + activa
				+ ", tipoDeCuenta=" + tipoDeCuenta + "]";
	}

}
