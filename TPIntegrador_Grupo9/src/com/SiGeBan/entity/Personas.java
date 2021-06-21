package com.SiGeBan.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="Personas")


public class Personas implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int DNI;
	
	@Column(name="Nombre")
	private String nombre;
	
	@Column(name="Apellido")
	private String apellido;	
	
	@Column(name="Genero")
	private Generos genero;
	
	@Column(name="Pais")
	private Paises pais;
	
	@Column(name="FechaNac")
	private LocalDate fechanac;
	
	@Column(name="Direccion")
	private String direccion;
	
	@Column(name="Localidad")
	private Localidades localidad;

	@Column(name="Provincia")
	private Provincias provincia;
	
	@Column(name="Usuario")
	private Usuarios usuario;

	public Personas(int dNI, String nombre, String apellido, Generos genero, Paises pais, LocalDate fechanac,
			String direccion, Localidades localidad, Provincias provincia, Usuarios usuario) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.pais = pais;
		this.fechanac = fechanac;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.usuario = usuario;
	}

	public Personas() {
		
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGeneros(Generos sexo) {
		this.genero = genero;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Localidades getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidades localidad) {
		this.localidad = localidad;
	}

	public Provincias getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincias provincia) {
		this.provincia = provincia;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Personas [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", fechanac=" + fechanac
				+ ", direccion=" + direccion + "]";
	}
	
	
}
