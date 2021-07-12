package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Paises;

public interface IPaisDAO {
	//Alta de persona
	public void insertarPais(Paises pais);

	//Obtiene una persona por dni
	public Paises obtenerPaisPorID(Integer txtPais);

	//Obtiene todas las presonas
	public ArrayList<Paises> obtenerPaises();

	//Elimina una presona a aprtir del dni
	public void eliminarPais(String txtPais);

	//Actualiza los datos de una persona
	public void actualizarPais(Paises pais);
	
}
