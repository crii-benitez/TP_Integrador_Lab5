package com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Provincias implements Serializable{
	// propiedades
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProvincia;
	private String provincia;

	@ManyToOne
	@JoinColumn(name="pais")
	private Paises pais;


	// constructor
	public Provincias() {
	}

	public Provincias(String provincia, Paises pais) {
		super();
		this.provincia = provincia;
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	// metodos
	public int getIdProvincia() {
		return idProvincia;
	}
	
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
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