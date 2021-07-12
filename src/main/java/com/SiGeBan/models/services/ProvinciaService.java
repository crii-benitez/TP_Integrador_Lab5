package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IProvinciaDAO;
import main.java.com.SiGeBan.models.entity.Provincias;

@Service
public class ProvinciaService implements IProvinciaService{
	
	@Autowired
	private IProvinciaDAO iProvinciaDAO = null;

	
	
	public IProvinciaDAO getiProvinciaDAO() {
		return iProvinciaDAO;
	}

	public void setiProvinciaDAO(IProvinciaDAO iProvinciaDAO) {
		this.iProvinciaDAO = iProvinciaDAO;
	}

	@Override
	public ArrayList<Provincias> obtenerProvincias() {
		return iProvinciaDAO.obtenerProvincias();
	}

	@Override
	public Provincias obtenerUnProvincia(Integer txtProvincia) {
		return iProvinciaDAO.obtenerProvinciaPorID(txtProvincia);
	}

	@Override 
	public void insertarProvincia(Provincias Provincia) {
		 iProvinciaDAO.insertarProvincia(Provincia);
		
	}

	@Override
	public void eliminarProvincia(String nombre) {
		iProvinciaDAO.eliminarProvincia(nombre);
		
	}

	@Override
	public void actualizarProvincia(Provincias provincia) {
		iProvinciaDAO.actualizarProvincia(provincia);
		
	}

}
