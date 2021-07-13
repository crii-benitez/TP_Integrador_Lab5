package main.java.com.SiGeBan.controllers;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Movimientos;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.TiposDeCuentas;
import main.java.com.SiGeBan.models.services.ICuentaService;
import main.java.com.SiGeBan.models.services.IMovimientoService;

@Controller
public class MovimientoController {

	/*
	@Autowired
	public  MovimientoService service;
	public void init(ServletConfig config) {
	    ApplicationContext ctx = WebApplicationContextUtils
	            .getRequiredWebApplicationContext(config.getServletContext());
	    
	    this.service = (MovimientoService) ctx.getBean("MovimientoServiceBean");
	}
	*/
	@Autowired
	private IMovimientoService iMovimientoService;
	@Autowired
	private ICuentaService iCuentaServiceO;
	@Autowired
	private ICuentaService iCuentaServiceD;
	
	 @RequestMapping("IrAMovimientos.html")
	 public ModelAndView listMovement() {
	
	 ArrayList<Movimientos> _Lmovimientos=(ArrayList<Movimientos>) iMovimientoService.obtenerMovimientos();
	 ModelAndView model = new ModelAndView("movementhistory");
	
	 model.addObject("listmovimientos", _Lmovimientos);
	 return model;
	
	 }
	 
		@RequestMapping("IrATransferencias.html")
		public ModelAndView abrirTransferencias() {
			System.out.println("Ingreso en MovimientoController 'abrirTransferencias'");
			/*ArrayList<Cuentas> _c= (ArrayList<Cuentas>) iCuentaService.obtenerCuentaPorNumeroDeCuenta("096402000142384");
			System.out.println("Retorno en MovimientoController 'obtenerCuentaPorNumeroDeCuenta': " + _c.toString());
			*/
			ModelAndView model = new ModelAndView();
			model.addObject("datoscuentas", "");
			model.setViewName("transferencias");
			return model;

		}
		 @RequestMapping(value = "RegistrarTransferencia.html", method= { RequestMethod.GET, RequestMethod.POST})
		 public ModelAndView RegistrarTransferencia(String detalle, Double importe, String numeroCuentaDestino, String numeroCuentaOrigen )
		 {
			ModelAndView model = new ModelAndView();
			Movimientos movimiento = new Movimientos();
			
			LocalDateTime ldt = LocalDateTime.now();
			Timestamp fechaDeMovimiento= Timestamp.valueOf(ldt);
			
			movimiento.setDetalle(detalle);
			movimiento.setImporte(importe);
			movimiento.setFechaDeMovimiento(fechaDeMovimiento);
			Cuentas cd=(Cuentas) iCuentaServiceD.obtenerCuentaPorNumeroDeCuenta(numeroCuentaDestino);
			movimiento.setNumeroDecuentaDestino(cd);
			
			Cuentas co=(Cuentas) iCuentaServiceO.obtenerCuentaPorNumeroDeCuenta(numeroCuentaOrigen);
			movimiento.setNumeroDecuentaOrigen(co);
			
			 String mensaje ="";
			 
			 try {
				 iMovimientoService.insertarMovimiento(movimiento);
				 mensaje = "transferencia Creada";
				
			} catch (Exception e) {
				mensaje = e.toString();//"No se pudo crear la transferencia";
			}
			
			model.setViewName("transferencias");
			model.addObject("mensaje", mensaje);
					 
			return model;
		 }

}
