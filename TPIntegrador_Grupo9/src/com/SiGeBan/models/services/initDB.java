package com.SiGeBan.models.services;

import java.util.Date;
import java.time.LocalDate;
import java.sql.Timestamp;
import java.time.*;


import org.hibernate.Session;

import com.SiGeBan.models.dao.ConfigHibernate;
import com.SiGeBan.models.entity.*;

public class initDB {
	public static void main(String[] args) {

		//seteo la fecha para movimientos
		LocalDateTime ldt = LocalDateTime.now();
		Timestamp fechaAhora = Timestamp.valueOf(ldt);
		
		Date fecha = new Date();

		
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();

		/*
		 * generacion de datos
		 */

		/* DATASET = Paises */
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

		/* DATASET = Provincias */
		Provincias provincia01 = new Provincias("Buenos Aires", pais01);
		Provincias provincia02 = new Provincias("Ciudad Autonoma de Buenos Aires", pais01);
		Provincias provincia03 = new Provincias("Santa Fe", pais01);
		Provincias provincia04 = new Provincias("Cordoba", pais01);
		Provincias provincia05 = new Provincias("Jujuy", pais01);
		Provincias provincia06 = new Provincias("Chaco", pais01);
		Provincias provincia07 = new Provincias("Misiones", pais01);
		Provincias provincia08 = new Provincias("Santa Cruz", pais01);
		Provincias provincia09 = new Provincias("Rio Negro", pais01);
		Provincias provincia10 = new Provincias("Mendoza", pais01);
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

		/* DATASET = Localidades */
		Localidades localidad01 = new Localidades("Moreno", provincia01);
		Localidades localidad02 = new Localidades("Jose C Paz", provincia01);
		Localidades localidad03 = new Localidades("Posadas", provincia07);
		Localidades localidad04 = new Localidades("Mendoza", provincia10);
		Localidades localidad05 = new Localidades("Resistencia", provincia06);
		Localidades localidad06 = new Localidades("San Salvador de Jujuy", provincia05);
		Localidades localidad07 = new Localidades("Rafaela", provincia03);
		Localidades localidad08 = new Localidades("Rio Gallegos", provincia08);
		Localidades localidad09 = new Localidades("Bariloche", provincia09);
		Localidades localidad10 = new Localidades("Cordoba", provincia04);
		session.save(localidad01);
		session.save(localidad02);
		session.save(localidad03);
		session.save(localidad04);
		session.save(localidad05);
		session.save(localidad06);
		session.save(localidad07);
		session.save(localidad08);
		session.save(localidad09);
		session.save(localidad10);

		/* DATASET = Generos */
		Generos genero01 = new Generos("Masculino");
		Generos genero02 = new Generos("Femenino");
		Generos genero03 = new Generos("Indefinido");
		session.save(genero01);
		session.save(genero02);
		session.save(genero03);

		/* DATASET = TiposDeCuentas */
		TiposDeCuentas tipoDeCuenta01 = new TiposDeCuentas("CAP", "Caja de Ahorro en Pesos");
		TiposDeCuentas tipoDeCuenta02 = new TiposDeCuentas("CAD", "Caja de Ahorro en Dolares");
		TiposDeCuentas tipoDeCuenta03 = new TiposDeCuentas("CCP", "Cuenta Corriente en Pesos");
		TiposDeCuentas tipoDeCuenta04 = new TiposDeCuentas("CCD", "Cuenta Corriente en Dolares");
		session.save(tipoDeCuenta01);
		session.save(tipoDeCuenta02);
		session.save(tipoDeCuenta03);
		session.save(tipoDeCuenta04);

		/* DATASET = Perfiles */
		Perfiles perfil01 = new Perfiles("administrador");
		Perfiles perfil02 = new Perfiles("cliente");
		session.save(perfil01);
		session.save(perfil02);

		/* DATASET = Cuentas */
		Cuentas cuenta01 = new Cuentas("0150964302000000142382", "096402000142384", "gapavi", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		Cuentas cuenta02 = new Cuentas("0110599520000001235579", "302700000389926", "pamaci", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		Cuentas cuenta03 = new Cuentas("0170508920000000000417", "334700000004960", "liotye", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		Cuentas cuenta04 = new Cuentas("0170508926000000000499", "188111456558486", "germe", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		Cuentas cuenta05 = new Cuentas("0340100800100586333009", "204566543326881", "criibe", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		Cuentas cuenta06 = new Cuentas("0340100809100586333008", "236522813569050", "rogobo", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		Cuentas cuenta07 = new Cuentas("2850347730000000049606", "334700000004960", "rickyfort", LocalDate.now(),
				10000.00, tipoDeCuenta01);
		Cuentas cuenta08 = new Cuentas("0070117020000003965944", "206588665470987", "vickysueiro", LocalDate.now(),
				10000.00, tipoDeCuenta01);
		Cuentas cuenta09 = new Cuentas("2590046210320129410056", "259965549872249", "tinitini", LocalDate.now(),
				10000.00, tipoDeCuenta01);
		Cuentas cuenta10 = new Cuentas("0650020701000001040561", "589944987111686", "sensei", LocalDate.now(), 10000.00,
				tipoDeCuenta01);
		session.save(cuenta01);
		session.save(cuenta02);
		session.save(cuenta03);
		session.save(cuenta04);
		session.save(cuenta05);
		session.save(cuenta06);
		session.save(cuenta07);
		session.save(cuenta08);
		session.save(cuenta08);
		session.save(cuenta09);
		session.save(cuenta10);

		/* DATASET = Usuarios */
		Usuarios user01 = new Usuarios("usuarioCliente01", "claveCliente", perfil02);
		Usuarios user02 = new Usuarios("usuarioCliente02", "claveCliente", perfil02);
		Usuarios user03 = new Usuarios("usuarioCliente03", "claveCliente", perfil02);
		Usuarios user04 = new Usuarios("usuarioCliente04", "claveCliente", perfil02);
		Usuarios user05 = new Usuarios("usuarioCliente05", "claveCliente", perfil02);
		Usuarios user06 = new Usuarios("usuarioCliente06", "claveCliente", perfil02);
		Usuarios user07 = new Usuarios("usuarioCliente07", "claveCliente", perfil02);
		Usuarios user08 = new Usuarios("usuarioCliente08", "claveCliente", perfil02);
		Usuarios user09 = new Usuarios("usuarioCliente09", "claveCliente", perfil02);
		Usuarios user10 = new Usuarios("usuarioCliente10", "claveCliente", perfil02);
		Usuarios user11 = new Usuarios("administrador", "claveBanco", perfil01);
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
		session.save(user11);

		/* DATASET = Movimientos */
		
		// Getting system timezone
//		ZoneId systemTimeZone = ZoneId.systemDefault();
//		
//		// converting LocalDateTime to ZonedDateTime with the system timezone
//		ZonedDateTime zonedDateTime = fechaLocal.atStartOfDay(systemTimeZone);
//		
//		// converting ZonedDateTime to Date using Date.from() and ZonedDateTime.toInstant()
//		Date fechaAhora = Date.from(zonedDateTime.toInstant());
		
		
		
		Movimientos movimiento01 = new Movimientos("Transferencia", 8000.00, fechaAhora, cuenta01, cuenta02);
		Movimientos movimiento02 = new Movimientos("Transferencia", 20.00, fechaAhora, cuenta02, cuenta03);
		Movimientos movimiento03 = new Movimientos("Transferencia", 720.00, fechaAhora, cuenta03, cuenta04);
		Movimientos movimiento04 = new Movimientos("Transferencia", 1030.00, fechaAhora, cuenta04, cuenta05);
		Movimientos movimiento05 = new Movimientos("Transferencia", 1220.00, fechaAhora, cuenta05, cuenta06);
		Movimientos movimiento06 = new Movimientos("Transferencia", 3002.00, fechaAhora, cuenta06, cuenta07);
		Movimientos movimiento07 = new Movimientos("Transferencia", 10000.00, fechaAhora, cuenta07, cuenta08);
		Movimientos movimiento08 = new Movimientos("Transferencia", 11000.00, fechaAhora, cuenta08, cuenta09);
		Movimientos movimiento09 = new Movimientos("Transferencia", 100.00, fechaAhora, cuenta09, cuenta10);
		Movimientos movimiento10 = new Movimientos("Transferencia", 5000.00, fechaAhora, cuenta10, cuenta01);
		session.save(movimiento01);
		session.save(movimiento02);
		session.save(movimiento03);
		session.save(movimiento04);
		session.save(movimiento05);
		session.save(movimiento06);
		session.save(movimiento07);
		session.save(movimiento08);
		session.save(movimiento09);
		session.save(movimiento10);

		/* DATASET = Personas */
		Personas persona01 = new Personas(30639961, "Gustavo", "Pavichevich", fecha, "Miguel Angel 393",
				localidad01, provincia01, pais01, genero01, user01);
		Personas persona02 = new Personas(31632067, "Pablo", "Maciel",  fecha, "Joseph 663", localidad02,
				provincia01, pais01, genero01, user02);
		Personas persona03 = new Personas(32555496, "Leonardo", "Yermoli",  fecha, "Tribulato 4612", localidad02,
				provincia01, pais01, genero01, user03);
		Personas persona04 = new Personas(31456998, "German", "Medina", fecha, "Del Carril 23", localidad02,
				provincia01, pais01, genero01, user04);
		Personas persona05 = new Personas(37987112, "Cristian", "Benitez",  fecha, "Siempreviva 123", localidad02,
				provincia01, pais01, genero01, user05);
		Personas persona06 = new Personas(25111858, "Roberto", "Gomez Bolanio", fecha, "Guadalajara 8897",
				localidad01, provincia01, pais01, genero01, user06);
		Personas persona07 = new Personas(26123887, "Ricardo", "Fort",  fecha, "Comandante 2525", localidad01,
				provincia01, pais01, genero01, user07);
		Personas persona08 = new Personas(8984621, "Victor", "Sueiro",  fecha, "De las Luces 666", localidad01,
				provincia01, pais01, genero01, user08);
		Personas persona09 = new Personas(40489156, "Tini", "Stoesel", fecha, "Tupungato 333", localidad01,
				provincia01, pais01, genero01, user09);
		Personas persona10 = new Personas(98475695, "Ernesto", "Mishagui",  fecha, "Montañeses 99", localidad01,
				provincia01, pais01, genero01, user10);
		Personas persona11 = new Personas(98475695, "Ramiro", "Profeso", fecha, "Montañeses 99", localidad01,
				provincia01, pais01, genero01, user11);
		Personas persona12 = new Personas(98475695, "Tomas", "Profesor",  fecha, "Montañeses 99", localidad01,
				provincia01, pais01, genero01, user11);
		session.save(persona01);
		session.save(persona02);
		session.save(persona03);
		session.save(persona04);
		session.save(persona05);
		session.save(persona06);
		session.save(persona07);
		session.save(persona08);
		session.save(persona09);
		session.save(persona10);
		session.save(persona11);
		session.save(persona12);

		// cierre de transacciones 
		session.getTransaction().commit();
		ch.cerrarSession();
	}

	public initDB() {
		// TODO Auto-generated constructor stub
	}

}
