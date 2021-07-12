package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.ICuentaDAO;
import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
@Service
public class CuentaService implements ICuentaService {
	@Autowired
	private ICuentaDAO iCuentaoDAO=null;
	
	public ICuentaDAO getiCuentaoDAO() {
		return iCuentaoDAO;
	}

	public void setiCuentaoDAO(ICuentaDAO iCuentaoDAO) {
		this.iCuentaoDAO = iCuentaoDAO;
	}

	@Override
	public void insertarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		iCuentaoDAO.insertarCuenta(cuenta);
	}

	@Override
	public Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta) {
		// TODO Auto-generated method stub
		return iCuentaoDAO.obtenerCuentaPorNumeroDeCuenta(numeroDeCuenta);
	}

	@Override
	public ArrayList<Cuentas> obtenerCuentas() {
		// TODO Auto-generated method stub
		return iCuentaoDAO.obtenerCuentas();
	}

	@Override
	public void eliminarCuenta(Long idCuenta) {
		// TODO Auto-generated method stub
		iCuentaoDAO.eliminarCuenta(idCuenta);
	}

	@Override
	public void actualizarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		iCuentaoDAO.actualizarCuenta(cuenta);
	}
	
	@Override
	public ArrayList<Personas> obtenerPersonas() {
		return iCuentaoDAO.obtenerPersonas();
	}

}
