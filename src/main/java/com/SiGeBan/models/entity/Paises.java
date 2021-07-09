package main.java.com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Paises implements Serializable {
	// propiedades
	private static final long serialVersionUID = 1L;

	@Id //
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPais;
	private String pais;

	// constructor
	public Paises() {
	}

	public Paises(String pais) {
		this.pais = pais;
	}

	// metodos

	@Override
	public String toString() {
		return "Paises [pais=" + pais + "]";
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
