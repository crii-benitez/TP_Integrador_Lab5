package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Usuario;

public interface IUsuarioService {

	ArrayList<Usuario> obtenerUsuarios();

	Usuario obtenerUnRegistro(String txtUsuario);

	void insertarUsuario(Usuario usuario);

    void eliminarUsuario(Long idUsuario) ;

	void actualizarUsuario(Usuario usuario);

	void borrarLogicamente(Usuario usuario);
}
