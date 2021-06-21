package com.SiGeBan.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Users")
public class Usuario implements Serializable {

	/**
	 * //Implementar serializable
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String user;
	private String pass;
	private Perfiles perfil;
	@Override
	public String toString() {
		if(perfil == null)
			return "Usuario [id=" + id + ", user=" + user + ", pass=" + pass +  "]";
		else
			return "Usuario [id=" + id + ", user=" + user + ", pass=" + pass + ", perfil=" + perfil + "]";
	}
	public Perfiles getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfiles perfil) {
		this.perfil = perfil;
	}
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}


}
