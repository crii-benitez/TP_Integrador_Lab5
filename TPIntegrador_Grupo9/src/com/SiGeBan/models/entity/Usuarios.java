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
	private Long idUsuario;
	private String usuario;
	private String pass;
	private Boolean activo;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "perfil")
	private Perfiles perfil;

	// constructores
	public Usuarios(String usuario, String pass, Perfiles perfil, Boolean estado) {
		this.usuario = usuario;
		this.pass = pass;
		this.perfil = perfil;
		this.activo = estado;
	}

	public Usuarios() {
	}

	// metodos

	@Override
	public String toString() {
		return "Usuarios [idUsuario=" + idUsuario + ", usuario=" + usuario + ", pass=" + pass + ", activo=" + activo
				+ ", perfil=" + perfil + "]";
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

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	

}
