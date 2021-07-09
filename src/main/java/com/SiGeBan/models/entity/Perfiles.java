package main.java.com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfiles implements Serializable {

	// propiedades
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPerfil;
	private String perfil;

	// constructor
	public Perfiles() {

	}

	public Perfiles(String perfil) {
		super();
		this.perfil = perfil;
	}

	// metodos
	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Perfiles [perfil=" + perfil + "]";
	}

}
