package com.SiGeBan.models.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.SiGeBan.entity.*;;

public class initDB {
	public static void main(String[] args) {

		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
				.buildServiceRegistry();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		/*
		 * generacion de datos
		 */
		Usuarios user01 = new Usuarios("usuarioBanco01", "claveBanco");
		Usuarios user02 = new Usuarios("usuarioBanco02", "claveBanco");
		Usuarios user03 = new Usuarios("usuarioCliente01", "claveCliente");
		Usuarios user04 = new Usuarios("usuarioCliente02", "claveCliente");
		Usuarios user05 = new Usuarios("usuarioCliente03", "claveCliente");
		Usuarios user06 = new Usuarios("usuarioCliente04", "claveCliente");
		Usuarios user07 = new Usuarios("usuarioCliente05", "claveCliente");
		Usuarios user08 = new Usuarios("usuarioCliente06", "claveCliente");
		Usuarios user09 = new Usuarios("usuarioCliente07", "claveCliente");
		Usuarios user10 = new Usuarios("usuarioCliente08", "claveCliente");
		session.save(user01);
		session.save(user02);
		session.save(user03);
		session.save(user04);
		session.save(user05);
		session.save(user06);
		session.save(user07);
		session.save(user08);
		session.save(user09);
		session.save(user10);
		
		

		
		//cierre de transacciones
    	session.getTransaction().commit();
    	session.close();
    	sessionFactory.close();
	}

	public initDB() {
		// TODO Auto-generated constructor stub
	}

}
