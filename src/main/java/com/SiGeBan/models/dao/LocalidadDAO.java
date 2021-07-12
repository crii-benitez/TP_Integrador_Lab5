package main.java.com.SiGeBan.models.dao;


import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Paises;
import main.java.com.SiGeBan.models.entity.Localidades;

public class LocalidadDAO implements ILocalidadDAO{

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarLocalidad(Localidades localidad) {
		this.hibernateTemplate.save(localidad);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Localidades obtenerLocalidadPorNombre(String txtLocalidad) {
		try {
		return (Localidades) this.hibernateTemplate.find("FROM Localidades u WHERE u.localidad = ?",txtLocalidad).get(0);
		}
		catch (Exception E) {
			return null;
		}
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Localidades> obtenerLocalidades() {
		return (ArrayList<Localidades>) this.hibernateTemplate.loadAll(Localidades.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarLocalidad(String txtLocalidad) {
		Localidades localidad = new Localidades();
		this.hibernateTemplate.delete(localidad);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarLocalidad(Localidades localidad) {
		this.hibernateTemplate.update(localidad);
	}
	

}
