package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Personas;

public class PersonaDAO implements IPersonaDAO {

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertarPersona(Personas persona) {
		this.hibernateTemplate.save(persona);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Personas obtenerPersonaPorId(int idPersona) {
		return this.hibernateTemplate.get(Personas.class, idPersona);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Personas obtenerPersonaPorUsuario(String txtDNI) {
		try {
			return (Personas) this.hibernateTemplate
					.find("FROM Personas p WHERE p.usuario.activo = true and p.DNI = ?", txtDNI).get(0);
		} catch (Exception E) {
			return null;
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Personas ObtenerDatosPersonales(String usuario) {
		// TODO Auto-generated method stub
		try {
			return (Personas) this.hibernateTemplate
					.find("FROM Personas p WHERE p.usuario.activo = true and p.usuario.usuario = ?", usuario).get(0);
		} catch (Exception E) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ArrayList<Personas> obtenerPersonas() {
		return (ArrayList<Personas>) this.hibernateTemplate.find("FROM Personas p WHERE p.usuario.activo = true");

		// .loadAll(Personas.class);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void eliminarPersona(String dni) {
		Personas persona = new Personas();
		persona.setDNI(dni);
		this.hibernateTemplate.delete(persona);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void actualizarPersona(Personas persona) {
		this.hibernateTemplate.update(persona);
	}

}
