package com.SiGeBan.models.commerce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SiGeBan.models.dao.DaoMovimientos;
import com.SiGeBan.models.entity.Movimientos;

@Service("servicioMovimientos")
public class NegMovimientos {
	@Autowired
	private DaoMovimientos daoMovimientos;
	
	public List<?> listarMovimientos() {
		return daoMovimientos.listarMovimientos();
	}

	public boolean agregarPersona(Movimientos p) {
		return daoMovimientos.agregarMovimiento(p);
	}
}
