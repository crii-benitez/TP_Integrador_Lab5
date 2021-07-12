package main.java.com.SiGeBan.models.dao;


import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Paises;
import main.java.com.SiGeBan.models.entity.Usuario;

public class PaisDAO implements IPaisDAO{

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarPais(Paises pais) {
		this.hibernateTemplate.save(pais);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Paises obtenerPaisPorNombre(String txtPais) {
		try {
		return (Paises) this.hibernateTemplate.find("FROM Paises u WHERE u.pais = ?",txtPais).get(0);
		}
		catch (Exception E) {
			return null;
		}
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Paises> obtenerPaises() {
		return (ArrayList<Paises>) this.hibernateTemplate.loadAll(Paises.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarPais(String txtPais) {
		Paises pais = new Paises();
		this.hibernateTemplate.delete(pais);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarPais(Paises pais) {
		this.hibernateTemplate.update(pais);
	}
	

}
