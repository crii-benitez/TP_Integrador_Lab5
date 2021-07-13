package main.java.com.SiGeBan.models.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.TiposDeCuentas;

public class CuentaDAO implements ICuentaDAO {

	private HibernateTemplate hibernateTemplate = null;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void insertarCuenta(Cuentas cuenta) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.save(cuenta);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Cuentas obtenerCuentaPorId(Long idCuenta) {
		return this.hibernateTemplate.get(Cuentas.class, idCuenta);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public Cuentas obtenerCuentaPorNumeroDeCuenta(String numeroDeCuenta) {
		// TODO Auto-generated method stub
		System.out
				.println("Ingreso en CuentaDAO obtenerCuentaPorNumeroDeCuenta, Valor numeroDeCuenta=" + numeroDeCuenta);
		try {
			Cuentas _c = (Cuentas) this.hibernateTemplate
					.find("FROM Cuentas c WHERE c.numeroDeCuenta = ?", numeroDeCuenta).get(0);
			System.out.println(_c.toString());
			return _c;
		} catch (Exception E) {
			return null;
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ArrayList<Cuentas> obtenerMisCuentas(String usuario) {
		// TODO Auto-generated method stub
		// System.out.println("Ingreso en CuentaDAO obtenerCuentaPorNumeroDeCuenta,
		// Valor numeroDeCuenta=" + numeroDeCuenta);

		return (ArrayList<Cuentas>) this.hibernateTemplate.find("FROM Cuentas c WHERE c.persona.usuario.usuario = ?",
				usuario);

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public TiposDeCuentas obtenerTipoCuentaPorID(int idTipoDeCuenta) {
		System.out.println("Ingreso en CuentaDAO obtenerTipoCuentaPorID, Valor idTipoDeCuenta=" + idTipoDeCuenta);
		try {
			TiposDeCuentas _c = (TiposDeCuentas) this.hibernateTemplate
					.find("FROM TiposDeCuentas tip WHERE tip.idTipoDeCuenta = ?", idTipoDeCuenta).get(0);
			System.out.println(_c.toString());
			return _c;
		} catch (Exception E) {
			return null;
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ArrayList<Cuentas> obtenerCuentas() {
		// TODO Auto-generated method stub
//		return (ArrayList<Cuentas>) this.hibernateTemplate.loadAll(Cuentas.class);
		return (ArrayList<Cuentas>) this.hibernateTemplate.find("FROM Cuentas c WHERE c.activa = true");

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void eliminarCuenta(Long idCuenta) {
		// TODO Auto-generated method stub
		Cuentas account = new Cuentas();
		account.setIdCuenta(idCuenta);
		this.hibernateTemplate.delete(account);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void actualizarCuenta(Cuentas cuenta) {
		this.hibernateTemplate.update(cuenta);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public ArrayList<Personas> obtenerPersonas() {
		return (ArrayList<Personas>) this.hibernateTemplate.loadAll(Personas.class);
	}
	
		@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public TiposDeCuentas obtenerTipoCuentaPorID(int idTipoDeCuenta) {	
		System.out.println("Ingreso en CuentaDAO obtenerTipoCuentaPorID, Valor idTipoDeCuenta=" + idTipoDeCuenta);
		try {
			TiposDeCuentas _c= (TiposDeCuentas) this.hibernateTemplate.find("FROM TiposDeCuentas tip WHERE tip.idTipoDeCuenta = ?",idTipoDeCuenta).get(0);
			System.out.println(_c.toString());
		    return _c;
		}
		catch (Exception E) {
			return null;
		}
	}
}
