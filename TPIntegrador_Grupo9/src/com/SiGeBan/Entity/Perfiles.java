package com.SiGeBan.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Profiles")
public class Perfiles implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Columns(name="Profile")
	private String perfil;

	
	public Perfiles()
	{
		
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
