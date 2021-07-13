package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Personas;


public interface IPersonaDAO {
	//Alta de persona
	public void insertarPersona(Personas persona);
	
	//Obtener Datos Personales
	public Personas ObtenerDatosPersonales(String usuario);
	
	//Obtiene una persona por dni
	public Personas obtenerPersonaPorUsuario(String txtDNI);

	//Obtiene todas las presonas
	public ArrayList<Personas> obtenerPersonas();

	//Elimina una presona a aprtir del dni
	public void eliminarPersona(String dni);

	//Actualiza los datos de una persona
	public void actualizarPersona(Personas persona);
	
}
