package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Personas;

public interface IPersonaService {

	ArrayList<Personas> obtenerPersonas();

	Personas obtenerUnRegistro(String txtDni);

	void insertarPersona(Personas persona);

    void eliminarPersona(int dni) ;

	void actualizarPersona(Personas persona);
	
}
