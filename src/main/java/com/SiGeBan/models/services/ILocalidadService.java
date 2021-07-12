package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Localidades;

public interface ILocalidadService {

	ArrayList<Localidades> obtenerLocalidades();

	Localidades obtenerUnLocalidad(String nombre);

	void insertarLocalidad(Localidades localidad);

    void eliminarLocalidad(String nombre) ;

	void actualizarLocalidad(Localidades localidad);
	
}
