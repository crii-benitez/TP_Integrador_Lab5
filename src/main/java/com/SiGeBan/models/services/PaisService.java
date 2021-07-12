package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IPaisDAO;
import main.java.com.SiGeBan.models.dao.IPersonaDAO;
import main.java.com.SiGeBan.models.dao.IUsuarioDAO;
import main.java.com.SiGeBan.models.dao.UsuarioDAO;
import main.java.com.SiGeBan.models.entity.Paises;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.Usuario;

@Service
public class PaisService implements IPaisService{
	
	@Autowired
	private IPaisDAO iPaisDAO = null;

	
	
	public IPaisDAO getiPaisDAO() {
		return iPaisDAO;
	}

	public void setiPaisDAO(IPaisDAO iPaisDAO) {
		this.iPaisDAO = iPaisDAO;
	}

	@Override
	public ArrayList<Paises> obtenerPaises() {
		return iPaisDAO.obtenerPaises();
	}

	@Override
	public Paises obtenerUnPais(Integer txtPais) {
		return iPaisDAO.obtenerPaisPorID(txtPais);
	}

	@Override
	public void insertarPais(Paises pais) {
		 iPaisDAO.insertarPais(pais);
		
	}

	@Override
	public void eliminarPais(String nombre) {
		iPaisDAO.eliminarPais(nombre);
		
	}

	@Override
	public void actualizarPais(Paises pais) {
		iPaisDAO.actualizarPais(pais);
		
	}

}
