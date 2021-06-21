package com.SiGeBan.models.services;

import org.hibernate.Session;

import com.SiGeBan.models.dao.ConfigHibernate;
import com.SiGeBan.models.entity.*;

public class initDB {
	public static void main(String[] args) {

		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();

		/*
		 * generacion de datos
		 */
		/*--------------Carga de Paises en la base-------------*/
		Paises pais01 = new Paises("Argentina");
		Paises pais02 = new Paises("Brasil");
		Paises pais03 = new Paises("Uruguay");
		Paises pais04 = new Paises("Chile");
		Paises pais05 = new Paises("Bolivia");
		Paises pais06 = new Paises("Colombia");
		Paises pais07 = new Paises("Venezuela");
		Paises pais08 = new Paises("Peru");
		Paises pais09 = new Paises("El Salvador");
		Paises pais10 = new Paises("Mexico");
		session.save(pais01);
		session.save(pais02);
		session.save(pais03);
		session.save(pais04);
		session.save(pais05);
		session.save(pais06);
		session.save(pais07);
		session.save(pais08);
		session.save(pais09);
		session.save(pais10);		
		/*--------------Carga de provincias en la base------*/
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
		/*---------------Carga de Localidades en la base-------*/
		Localidades localidad01 = new Localidades("");
		Localidades localidad02 = new Localidades();
		Localidades localidad03 = new Localidades();
		Localidades localidad04 = new Localidades();
		Localidades localidad05 = new Localidades();
		Localidades localidad06 = new Localidades();
		Localidades localidad07 = new Localidades();
		Localidades localidad08 = new Localidades();
		Localidades localidad09 = new Localidades();
		Localidades localidad10 = new Localidades();
		
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

		// cierre de transacciones
		ch.cerrarSession();
	}

	public initDB() {
		// TODO Auto-generated constructor stub
	}

}
