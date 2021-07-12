package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Localidades;

public interface ILocalidadDAO {
	//Alta de persona
	public void insertarLocalidad(Localidades Localidad);

	//Obtiene una persona por dni
	public Localidades obtenerLocalidadPorID(Integer txtLocalidad);

	//Obtiene todas las presonas
	public ArrayList<Localidades> obtenerLocalidades();

	//Elimina una presona a aprtir del dni
	public void eliminarLocalidad(String txtLocalidad);

	//Actualiza los datos de una persona
	public void actualizarLocalidad(Localidades Localidad);
	
}