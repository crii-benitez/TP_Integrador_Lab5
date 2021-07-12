package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Generos;

public interface IGeneroService {
	Generos obtenerGeneroPorId(int idGenero);

	ArrayList<Generos> obtenerGeneros();
	
	void insertarGenero(Generos genero);
	
	void eliminarGenero(int idGenero);
	
	void actualizarGenero(Generos genero);
}
