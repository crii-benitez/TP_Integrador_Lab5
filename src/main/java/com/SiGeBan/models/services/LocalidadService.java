package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.ILocalidadDAO;
import main.java.com.SiGeBan.models.entity.Localidades;


@Service
public class LocalidadService implements ILocalidadService{
	
	@Autowired
	private ILocalidadDAO iLocalidadDAO = null;

	
	
	public ILocalidadDAO getiLocalidadDAO() {
		return iLocalidadDAO;
	}

	public void setiLocalidadDAO(ILocalidadDAO iLocalidadDAO) {
		this.iLocalidadDAO = iLocalidadDAO;
	}

	@Override
	public ArrayList<Localidades> obtenerLocalidades() {
		return iLocalidadDAO.obtenerLocalidades();
	}

	@Override
	public Localidades obtenerUnLocalidad(String txtLocalidad) {
		return iLocalidadDAO.obtenerLocalidadPorNombre(txtLocalidad);
	}

	@Override
	public void insertarLocalidad(Localidades localidad) {
		 iLocalidadDAO.insertarLocalidad(localidad);
		
	}

	@Override
	public void eliminarLocalidad(String nombre) {
		iLocalidadDAO.eliminarLocalidad(nombre);
		
	}

	@Override
	public void actualizarLocalidad(Localidades localidad) {
		iLocalidadDAO.actualizarLocalidad(localidad);
		
	}

}
