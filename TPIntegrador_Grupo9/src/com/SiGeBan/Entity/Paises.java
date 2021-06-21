package com.SiGeBan.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Countries")
public class Paises implements Serializable {
	/**
	 * //Implementar serializable
	 */
	private static final long serialVersionUID = 1L;
	@Id//
	@Column(name="Country")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Pais;
	@Override
	public String toString() {
		return "Paises [Pais=" + Pais + "]";
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}

}
