package com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Provincias")
public class Provincias implements Serializable{
	// propiedades
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Provincia")
	private String provincia;

	@ManyToOne
	@JoinColumn(name="pais")
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