package com.SiGeBan.models.dao;


import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.SiGeBan.models.entity.Usuarios;

public class UsuariosDAO {

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarUsuario(Usuarios usuario) {
		this.hibernateTemplate.save(usuario);
		
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Usuarios obtenerUsuarioPorNombre(String usuario) {
		return this.hibernateTemplate.get(Usuarios.class, usuario);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Usuarios> obtenerUsuarios() {
		return (ArrayList<Usuarios>) this.hibernateTemplate.loadAll(Usuarios.class);
	}

	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarUsuario(Long idUsuario) {
		Usuarios user = new Usuarios();
		user.setIdUsuario(idUsuario);
		this.hibernateTemplate.delete(user);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarUsuario(Usuarios persona) {
		this.hibernateTemplate.update(persona);
	}
	
	public Usuarios prueba1(String algo, String algoPass) {
		Usuarios usuario = new Usuarios();
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		session.beginTransaction();
		try {
		usuario = (Usuarios) session.createQuery("FROM Usuarios u WHERE u.usuario = " + "'"+algo+"'" + " and u.pass = " + "'"+algoPass+"'").uniqueResult();
		
		}
		catch (Exception e) {
			usuario.setUsuario("-1");
		}
		//System.out.println(usuario.toString());
//		return session.createQuery("FROM Usuarios u WHERE u.usuario = " + "'"+algo+"'").list().toString();
		//return (Usuarios) session.createQuery("FROM Usuarios u WHERE u.usuario = " + "'"+algo+"'");
		return usuario;
		
		
		
	}

//	public Usuarios obtenerUsuariosPorUsuario(String usser) {
//		usuario = new Usuarios();
//		ch = new ConfigHibernate();
//		session = ch.abrirConexion();
//		session.beginTransaction();
//		usuario = (Usuarios) session.createQuery("FROM Usuarios u WHERE u.usuario = " + "'" + usser + "'")
//				.uniqueResult();
//		System.out.println(usuario.toString());
//		ch.cerrarSession();
//		return usuario;
//	}
	
//	private HibernateTemplate hibernateTemplate = null;
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
//    }
//
//	@Transactional(propagation=Propagation.REQUIRED)
//	public void insertarUsuario(Usuarios Usuarios) {
//		this.hibernateTemplate.save(Usuarios);
//		
//	}
//
//	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
//	public Usuarios obtenerUsuarioPorNombre(String nombreusuario) {
//		return this.hibernateTemplate.get(Usuarios.class, nombreusuario);
//	}
//
//	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
//	public ArrayList<Usuarios> obtenerUsuarios() {
//		return (ArrayList<Usuarios>) this.hibernateTemplate.loadAll(Usuarios.class);
//	}
//
//	
//	@Transactional(propagation=Propagation.REQUIRES_NEW)
//	public void eliminarUsuario(Long idUsuario) {
//		Usuarios usuario = new Usuarios();
//		usuario.setIdUsuario(idUsuario);
//		this.hibernateTemplate.delete(usuario);
//	}
//
//	@Transactional(propagation=Propagation.REQUIRED)
//	public void actualizarUsuario(Usuarios persona) {
//		this.hibernateTemplate.update(persona);
//	}
//	public UsuariosDAO() {
//		// TODO Auto-generated constructor stub
//	}

}
