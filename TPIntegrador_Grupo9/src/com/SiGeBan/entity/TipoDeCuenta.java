package com.SiGeBan.entity;

public class TipoDeCuenta {
	
	//propiedades
	private String sigla;
	private String nombreDeTipoDeCuenta;

	// constructor
	public TipoDeCuenta() {
	}

	public TipoDeCuenta(String sigla, String nombreDeTipoDeCuenta) {
		this.sigla = sigla;
		this.nombreDeTipoDeCuenta = nombreDeTipoDeCuenta;
	}

	// metodos
	public String getNombreDeTipoDeCuenta() {
		return nombreDeTipoDeCuenta;
	}

	public void setNombreDeTipoDeCuenta(String nombreDeTipoDeCuenta) {
		this.nombreDeTipoDeCuenta = nombreDeTipoDeCuenta;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
