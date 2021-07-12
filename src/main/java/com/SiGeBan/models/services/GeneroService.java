package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IGeneroDAO;
import main.java.com.SiGeBan.models.entity.Generos;

@Service
public class GeneroService implements IGeneroService {
	@Autowired
	private IGeneroDAO iGeneroDAO=null;

	@Override
	public Generos obtenerGeneroPorId(int idGenero) {
		// TODO Auto-generated method stub
		return iGeneroDAO.obtenerGeneroPorId(idGenero);
	}

	@Override
	public ArrayList<Generos> obtenerGeneros() {
		// TODO Auto-generated method stub
		return iGeneroDAO.obtenerGeneros();
	}

	@Override
	public void insertarGenero(Generos genero) {
		// TODO Auto-generated method stub
		iGeneroDAO.insertarGenero(genero);
	}

	@Override
	public void eliminarGenero(int idGenero) {
		// TODO Auto-generated method stub
		iGeneroDAO.eliminarGenero(idGenero);
	}

	@Override
	public void actualizarGenero(Generos genero) {
		// TODO Auto-generated method stub
		iGeneroDAO.actualizarGenero(genero);
	}
}
