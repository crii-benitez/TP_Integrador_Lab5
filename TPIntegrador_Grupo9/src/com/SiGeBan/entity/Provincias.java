package com.SiGeBan.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Provincias {
	// propiedades
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Provincia")
	private String provincia;

	@Column(name = "Pais")
	private Paises pais;

	// constructor
	public Provincias() {
	}

	public Provincias(String provincia) {
		super();
		this.provincia = provincia;
	}

	public String getProvincia() {
		return provincia;
	}

	// metodos
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

}