package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Perfiles;

public interface IPerfilService {
	Perfiles obtenePerfilPorId(int idPerfil);

	ArrayList<Perfiles> obtenerPerfiles();
	
	void insertarPerfil(Perfiles perfil);
	
	void eliminarPerfil(int idPerfil);

	void actualizarPerfil(Perfiles perfil);
}
