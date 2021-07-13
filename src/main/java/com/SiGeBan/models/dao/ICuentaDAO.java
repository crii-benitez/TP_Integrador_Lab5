package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.TiposDeCuentas;

public interface ICuentaDAO {
	//Alta de Cuenta
	void insertarCuenta(Cuentas cuenta);

	//Obtener Cuenta por numeroDeCuenta
	Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta);
	
	//Obtener Cuenta por numeroDeCuenta
	ArrayList<Cuentas> obtenerMisCuentas(String usuario);
	
	// Obtiene Tipos de cuentas por id
	TiposDeCuentas obtenerTipoCuentaPorID(int idTipoDeCuenta);

	//Obtiene todas las Cuentas
	ArrayList<Cuentas> obtenerCuentas();

	//Elimina una Cuenta apartir del idCuenta
	void eliminarCuenta(Long idCuenta);

	//Actualiza los datos de una Cuenta
	void actualizarCuenta(Cuentas cuenta);
	
	ArrayList<Personas> obtenerPersonas();

	Cuentas obtenerCuentaPorId(Long idCuenta);
	
	// Obtengo la cantidad de cuentas que tiene la persona
//	Integer obtenerCantCuentas(int idPersona);
}
