package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Personas;

public interface IPersonaService {
	Personas ObtenerDatosPersonales(String usuario);

	ArrayList<Personas> obtenerPersonas();

	Personas obtenerUnRegistro(String txtDni);

	void insertarPersona(Personas persona);

    void eliminarPersona(String dni) ;

	void actualizarPersona(Personas persona);
	
}
