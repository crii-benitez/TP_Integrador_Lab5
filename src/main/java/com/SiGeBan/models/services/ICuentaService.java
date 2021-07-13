package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.TiposDeCuentas;

public interface ICuentaService {
	void insertarCuenta(Cuentas cuenta);

	Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta);
	
	ArrayList<Cuentas> obtenerMisCuentas(String usuario);
	
	TiposDeCuentas obtenerTipoCuentaPorID(int idTipoDeCuenta);

	ArrayList<Cuentas> obtenerCuentas();
	
	ArrayList<Personas> obtenerPersonas();

	void eliminarCuenta(Long idCuenta);

	void actualizarCuenta(Cuentas cuenta);

	Cuentas obtenerCuentaPorId(Long idCuenta);
}
