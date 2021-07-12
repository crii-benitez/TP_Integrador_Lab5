package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Generos;

public class GeneroDAO implements IGeneroDAO  {
	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Generos obtenerGeneroPorId(int idGenero) {
		// TODO Auto-generated method stub
		try {
			return (Generos) this.hibernateTemplate.find("FROM Generos p WHERE p.idGenero = ?",idGenero).get(0);
			}
			catch (Exception E) {
				return null;
			}
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Generos> obtenerGeneros() {
		// TODO Auto-generated method stub
		return (ArrayList<Generos>) this.hibernateTemplate.loadAll(Generos.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarGenero(Generos genero) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(genero);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarGenero(int idGenero) {
		// TODO Auto-generated method stub
		Generos perfil= new Generos();
		perfil.setIdGenero(idGenero);
		this.hibernateTemplate.delete(idGenero);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarGenero(Generos genero) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(genero);
	}

}

