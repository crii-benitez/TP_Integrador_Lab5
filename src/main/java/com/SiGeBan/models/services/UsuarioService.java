package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IUsuarioDAO;
import main.java.com.SiGeBan.models.dao.UsuarioDAO;
import main.java.com.SiGeBan.models.entity.Usuario;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuarioDAO iUsuarioDAO = null;

	public IUsuarioDAO getiUsuarioDAO() {
		return iUsuarioDAO;
	}

	public void setiUsuarioDAO(IUsuarioDAO iUsuarioDAO) {
		this.iUsuarioDAO = iUsuarioDAO;
	}

	@Override
	public ArrayList<Usuario> obtenerUsuarios() {
		return iUsuarioDAO.obtenerUsuarios();
	}

	@Override
	public Usuario obtenerUnRegistro(String txtUsuario) {
		return iUsuarioDAO.obtenerUsuarioPorNombre(txtUsuario);
	}

	@Override
	public void insertarUsuario(Usuario usuario) {
		iUsuarioDAO.insertarUsuario(usuario);

	}

	@Override
	public void eliminarUsuario(Long idUsuario) {
		iUsuarioDAO.eliminarUsuario(idUsuario);

	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		iUsuarioDAO.actualizarUsuario(usuario);
	}

	@Override
	public void borrarLogicamente(Usuario usuario) {
		iUsuarioDAO.borrarLogicamente(usuario);
	}
}
