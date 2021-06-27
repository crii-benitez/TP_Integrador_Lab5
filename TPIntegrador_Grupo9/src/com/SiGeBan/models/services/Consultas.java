package com.SiGeBan.models.services;

import org.hibernate.Session;

import com.SiGeBan.models.dao.ConfigHibernate;
import com.SiGeBan.models.entity.*;

public class Consultas {
	public static void main(String[] args) {
		Usuarios usuario = new Usuarios();
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		session.beginTransaction();
		usuario = (Usuarios) session.createQuery("FROM Usuarios u WHERE u.usuario = " + "'administrador'").uniqueResult();
		System.out.println(usuario.toString());
	}
}