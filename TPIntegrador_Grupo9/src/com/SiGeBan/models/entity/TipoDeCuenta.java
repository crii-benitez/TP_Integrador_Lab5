package com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoDeCuenta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//propiedades
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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
