package main.java.com.SiGeBan.models.services;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Movimientos;

public interface IMovimientoService {
	ArrayList<Movimientos> obtenerMovimientos();

	ArrayList<Movimientos> obtenerMovimientosPornumeroDeCuentaOrigen(String numeroDeCuentaOrigen);

	void insertarMovimiento(Movimientos Movimiento);

	void eliminarMovimiento(int idMovimiento) ;

	void actualizarMovimiento(Movimientos Movimiento);
}
