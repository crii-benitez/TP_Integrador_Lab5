package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Perfiles;

public interface IPerfilDAO {
	//Obtiene Perfil por id
	public Perfiles obtenePerfilPorId(int idPerfil);

	//Obtiene todas los Perfiles
	public ArrayList<Perfiles> obtenerPerfiles();
	
	//Alta de Perfil
	public void insertarPerfil(Perfiles perfil);
	
	//Elimina un Perfil por id
	public void eliminarPerfil(int idPerfil);

	//Actualiza los datos de un Perfil
	public void actualizarPerfil(Perfiles perfil);
}
