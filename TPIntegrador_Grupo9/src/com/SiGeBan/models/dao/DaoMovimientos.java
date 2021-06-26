package com.SiGeBan.models.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SiGeBan.models.entity.Movimientos;

@Repository("daoMovimientos")
public class DaoMovimientos {
	@Autowired
	private ConfigHibernate conexion;
	
	public List<?> listarMovimientos() {
		Session session = conexion.abrirConexion();
		session.beginTransaction();
		String hql= "FROM Movimientos";
		List<?> results=  session.createQuery(hql).list();
		session.close();
		return results;
	}
	
	public boolean agregarMovimiento(Movimientos m) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		boolean aux = true;
		try
		{
			session.save(m); 
			tx = session.getTransaction();
			tx.commit();
		}
		catch (Exception e) {
			aux=false;
			tx.rollback();
		}
		conexion.cerrarSession();
		return aux;
	}

}
