package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IPerfilDAO;
import main.java.com.SiGeBan.models.entity.Perfiles;
@Service
public class PerfilService implements IPerfilService {
	@Autowired
	private IPerfilDAO iPerfilDAO = null;

	@Override
	public Perfiles obtenePerfilPorId(int idPerfil) {
		// TODO Auto-generated method stub
		return iPerfilDAO.obtenePerfilPorId(idPerfil);
	}

	@Override
	public ArrayList<Perfiles> obtenerPerfiles() {
		// TODO Auto-generated method stub
		return iPerfilDAO.obtenerPerfiles();
	}

	@Override
	public void insertarPerfil(Perfiles perfil) {
		// TODO Auto-generated method stub
		iPerfilDAO.insertarPerfil(perfil);
	}

	@Override
	public void eliminarPerfil(int idPerfil) {
		// TODO Auto-generated method stub
		iPerfilDAO.eliminarPerfil(idPerfil);
	}

	@Override
	public void actualizarPerfil(Perfiles perfil) {
		// TODO Auto-generated method stub
		iPerfilDAO.actualizarPerfil(perfil);
	}

}
