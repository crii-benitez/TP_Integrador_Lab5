package main.java.com.SiGeBan.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.TiposDeCuentas;
import main.java.com.SiGeBan.models.services.ICuentaService;
import main.java.com.SiGeBan.models.services.IPersonaService;

@Controller
public class CuentaController {
	
	private double saldoInicial=10000;
	@Autowired
	private ICuentaService iCuentaService;
	@Autowired
	private IPersonaService iPersonaService;
	
	 @RequestMapping("IrAMisCuentas.html")
	 public ModelAndView abrirCuentas() {
		 
		 //ArrayList<Personas> _Dpersonales =(ArrayList<Personas>) iPersonaService.ObtenerDatosPersonales("usuarioCliente04");
	
		 ArrayList<Cuentas> _Lcuentas=(ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
		 ModelAndView model = new ModelAndView("MisCuentas");
	
		 //model.addObject("datospersonales",_Dpersonales);
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
	  
	 @RequestMapping(value = "crearCuenta.html", method= { RequestMethod.GET, RequestMethod.POST})
	 public ModelAndView crearCuenta(String Cbu, String Alias, String NumCuenta, String Cliente, String tipoCuenta ) {
		 ModelAndView model = new ModelAndView();
		 
		 Cuentas cuentaNueva = new Cuentas();
		 Personas persona = new Personas();
		 persona.setIdPersona(Integer.valueOf(Cliente)); 
		 TiposDeCuentas tipodeCuenta = new TiposDeCuentas();
		 tipodeCuenta.setIdTipoDeCuenta(Integer.valueOf(tipoCuenta));
		 
		 //cuentaNueva.setFechaDeCreacion(fecha);
		 cuentaNueva.setCbu(Cbu);
		 cuentaNueva.setNumeroDeCuenta(NumCuenta);
		 cuentaNueva.setPersona(persona);
		 cuentaNueva.setTipoDeCuenta(tipodeCuenta);
		 cuentaNueva.setAlias(Alias);
		 cuentaNueva.setSaldo(saldoInicial);
		 cuentaNueva.setActiva(true);
		 
		 String mensaje ="";
		 
		 try {
			 iCuentaService.insertarCuenta(cuentaNueva);
			 mensaje = "Cuenta Creada";
			
		} catch (Exception e) {
			mensaje = "No se pudo crear la cuenta";
		}
		 
		model.setViewName("addaccount");
		model.addObject("mensaje", mensaje);
				 
		return model;
	 }
}
