package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Movimientos;

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

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Movimientos> obtenerMovimientosPornumeroDeCuentaOrigen(String numeroDeCuentaOrigen) {
		// TODO Auto-generated method stub
		return (ArrayList<Movimientos>) this.hibernateTemplate.find("FROM Movimientos m WHERE m.numeroDeCuentaOrigen = ?",numeroDeCuentaOrigen).get(0);
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
