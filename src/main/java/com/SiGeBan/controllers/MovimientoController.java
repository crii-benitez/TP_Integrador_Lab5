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
	private ICuentaService iCuentaService;
	@Autowired
	private ICuentaService iCuentaServiceO;
	@Autowired
	private ICuentaService iCuentaServiceD;
	
	
	
	 @RequestMapping("IrAMovimientos.html")
	 public ModelAndView listMovement(String UserName, String txtCuenta) {
	 
		 ArrayList<Movimientos> _Lmovimientos= new ArrayList<Movimientos>();
		 ArrayList<Cuentas> _Lcuentas = (ArrayList<Cuentas>) iCuentaServiceO.obtenerMisCuentas(UserName);
		 
		 ModelAndView model = new ModelAndView("movementhistory");
	 
	 if (txtCuenta != null){
	//	_Lmovimientos=(ArrayList<Movimientos>) iMovimientoService.obtenerMovimientos();
	
		_Lmovimientos=(ArrayList<Movimientos>) iMovimientoService.obtenerMovimientosPornumeroDeCuentaOrigen(txtCuenta);
		model.addObject("listmovimientos", _Lmovimientos);
	 }	 
			
	
	 model.addObject("listcuentas", _Lcuentas);
	 
	 return model;
	
	 }
	 
		@RequestMapping("IrATransferencias.html")
		public ModelAndView abrirTransferencias(String UserName) {
			System.out.println("Ingreso en MovimientoController 'abrirTransferencias'");
			/*ArrayList<Cuentas> _c= (ArrayList<Cuentas>) iCuentaService.obtenerCuentaPorNumeroDeCuenta("096402000142384");
			System.out.println("Retorno en MovimientoController 'obtenerCuentaPorNumeroDeCuenta': " + _c.toString());
			*/
			ArrayList<Cuentas> _Ncuentas = (ArrayList<Cuentas>) iCuentaService.obtenerMisCuentas(UserName);
			ModelAndView model = new ModelAndView();
			model.addObject("NumerosdeCuenta", _Ncuentas);
			model.setViewName("transferencias");
			return model;

		}
		 @RequestMapping(value = "RegistrarTransferencia.html", method= { RequestMethod.GET, RequestMethod.POST})
		 public ModelAndView RegistrarTransferencia(String detalle, Double importe, String numeroCuentaDestino, String numeroCuentaOrigen )
		 {
			
			ModelAndView model = new ModelAndView();
			
			/*Datos para insert de transferencia bancario*/
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
			
			
			/*Datos para Update de saldos por cada cuenta*/
			Cuentas cuentaDestinoUpdate = new Cuentas(cd.getIdCuenta(),cd.getCbu(), cd.getNumeroDeCuenta(), cd.getAlias(), cd.getFechaDeCreacion(), cd.getSaldo()+movimiento.getImporte(),
					cd.getTipoDeCuenta(), cd.getPersona(), cd.getActiva());
			
			Cuentas cuentaOrigenUpdate = new Cuentas(co.getIdCuenta(),co.getCbu(), co.getNumeroDeCuenta(), co.getAlias(), co.getFechaDeCreacion(), co.getSaldo()-movimiento.getImporte(),
					co.getTipoDeCuenta(), co.getPersona(),co.getActiva());
			
			 String mensaje ="";
			 
			 try {
				 iMovimientoService.insertarMovimiento(movimiento);
				 iCuentaServiceD.actualizarCuenta(cuentaDestinoUpdate);
				 iCuentaServiceO.actualizarCuenta(cuentaOrigenUpdate);

				 mensaje = "transferencia Creada";
				
			} catch (Exception e) {
				mensaje = e.toString();//"No se pudo crear la transferencia";
			}
			
			model.setViewName("transferencias");
			model.addObject("mensaje", mensaje);
					 
			return model;
		 }

}