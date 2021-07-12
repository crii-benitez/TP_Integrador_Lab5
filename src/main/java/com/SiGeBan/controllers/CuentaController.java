package main.java.com.SiGeBan.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
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
	 
	 @RequestMapping("IrAAddAccount.html")
	 public ModelAndView abrirAgregarCuenta() {
	
	 ArrayList<Cuentas> _Lcuentas=(ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
	 ModelAndView model = new ModelAndView();
	 
	 model.setViewName("addaccount");
	 
	 //agregado crii
	 ArrayList<Personas> _LPersonas=(ArrayList<Personas>) iCuentaService.obtenerPersonas();
	 model.addObject("listpersonas", _LPersonas);
	 //fin agregado
	
	 model.addObject("listcuentas", _Lcuentas);
	 return model;
	 }
	 
	  @RequestMapping("IrACuentas.html")
	 public ModelAndView abrirIrACuentas() {
	
	 ArrayList<Cuentas> _Lcuentas=(ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
	 ModelAndView model = new ModelAndView();
	 
	 model.setViewName("Cuentas");
	 
	
	
	 model.addObject("listcuentas", _Lcuentas);
	 return model;
	 }
}
