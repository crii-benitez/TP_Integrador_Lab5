package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Generos;

public interface IGeneroDAO {
	//Obtiene Genero por id
	public Generos obtenerGeneroPorId(int idGenero);

	//Obtiene todas los Generos
	public ArrayList<Generos> obtenerGeneros();
	
	//Alta de Genero
	public void insertarGenero(Generos genero);
	
	//Elimina un Genero por id
	public void eliminarGenero(int idGenero);

	//Actualiza los datos de un Genero
	public void actualizarGenero(Generos genero);
}
