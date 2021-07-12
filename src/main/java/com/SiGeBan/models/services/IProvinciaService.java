package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Provincias;

public interface IProvinciaService {

	ArrayList<Provincias> obtenerProvincias();

	Provincias obtenerUnProvincia(Integer ID);

	void insertarProvincia(Provincias provincia);

    void eliminarProvincia(String nombre) ;

	void actualizarProvincia(Provincias provincia);
	
}
