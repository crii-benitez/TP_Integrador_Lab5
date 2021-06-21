package com.SiGeBan.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Cuentas implements Serializable{

	//Implementar serializable
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="User")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuario;
	
	@Column(name="EntryDate")
	private String fechaDeCreacion;
	
	@Column(name="AccountType")
	private String tipoDeCuenta;
	
    @Column(name="AccountNumber")
	private int numeroDeCuenta;
    
    @Column(name="CBU")
    private int cbu;
    
    @Column(name="AccountName")
    private String nombreCuenta;
    
    @Column(name="Balance")
    private int saldo;
    
	
	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public String getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(String fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public String getTipoDeCuenta() {
		return tipoDeCuenta;
	}

	public void setTipoDeCuenta(String tipoDeCuenta) {
		this.tipoDeCuenta = tipoDeCuenta;
	}

	public int getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(int numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public int getCbu() {
		return cbu;
	}

	public void setCbu(int cbu) {
		this.cbu = cbu;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	//Constructor vacio
	public Cuentas()
	{
		
	}

	public String getNombre() {
		return fechaDeCreacion;
	}

	public void setNombre(String nombre) {
		this.fechaDeCreacion = nombre;
	}

	public String getContrasenia() {
		return tipoDeCuenta;
	}

	public void setContrasenia(String contrasenia) {
		this.tipoDeCuenta = contrasenia;
	}

	@Override
	public String toString() {
		return "Cuentas [usuario=" + usuario + ", fechaDeCreacion=" + fechaDeCreacion + ", tipoDeCuenta=" + tipoDeCuenta
				+ ", numeroDeCuenta=" + numeroDeCuenta + ", cbu=" + cbu + ", nombreCuenta=" + nombreCuenta + ", saldo="
				+ saldo + ", getUsuario()=" + getUsuario() + ", getFechaDeCreacion()=" + getFechaDeCreacion()
				+ ", getTipoDeCuenta()=" + getTipoDeCuenta() + ", getNumeroDeCuenta()=" + getNumeroDeCuenta()
				+ ", getCbu()=" + getCbu() + ", getNombreCuenta()=" + getNombreCuenta() + ", getSaldo()=" + getSaldo()
				+ ", getNombre()=" + getNombre() + ", getContrasenia()=" + getContrasenia() + "]";
	}


	
	
}
