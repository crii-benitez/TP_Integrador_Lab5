package main.java.com.SiGeBan.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.services.ICuentaService;

@Controller
public class CuentaController {

	@Autowired
	private ICuentaService iCuentaService;
	
	 @RequestMapping("IrAMisCuentas.html")
	 public ModelAndView abrirCuentas() {
	
	 ArrayList<Cuentas> _Lcuentas=(ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
	 ModelAndView model = new ModelAndView("MisCuentas");
	
	 model.addObject("listcuentas", _Lcuentas);
	 return model;
	
	 }
}
