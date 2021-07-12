package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import main.java.com.SiGeBan.models.entity.Movimientos;
import main.java.com.SiGeBan.models.entity.Personas;

public interface IMovimientoDAO {
	//Alta de Movimiento
	public void insertarMovimiento(Movimientos Movimiento);

	//Obtiene Lista de Movimiento por numeroDeCuentaOrigen
	public ArrayList<Movimientos> obtenerMovimientosPornumeroDeCuentaOrigen(String numeroDeCuentaOrigen);

	//Obtiene todos los Movimientos
	public ArrayList<Movimientos> obtenerMovimientos();

	//Elimina el Movimiento apartir del id
	public void eliminarMovimiento(int idMovimiento);

	//Actualiza los datos de un Movimiento
	public void actualizarMovimiento(Movimientos movimiento);
}
