package com.SiGeBan.models.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Personas implements Serializable {

	// propiedades
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;

	private int DNI;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String direccion;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "localidad")
	private Localidades localidad;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "pais")
	private Paises pais;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "genero")
	private Generos genero;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "provincia")
	private Provincias provincia;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "usuario")
	private Usuarios usuario;

	// constructor
	public Personas() {

	}

	public Personas(int dNI, String nombre, String apellido, String fechaNacimiento, String direccion,
			Localidades localidad, Provincias provincia, Paises pais, Generos genero, Usuarios usuario) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento);
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.pais = pais;
		this.genero = genero;
		this.usuario = usuario;
	}

	// metodos
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

	public void setGeneros(Generos genero) {
		this.genero = genero;
	}

	public Paises getPais() {
		return pais;
	}

	public void setPais(Paises pais) {
		this.pais = pais;
	}

	public LocalDate getFechanac() {
		return fechaNacimiento;
	}

	public void setFechanac(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Personas [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + "]";
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

}
