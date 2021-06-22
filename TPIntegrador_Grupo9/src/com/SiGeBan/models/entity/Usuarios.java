package com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Usuarios implements Serializable {

	/**
	 * //Implementar serializable
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String usuario;
	private String pass;
	@OneToOne
	@JoinColumn(name="id")
	private Perfiles perfil;

	//constructores
	public Usuarios(String usuario, String pass) {
		this.usuario= usuario;
		this.pass = pass;
	}
	
	public Usuarios() {
	}

	//metodos
	
	@Override
	public String toString() {
		if(perfil == null)
			return "Usuario [id=" + id + ", usuario=" + usuario + ", pass=" + pass +  "]";
		else
			return "Usuario [id=" + id + ", usuario=" + usuario + ", pass=" + pass + ", perfil=" + perfil + "]";
	}
	public Perfiles getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfiles perfil) {
		this.perfil = perfil;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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


}
