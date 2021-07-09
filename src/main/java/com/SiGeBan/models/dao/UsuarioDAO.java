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
		return (Usuario) this.hibernateTemplate.find("FROM Usuario u WHERE u.usuario = ?",txtUsuario).get(0);
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
	
//	public Usuario prueba1(String algo, String algoPass) {
//		Usuario usuario = new Usuario();
//		ConfigHibernate ch = new ConfigHibernate();
//		Session session = ch.abrirConexion();
//		session.beginTransaction();
//		try {
//		usuario = (Usuario) session.createQuery("FROM Usuario u WHERE u.usuario = " + "'"+algo+"'" + " and u.pass = " + "'"+algoPass+"'").uniqueResult();
//		
//		}
//		catch (Exception e) {
//			usuario.setUsuario("-1");
//		}
//		//System.out.println(usuario.toString());
////		return session.createQuery("FROM Usuario u WHERE u.usuario = " + "'"+algo+"'").list().toString();
//		//return (Usuario) session.createQuery("FROM Usuario u WHERE u.usuario = " + "'"+algo+"'");
//		return usuario;
//		
//		
//		
//	}


//	public Usuario obtenerUsuariosPorUsuario(String usser) {
//		usuario = new Usuario();
//		ch = new ConfigHibernate();
//		session = ch.abrirConexion();
//		session.beginTransaction();
//		usuario = (Usuario) session.createQuery("FROM Usuario u WHERE u.usuario = " + "'" + usser + "'")
//				.uniqueResult();
//		System.out.println(usuario.toString());
//		ch.cerrarSession();
//		return usuario;
//	}
}
