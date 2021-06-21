package com.SiGeBan.models.services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.SiGeBan.entity.*;
import com.SiGeBan.models.dao.ConfigHibernate;;

public class initDB {
	public static void main(String[] args) {

		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();

		/*
		 * generacion de datos
		 */

		/*---------------Carga de Usuarios en la base------------------*/
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
		/*------------------Carga de Perfiles en la base-------*/
		Perfiles perfil01 = new Perfiles("bancario");
		Perfiles perfil02 = new Perfiles("cliente");
		Perfiles perfil03 = new Perfiles("administrador");
		session.save(perfil01);
		session.save(perfil02);
		session.save(perfil03);
		/*--------------Cargga de Tipos de Cuentas en la base--*/
		TipoDeCuenta tipoDeCuenta01 = new TipoDeCuenta("CAP","Caja de Ahorro en Pesos");
		TipoDeCuenta tipoDeCuenta02 = new TipoDeCuenta("CAD","Caja de Ahorro en Dolares");
		TipoDeCuenta tipoDeCuenta03 = new TipoDeCuenta("CCP","Cuenta Corriente en Pesos");
		TipoDeCuenta tipoDeCuenta04 = new TipoDeCuenta("CCD","Cuenta Corriente en Dolares");
		session.save(tipoDeCuenta01);
		session.save(tipoDeCuenta02);
		session.save(tipoDeCuenta03);
		session.save(tipoDeCuenta04);
		/*-----------------------------------------------------*/
		Provincias provincia01 = new Provincias("Buenos Aires");
		Provincias provincia02 = new Provincias("Ciudad Autonoma de Buenos Aires");
		Provincias provincia03 = new Provincias("Santa Fe");
		Provincias provincia04 = new Provincias("Cordoba");
		Provincias provincia05 = new Provincias("Jujuy");
		Provincias provincia06 = new Provincias("Chaco");
		Provincias provincia07 = new Provincias("Misiones");
		Provincias provincia08 = new Provincias("Santa Cruz");
		Provincias provincia09 = new Provincias("Rio Negro");
		Provincias provincia10 = new Provincias("Mendoza");
		session.save(provincia01);
		session.save(provincia02);
		session.save(provincia03);
		session.save(provincia04);
		session.save(provincia05);
		session.save(provincia06);
		session.save(provincia07);
		session.save(provincia08);
		session.save(provincia09);
		session.save(provincia10);
		/*-----------------------------------------------------*/

		/*-----------------------------------------------------*/

		/*-----------------------------------------------------*/

		/*-----------------------------------------------------*/

		/*-----------------------------------------------------*/

		/*-----------------------------------------------------*/

		/*-----------------------------------------------------*/

		// cierre de transacciones
		ch.cerrarSession();
	}

	public initDB() {
		// TODO Auto-generated constructor stub
	}

}
