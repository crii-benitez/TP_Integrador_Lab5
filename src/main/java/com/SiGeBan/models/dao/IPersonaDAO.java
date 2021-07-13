package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Personas;


public interface IPersonaDAO {
	//Alta de persona
	void insertarPersona(Personas persona);
	
	//Obtener Datos Personales
	Personas ObtenerDatosPersonales(String usuario);
	
	//Obtiene una persona por dni
	Personas obtenerPersonaPorUsuario(String txtDNI);

	//Obtiene todas las presonas
	ArrayList<Personas> obtenerPersonas();

	//Elimina una presona a aprtir del dni
	void eliminarPersona(String dni);

	//Actualiza los datos de una persona
	void actualizarPersona(Personas persona);

	Personas obtenerPersonaPorId(int idPersona);
	
}
