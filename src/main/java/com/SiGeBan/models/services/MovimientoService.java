package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.SiGeBan.models.dao.IMovimientoDAO;
import main.java.com.SiGeBan.models.entity.Movimientos;
import main.java.com.SiGeBan.models.entity.Personas;
@Service
public class MovimientoService implements IMovimientoService {
	@Autowired
	private IMovimientoDAO iMovimientoDAO=null;

	public IMovimientoDAO getiMovimientoDAO() {
		return iMovimientoDAO;
	}

	public void setiMovimientoDAO(IMovimientoDAO iMovimientoDAO) {
		this.iMovimientoDAO = iMovimientoDAO;
	}

	@Override
	public ArrayList<Movimientos> obtenerMovimientos() {
		// TODO Auto-generated method stub
		return iMovimientoDAO.obtenerMovimientos();
	}

	@Override
	public ArrayList<Movimientos> obtenerMovimientosPornumeroDeCuentaOrigen(String numeroDeCuentaOrigen) {
		// TODO Auto-generated method stub
		return iMovimientoDAO.obtenerMovimientosPornumeroDeCuentaOrigen(numeroDeCuentaOrigen);
	}

	@Override
	public void insertarMovimiento(Movimientos Movimiento) {
		// TODO Auto-generated method stub
		iMovimientoDAO.insertarMovimiento(Movimiento);
	}

	@Override
	public void eliminarMovimiento(int idMovimiento) {
		// TODO Auto-generated method stub
		iMovimientoDAO.eliminarMovimiento(idMovimiento);
	}

	@Override
	public void actualizarMovimiento(Movimientos Movimiento) {
		// TODO Auto-generated method stub
		iMovimientoDAO.actualizarMovimiento(Movimiento);
	}


}
