package main.java.com.SiGeBan.util;

import java.util.Date;


import java.time.LocalDate;
import java.sql.Timestamp;
import java.time.*;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import main.java.com.SiGeBan.models.entity.*;

public class InitDB {

	private static SessionFactory sessionFactory;
	private static Session session;
	private static Configuration configuration = new Configuration();
	
	
	public static void main(String[] args) {
		configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		abrirConexion();
        iniciarBase();
		cerrarSession();
	}
	
	public static Session abrirConexion()
	{
		session=sessionFactory.openSession();
		return session;
	}
	
	public static void cerrarSession()
	{
		session.close();
		cerrarSessionFactory();
	}
	
	
	public static void cerrarSessionFactory()
	{
		sessionFactory.close();
	}

	public static void iniciarBase() {

		// seteo la fecha para movimientos
		LocalDateTime ldt = LocalDateTime.now();
		Timestamp fechaAhora = Timestamp.valueOf(ldt);

		Date fecha = new Date();
		
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");

		String currentTime = sdf.format(fecha);
		
//		java.sql.Date date2 = new java.sql.Date(fecha.getTime());
//		
//		java.util.Date d = new java.util.Date();  
//		plantilla = new SimpleDateFormat("dd/MM/yyyy");
//		String tiempo = plantilla.format(d);
		
		Date fechaCrea = new java.sql.Date(fecha.getYear(),fecha.getMonth(),fecha.getDate());
		
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
		Provincias provincia01 = new Provincias("Buenos Aires"); //, pais01
		Provincias provincia02 = new Provincias("CABA");
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

		/* DATASET = Localidades */
		Localidades localidad01 = new Localidades("Moreno");
		Localidades localidad02 = new Localidades("Jose C Paz");
		Localidades localidad03 = new Localidades("Posadas");
		Localidades localidad04 = new Localidades("Mendoza");
		Localidades localidad05 = new Localidades("Resistencia");
		Localidades localidad06 = new Localidades("San Salvador de Jujuy");
		Localidades localidad07 = new Localidades("Rafaela");
		Localidades localidad08 = new Localidades("Rio Gallegos");
		Localidades localidad09 = new Localidades("Bariloche");
		Localidades localidad10 = new Localidades("Cordoba");
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
		
		/* DATASET = Usuario */
		Usuario user01 = new Usuario("usuarioCliente01", "claveCliente", perfil02, true);
		Usuario user02 = new Usuario("usuarioCliente02", "claveCliente", perfil02, true);
		Usuario user03 = new Usuario("usuarioCliente03", "claveCliente", perfil02, true);
		Usuario user04 = new Usuario("usuarioCliente04", "claveCliente", perfil02, true);
		Usuario user05 = new Usuario("usuarioCliente05", "claveCliente", perfil02, true);
		Usuario user06 = new Usuario("usuarioCliente06", "claveCliente", perfil02, true);
		Usuario user07 = new Usuario("usuarioCliente07", "claveCliente", perfil02, true);
		Usuario user08 = new Usuario("usuarioCliente08", "claveCliente", perfil02, true);
		Usuario user09 = new Usuario("usuarioCliente09", "claveCliente", perfil02, true);
		Usuario user10 = new Usuario("usuarioCliente10", "claveCliente", perfil02, true);
		Usuario user11 = new Usuario("administrador", "claveBanco", perfil01, true);
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
		 
		/* DATASET = Personas */
		Personas persona01 = new Personas("30639961", "Gustavo", "Pavichevich", fechaCrea, "Miguel Angel 393", localidad01,
				provincia01, pais01, genero01, user01);
		Personas persona02 = new Personas("31632067", "Pablo", "Maciel", fechaCrea, "Joseph 663", localidad02, provincia01,
				pais01, genero01, user02);
		Personas persona03 = new Personas("32555496", "Leonardo", "Yermoli", fechaCrea, "Tribulato 4612", localidad02,
				provincia01, pais01, genero01, user03);
		Personas persona04 = new Personas("31456998", "German", "Medina", fechaCrea, "Del Carril 23", localidad02,
				provincia01, pais01, genero01, user04);
		Personas persona05 = new Personas("37987112", "Cristian", "Benitez", fechaCrea, "Siempreviva 123", localidad02,
				provincia01, pais01, genero01, user05);
		Personas persona06 = new Personas("25111858", "Roberto", "Gomez Bolanio", fechaCrea, "Guadalajara 8897", localidad01,
				provincia01, pais01, genero01, user06);
		Personas persona07 = new Personas("26123887", "Ricardo", "Fort", fechaCrea, "Comandante 2525", localidad01,
				provincia01, pais01, genero01, user07);
		Personas persona08 = new Personas("8984621", "Victor", "Sueiro", fechaCrea, "De las Luces 666", localidad01,
				provincia01, pais01, genero01, user08);
		Personas persona09 = new Personas("40489156", "Tini", "Stoesel", fechaCrea, "Tupungato 333", localidad01, provincia01,
				pais01, genero01, user09);
		Personas persona10 = new Personas("98475695", "Ernesto", "Mishagui", fechaCrea, "Montañeses 99", localidad01,
				provincia01, pais01, genero01, user10);
		Personas persona11 = new Personas("98475695", "Ramiro", "Profeso", fechaCrea, "Montañeses 99", localidad01,
				provincia01, pais01, genero01, user11);
		Personas persona12 = new Personas("98475695", "Tomas", "Profesor", fechaCrea, "Montañeses 99", localidad01,
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


		/* DATASET = Cuentas */
		Cuentas cuenta01 = new Cuentas("0150964302000000142382", "096402000142384", "gapavi", fecha, 10000.00,
				tipoDeCuenta01, persona01);
		Cuentas cuenta02 = new Cuentas("0110599520000001235579", "302700000389926", "pamaci", fecha, 10000.00,
				tipoDeCuenta01, persona02);
		Cuentas cuenta03 = new Cuentas("0170508920000000000417", "334700000004960", "liotye", fecha, 10000.00,
				tipoDeCuenta01, persona03);
		Cuentas cuenta04 = new Cuentas("0170508926000000000499", "188111456558486", "germe", fecha, 10000.00,
				tipoDeCuenta01, persona04);
		Cuentas cuenta05 = new Cuentas("0340100800100586333009", "204566543326881", "criibe", fecha, 10000.00,
				tipoDeCuenta01, persona05);
		Cuentas cuenta06 = new Cuentas("0340100809100586333008", "236522813569050", "rogobo", fecha, 10000.00,
				tipoDeCuenta01, persona06);
		Cuentas cuenta07 = new Cuentas("2850347730000000049606", "334700000004960", "rickyfort", fecha,
				10000.00, tipoDeCuenta01, persona07);
		Cuentas cuenta08 = new Cuentas("0070117020000003965944", "206588665470987", "vickysueiro", fecha,
				10000.00, tipoDeCuenta01, persona08);
		Cuentas cuenta09 = new Cuentas("2590046210320129410056", "259965549872249", "tinitini", fecha,
				10000.00, tipoDeCuenta01, persona09);
		Cuentas cuenta10 = new Cuentas("0650020701000001040561", "589944987111686", "sensei", fecha, 10000.00,
				tipoDeCuenta01, persona10);
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


		/* DATASET = Movimientos */

		// Getting system timezone
		// ZoneId systemTimeZone = ZoneId.systemDefault();
		//
		// // converting LocalDateTime to ZonedDateTime with the system timezone
		// ZonedDateTime zonedDateTime = fechaLocal.atStartOfDay(systemTimeZone);
		//
		// // converting ZonedDateTime to Date using Date.from() and
		// ZonedDateTime.toInstant()
		// Date fechaAhora = Date.from(zonedDateTime.toInstant());

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

		// cierre de transacciones
		session.getTransaction().commit();
		session.close();
		System.exit(0);

	}

	public InitDB() {
		// TODO Auto-generated constructor stub
	}

}
