package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.TiposDeCuentas;

public interface ICuentaDAO {
	//Alta de Cuenta
	public void insertarCuenta(Cuentas cuenta);

	//Obtener Cuenta por numeroDeCuenta
	public Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta);
	
	//Obtener Cuenta por numeroDeCuenta
	public ArrayList<Cuentas> obtenerMisCuentas(String usuario);
	
	// Obtiene Tipos de cuentas por id
	TiposDeCuentas obtenerTipoCuentaPorID(int idTipoDeCuenta);

	//Obtiene todas las Cuentas
	public ArrayList<Cuentas> obtenerCuentas();

	//Elimina una Cuenta apartir del idCuenta
	public void eliminarCuenta(Long idCuenta);

	//Actualiza los datos de una Cuenta
	public void actualizarCuenta(Cuentas cuenta);
	
	public ArrayList<Personas> obtenerPersonas();
	
}
