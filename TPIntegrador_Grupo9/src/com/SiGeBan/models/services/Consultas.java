package com.SiGeBan.models.services;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.SiGeBan.models.dao.ConfigHibernate;
import com.SiGeBan.models.entity.*;

public class Consultas {
	//@Autowired
	private static UsuariosService usuarioService;
	public static void main(String[] args) {
		prueba1();
	}
	public static void prueba1() {
		Usuarios usuario = new Usuarios();
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		session.beginTransaction();
		usuario = (Usuarios) session.createQuery("FROM Usuarios u WHERE u.usuario = " + "'administrador'").uniqueResult();
		System.out.println(usuario.toString());
	}
	public static void prueba2(){
		Usuarios usuario = new Usuarios();
		usuario = (Usuarios) usuarioService.obtenerUsuariosPorUsuario("administrador");
		System.out.println(usuario.toString());
	}
}