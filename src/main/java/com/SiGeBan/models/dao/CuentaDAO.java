package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;

public class CuentaDAO implements ICuentaDAO {


	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void insertarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(cuenta);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta) {
		// TODO Auto-generated method stub
	    return (Cuentas) this.hibernateTemplate.find("FROM Cuentas c WHERE c.numeroDeCuenta = ?",numeroDeCuenta).get(0);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Cuentas> obtenerCuentas() {
		// TODO Auto-generated method stub
		return (ArrayList<Cuentas>) this.hibernateTemplate.loadAll(Cuentas.class);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void eliminarCuenta(Long idCuenta) {
		// TODO Auto-generated method stub
	    Cuentas account = new Cuentas();
	    account.setIdCuenta(idCuenta);
	    this.hibernateTemplate.delete(account);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void actualizarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(cuenta);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public ArrayList<Personas> obtenerPersonas() {
		return (ArrayList<Personas>) this.hibernateTemplate.loadAll(Personas.class);
	}

}
