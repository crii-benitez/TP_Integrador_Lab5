package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Provincias;

public interface IProvinciaDAO {
	//Alta de persona
	public void insertarProvincia(Provincias Provincia);

	//Obtiene una persona por dni
	public Provincias obtenerProvinciaPorID(Integer txtProvincia);

	//Obtiene todas las presonas
	public ArrayList<Provincias> obtenerProvincias();

	//Elimina una presona a aprtir del dni
	public void eliminarProvincia(String txtProvincia);

	//Actualiza los datos de una persona
	public void actualizarProvincia(Provincias Provincia);
	
}
