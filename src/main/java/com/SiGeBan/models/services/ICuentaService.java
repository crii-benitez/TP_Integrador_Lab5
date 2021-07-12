package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;

public interface ICuentaService {
	void insertarCuenta(Cuentas cuenta);

	Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta);

	ArrayList<Cuentas> obtenerCuentas();
	
	ArrayList<Personas> obtenerPersonas();

	void eliminarCuenta(Long idCuenta);

	void actualizarCuenta(Cuentas cuenta);
}
