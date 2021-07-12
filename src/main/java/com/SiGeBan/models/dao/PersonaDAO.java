package main.java.com.SiGeBan.models.dao;


import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Personas;

public class PersonaDAO implements IPersonaDAO{

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarPersona(Personas persona) {
		this.hibernateTemplate.save(persona);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Personas obtenerPersonaPorUsuario(String txtDNI) {
		try {
		return (Personas) this.hibernateTemplate.find("FROM Personas p WHERE p.DNI = ?",txtDNI).get(0);
		}
		catch (Exception E) {
			return null;
		}
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Personas> ObtenerDatosPersonales(String usuario) {
		// TODO Auto-generated method stub
		try {
		return (ArrayList<Personas>) this.hibernateTemplate.find("SELECT p.DNI, p.nombre, p.apellido, p.direccion, l.localidad, pr.provincia" + 
				"FROM Personas as p " + 
				"inner join Usuario as u on u.idUsuario=p.usuario" + 
				"inner join Localidades as l on l.idLocalidad=p.localidad" + 
				"inner join Provincias as pr on pr.idProvincia=p.provincia" + 
				"where u.usuario = ?",usuario).get(0);
		}
		catch (Exception E) {
			return null;
		}
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Personas> obtenerPersonas() {
		return (ArrayList<Personas>) this.hibernateTemplate.loadAll(Personas.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarPersona(String dni) {
		Personas persona = new Personas();
		persona.setDNI(dni);
		this.hibernateTemplate.delete(persona);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarPersona(Personas persona) {
		this.hibernateTemplate.update(persona);
	}

}
