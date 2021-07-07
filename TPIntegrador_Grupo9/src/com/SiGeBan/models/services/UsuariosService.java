package com.SiGeBan.models.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.SiGeBan.models.dao.UsuariosDAO;
import com.SiGeBan.models.entity.Usuarios;

public class UsuariosService implements IUsuariosService{
	
	@Autowired
	private UsuariosDAO usuarioDAO = null;
	
	@Override
	public Usuarios prueba1(String algo, String algoPass) {
		return usuarioDAO.prueba1(algo, algoPass);
	}
	public UsuariosService() {
		// TODO Auto-generated constructor stub
	}

	public UsuariosDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuariosDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}


}
