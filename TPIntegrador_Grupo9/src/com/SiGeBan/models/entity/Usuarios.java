package com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Usuarios implements Serializable {

	// propiedades
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String usuario;
	private String pass;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "perfil")
	private Perfiles perfil;

	// constructores
	public Usuarios(String usuario, String pass, Perfiles perfil) {
		super();
		this.usuario = usuario;
		this.pass = pass;
		this.perfil = perfil;
	}

	public Usuarios() {
	}

	// metodos

	@Override
	public String toString() {
		if (perfil == null)
			return "Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", pass=" + pass + "]";
		else
			return "Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", pass=" + pass + ", perfil=" + perfil + "]";
	}

	public Perfiles getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfiles perfil) {
		this.perfil = perfil;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
