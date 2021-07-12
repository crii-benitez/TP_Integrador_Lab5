package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Perfiles;

public class PerfilDAO implements IPerfilDAO  {
	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Perfiles obtenePerfilPorId(int idPerfil) {
		// TODO Auto-generated method stub
		try {
			return (Perfiles) this.hibernateTemplate.find("FROM Perfiles p WHERE p.idPerfil = ?",idPerfil).get(0);
			}
			catch (Exception E) {
				return null;
			}
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Perfiles> obtenerPerfiles() {
		// TODO Auto-generated method stub
		return (ArrayList<Perfiles>) this.hibernateTemplate.loadAll(Perfiles.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarPerfil(Perfiles perfil) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(perfil);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarPerfil(int idPerfil) {
		// TODO Auto-generated method stub
		Perfiles perfil= new Perfiles();
		perfil.setIdPerfil(idPerfil);
		this.hibernateTemplate.delete(perfil);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarPerfil(Perfiles perfil) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(perfil);
	}

}
