package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Paises;

public interface IPaisService {

	ArrayList<Paises> obtenerPaises();

	Paises obtenerUnPais(String nombre);

	void insertarPais(Paises pais);

    void eliminarPais(String nombre) ;

	void actualizarPais(Paises pais);
	
}
