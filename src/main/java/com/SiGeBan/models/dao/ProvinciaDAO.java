package main.java.com.SiGeBan.models.dao;


import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Paises;
import main.java.com.SiGeBan.models.entity.Provincias;
import main.java.com.SiGeBan.models.entity.Usuario;

public class ProvinciaDAO implements IProvinciaDAO{

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarProvincia(Provincias provincia) {
		this.hibernateTemplate.save(provincia);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Provincias obtenerProvinciaPorID(Integer txtProvincia) {
		try {
		return (Provincias) this.hibernateTemplate.find("FROM Provincias u WHERE u.idProvincia = ?",txtProvincia).get(0);
		}
		catch (Exception E) {
			return null;
		}
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Provincias> obtenerProvincias() {
		return (ArrayList<Provincias>) this.hibernateTemplate.loadAll(Provincias.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarProvincia(String txtProvincias) {
		Provincias provincia = new Provincias();
		this.hibernateTemplate.delete(provincia);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarProvincia(Provincias provincia) {
		this.hibernateTemplate.update(provincia);
	}
	

}
