package main.java.com.SiGeBan.models.dao;


import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Usuario;

public class UsuarioDAO implements IUsuarioDAO{

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarUsuario(Usuario usuario) {
		this.hibernateTemplate.save(usuario);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Usuario obtenerUsuarioPorNombre(String txtUsuario) {
		try {
		return (Usuario) this.hibernateTemplate.find("FROM Usuario u WHERE u.activo = true and u.usuario = ?",txtUsuario).get(0);
		}
		catch (Exception E) {
			return null;
		}
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Usuario> obtenerUsuarios() {
		return (ArrayList<Usuario>) this.hibernateTemplate.loadAll(Usuario.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarUsuario(Long idUsuario) {
		Usuario user = new Usuario();
		user.setIdUsuario(idUsuario);
		this.hibernateTemplate.delete(user);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarUsuario(Usuario usuario) {
		this.hibernateTemplate.update(usuario);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void borrarLogicamente(Usuario usuario) {
		this.hibernateTemplate.update(usuario);
	}
}
