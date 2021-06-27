package com.SiGeBan.models.services;

import java.util.ArrayList;

import com.SiGeBan.models.dao.UsuariosDAO;
import com.SiGeBan.models.entity.Usuarios;

public class UsuariosService {
	
	private UsuariosDAO usuarioDAO;

	public Usuarios obtenerUsuarioPorUsuario(String usser) {
		return new Usuarios();
	}
	//
//	public void setDataAccess(UsuariosDAO dataAccess) {
//		this.dataAccess = dataAccess;
//	}
//	
//	public ArrayList<Usuarios> obtenerUsuarioss() {
//		return dataAccess.obtenerUsuarios();
//	}
////
//	public Usuarios obtenerUnRegistro(String nombreUser) {
//		return dataAccess.obtenerUsuariosPorNombre(nombreUser);
//	}
//
//	public void insertarUsuarios(Usuarios usuario) {
//		 dataAccess.insertarUsuarios(usuarios);
//		
//	}
//
//	public void eliminarUsuarios(Integer idUser) {
//		dataAccess.eliminarUsuarios(idUser);
//		
//	}
//
//	public void actualizarUsuarios(Usuarios usuario) {
//		dataAccess.actualizarUsuarios(usuario);
//		
//	}

}
