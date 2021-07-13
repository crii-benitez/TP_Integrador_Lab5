package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IPersonaDAO;
import main.java.com.SiGeBan.models.dao.IUsuarioDAO;
import main.java.com.SiGeBan.models.dao.UsuarioDAO;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.Usuario;

@Service
public class PersonaService implements IPersonaService{
	
	@Autowired
	private IPersonaDAO iPersonaDAO = null;

	
	
	public IPersonaDAO getiPersonaDAO() {
		return iPersonaDAO;
	}

	public void setiPersonaDAO(IPersonaDAO iPersonaDAO) {
		this.iPersonaDAO = iPersonaDAO;
	}

	@Override
	public ArrayList<Personas> obtenerPersonas() {
		return iPersonaDAO.obtenerPersonas();
	}

	@Override
	public Personas obtenerUnRegistro(String txtDni) {
		return iPersonaDAO.obtenerPersonaPorUsuario(txtDni);
	}

	@Override
	public Personas ObtenerDatosPersonales(String usuario) {
		// TODO Auto-generated method stub
		return iPersonaDAO.ObtenerDatosPersonales(usuario);
	}
	
	@Override
	public void insertarPersona(Personas persona) {
		 iPersonaDAO.insertarPersona(persona);
		
	}

	@Override
	public void eliminarPersona(String dni) {
		iPersonaDAO.eliminarPersona(dni);
		
	}

	@Override
	public void actualizarPersona(Personas persona) {
		iPersonaDAO.actualizarPersona(persona);
		
	}

	@Override
	public Personas obtenerPersonaPorId(int idPersona) {
		return iPersonaDAO.obtenerPersonaPorId(idPersona);
	}

}
