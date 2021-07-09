package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Cuentas;

public interface ICuentaDAO {
	//Alta de Cuenta
	public void insertarCuenta(Cuentas cuenta);

	//Obtener Cuenta por numeroDeCuenta
	public Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta);

	//Obtiene todas las Cuentas
	public ArrayList<Cuentas> obtenerCuentas();

	//Elimina una Cuenta apartir del idCuenta
	public void eliminarCuenta(Long idCuenta);

	//Actualiza los datos de una Cuenta
	public void actualizarCuenta(Cuentas cuenta);
	
}
