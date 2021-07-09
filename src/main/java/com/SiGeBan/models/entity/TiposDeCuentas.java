package main.java.com.SiGeBan.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TiposDeCuentas implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//propiedades
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoDeCuenta;
	private String sigla;
	private String nombreDeTipoDeCuenta;

	// constructor
	public TiposDeCuentas() {
	}

	public TiposDeCuentas(String sigla, String nombreDeTipoDeCuenta) {
		super();
		this.sigla = sigla;
		this.nombreDeTipoDeCuenta = nombreDeTipoDeCuenta;
	}

	// metodos
	public int getIdTipoDeCuenta() {
		return idTipoDeCuenta;
	}
	
	public void setIdTipoDeCuenta(int idTipoDeCuenta) {
		this.idTipoDeCuenta = idTipoDeCuenta;
	}
	
	public String getNombreDeTipoDeCuenta() {
		return nombreDeTipoDeCuenta;
	}

	public void setNombreDeTipoDeCuenta(String nombreDeTipoDeCuenta) {
		this.nombreDeTipoDeCuenta = nombreDeTipoDeCuenta;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}


}
