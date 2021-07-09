package main.java.com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Generos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGenero;
	
	private String genero;
	
	public Generos()
	{}
	public Generos(String genero)
	{	
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Genero [id=" + idGenero + ", genero=" + genero + "]";
	}
	
	
}
