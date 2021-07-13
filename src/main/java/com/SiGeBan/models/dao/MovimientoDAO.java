package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Movimientos;
import main.java.com.SiGeBan.models.entity.Personas;

public class MovimientoDAO implements IMovimientoDAO {
	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarMovimiento(Movimientos Movimiento) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(Movimiento);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Movimientos> obtenerMovimientosPornumeroDeCuentaOrigen(String numeroDeCuentaOrigen) {
		// TODO Auto-generated method stub
		System.out.println("Ingreso en obtenerMovimientosPornumeroDeCuentaOrigen");
//		return (ArrayList<Movimientos>) this.hibernateTemplate.find("SELECT m.idMovimiento, m.detalle, m.importe, co.cbu as 'cbu origen', co.numeroDeCuenta as 'numeroCuentaOrigen', co.saldo as 'saldo origen' " + 
//				", co.cbu as 'cbu destino', cd.numeroDeCuenta as 'numeroCuentaDestino', cd.saldo as 'saldo destino'  FROM sigeban.movimientos as m " + 
//				"inner join sigeban.cuentas as co on co.idCuenta=m.numeroCuentaOrigen " + 
//				"inner join sigeban.cuentas as cd on cd.idCuenta=m.numeroCuentaDestino " + 
//				"inner join sigeban.personas as p on p.idPersona=co.idPersona " + 
//				"inner join sigeban.usuario as u on u.idUsuario=p.usuario " + 
//				"where u.usuario = ? " + 
//				"group by m.detalle, m.importe,'cbu origen','numeroCuentaOrigen', 'saldo origen' " + 
//				", 'cbu destino', 'numeroCuentaDestino', 'saldo destino'",numeroDeCuentaOrigen).get(0);
//	
		return	(ArrayList<Movimientos>) this.hibernateTemplate.find("FROM Movimientos m WHERE m.numeroDecuentaOrigen.numeroDeCuenta= ? or m.numeroDecuentaDestino.numeroDeCuenta= ?",new Object[]{numeroDeCuentaOrigen,numeroDeCuentaOrigen});
				
				//," or m.numeroDecuentaDestino= ?",numeroDeCuentaOrigen);
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Movimientos> obtenerMovimientos() {
		// TODO Auto-generated method stub
		return (ArrayList<Movimientos>) this.hibernateTemplate.loadAll(Movimientos.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarMovimiento(int idMovimiento) {
		// TODO Auto-generated method stub
		Movimientos mov = new Movimientos();
		mov.setIdMovimiento(idMovimiento);
		this.hibernateTemplate.delete(mov);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarMovimiento(Movimientos movimiento) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(movimiento);
	}

}
