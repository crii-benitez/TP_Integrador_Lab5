package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

//import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Movimientos;
import main.java.com.SiGeBan.models.entity.Usuario;

public class DaoMovimientos {
//	private HibernateTemplate hibernateTemplate = null;
//	
//	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
//	public Movimientos obtenerMovimientos(Integer m) {
//		return this.hibernateTemplate.get(Movimientos.class, m);
//	}
//	public String prueba1() {
//		ConfigHibernate ch = new ConfigHibernate();
//		Session session = ch.abrirConexion();
//		session.beginTransaction();
//		System.out.println("dentro de prueba1 prueba1");
//		return session.createQuery("select detalle FROM Movimientos where idmovimiento=1").toString();
//	}
//	public String prueba2() {
//		ConfigHibernate ch = new ConfigHibernate();
//		System.out.println("Inicio DaoMovimientos Metodo prueba2");
//		Session session = ch.abrirConexion();
//		session.beginTransaction();
//		System.out.println("Fin DaoMovimientos Metodo prueba2");
//		return session.createQuery("select nombreDeTipoDeCuenta FROM TiposDeCuentas where idTipoDeCuenta=1").list().toString();
//		//return "Devuelto por DaoMovimientos Metodo prueba2";
//	}
//	public ArrayList<Movimientos> ListarMovimientos() {
//		ConfigHibernate ch = new ConfigHibernate();
//		Session session = ch.abrirConexion();
//		session.beginTransaction();
//		System.out.println("En DaoMovimientos 'ListarMovimientos': antes de cargar el listado");
//		Query query=session.createQuery("FROM Movimientos");
//		ArrayList<Movimientos> lm =(ArrayList<Movimientos>) query.list();
//		System.out.println("En DaoMovimientos 'ListarMovimientos': " + lm.toString());
//		return lm;
//	}
/*
	@Autowired
	private ConfigHibernate conexion;
	public List<Movimientos> listarMovimientos() {
		Session session = conexion.abrirConexion();
		session.beginTransaction();
		String hql= "FROM Movimientos";
		Query query= session.createQuery(hql);
		List<Movimientos> results= (List<Movimientos>) query.list();  
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
*/
}
