package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Usuario;

public interface IUsuarioDAO {
	//Alta de persona
	public void insertarUsuario(Usuario usuario);

	//Obtiene una persona por dni
	public Usuario obtenerUsuarioPorNombre(String txtUsuario);

	//Obtiene todas las presonas
	public ArrayList<Usuario> obtenerUsuarios();

	//Elimina una presona a aprtir del dni
	public void eliminarUsuario(Long idUsuario);

	//Actualiza los datos de una persona
	public void actualizarUsuario(Usuario usuario);

	//Elimina logicamente un usuario
	void borrarLogicamente(Usuario uuario);
}
