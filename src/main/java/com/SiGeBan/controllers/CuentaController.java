package main.java.com.SiGeBan.controllers;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
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
import main.java.com.SiGeBan.models.services.IPersonaService;

@Controller
public class CuentaController {

	private double saldoInicial = 10000;
	private String nroCuentaBanco = "096402000142384";
	@Autowired
	private ICuentaService iCuentaService;
	@Autowired
	private IPersonaService iPersonaService;
	@Autowired
	private ICuentaService iCuentaServiceD;
	@Autowired
	private ICuentaService iCuentaServiceO;
	@Autowired
	private IMovimientoService iMovimientoService;

	@RequestMapping("IrAMisCuentas.html")
	public ModelAndView abrirCuentas(String UserName) {

		// ArrayList<Personas> _Dpersonales =(ArrayList<Personas>)
		// iPersonaService.ObtenerDatosPersonales("usuarioCliente04");
		Personas persona = new Personas();
	
		persona = iPersonaService.ObtenerDatosPersonales(UserName);

		ArrayList<Cuentas> _Lcuentas = (ArrayList<Cuentas>) iCuentaService.obtenerMisCuentas(UserName);
		ModelAndView model = new ModelAndView("MisCuentas");

		// model.addObject("datospersonales",_Dpersonales);
		model.addObject("datospersona", persona);
		model.addObject("listcuentas", _Lcuentas);
		return model;

	}

	@RequestMapping("IrAAddAccount.html")
	public ModelAndView abrirAgregarCuenta() {

		ArrayList<Cuentas> _Lcuentas = (ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
		ModelAndView model = new ModelAndView();

		model.setViewName("addaccount");

		ArrayList<Personas> _LPersonas = (ArrayList<Personas>) iCuentaService.obtenerPersonas();
		model.addObject("listpersonas", _LPersonas);

		model.addObject("listcuentas", _Lcuentas);
		return model;
	}

	@RequestMapping("IrACuentas.html")
	public ModelAndView abrirIrACuentas() {

		ArrayList<Cuentas> _Lcuentas = (ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
		ModelAndView model = new ModelAndView();
		
		model.setViewName("Cuentas");
		
		model.addObject("listcuentas", _Lcuentas);
		return model;
	}

	@RequestMapping(value = "crearCuenta.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView crearCuenta(String Cbu, String Alias, String NumCuenta, String Cliente, String tipoCuenta) {
		ModelAndView model = new ModelAndView();
		Date fecha = new Date();

		LocalDateTime ldt = LocalDateTime.now();
		Timestamp fechaDeMovimiento = Timestamp.valueOf(ldt);

		String mensaje = "";
		Cuentas cuentaNueva = new Cuentas();
		Movimientos movimiento = new Movimientos();

		Personas persona = new Personas();
		persona = iPersonaService.obtenerUnRegistro(Cliente);// .setIdPersona(Integer.valueOf(Cliente));

		TiposDeCuentas tipodeCuenta = new TiposDeCuentas();
		tipodeCuenta = iCuentaService.obtenerTipoCuentaPorID(Integer.parseInt(tipoCuenta));// .setIdTipoDeCuenta(Integer.valueOf(tipoCuenta));

		// objeto cuenta
		cuentaNueva.setFechaDeCreacion(fecha);
		cuentaNueva.setCbu(Cbu);
		cuentaNueva.setNumeroDeCuenta(NumCuenta);
		cuentaNueva.setPersona(persona);
		cuentaNueva.setTipoDeCuenta(tipodeCuenta);
		cuentaNueva.setAlias(Alias);
		cuentaNueva.setSaldo(saldoInicial);
		cuentaNueva.setActiva(true);

		try {
			iCuentaService.insertarCuenta(cuentaNueva);
			mensaje = "Cuenta Creada para:" + cuentaNueva.getPersona().getNombre() + " "
					+ cuentaNueva.getPersona().getApellido();
		} catch (Exception e) {
			mensaje = "No se pudo crear la cuenta: " + e.toString();
		}

		// objeto movimiento
		movimiento.setDetalle("Apertura de cuenta");
		movimiento.setImporte(saldoInicial);
		movimiento.setFechaDeMovimiento(fechaDeMovimiento);
		Cuentas cd = (Cuentas) iCuentaServiceD.obtenerCuentaPorNumeroDeCuenta(NumCuenta);
		movimiento.setNumeroDecuentaDestino(cd);
		Cuentas co = (Cuentas) iCuentaServiceO.obtenerCuentaPorNumeroDeCuenta(nroCuentaBanco);
		movimiento.setNumeroDecuentaOrigen(co);

		try {
			iMovimientoService.insertarMovimiento(movimiento);

		} catch (Exception e) {
			mensaje = "No se pudo insertar Movimiento de Apertura: " + e.toString();
		}

		model.setViewName("addaccount");
		ArrayList<Personas> _LPersonas = (ArrayList<Personas>) iCuentaService.obtenerPersonas();
		model.addObject("listpersonas", _LPersonas);
		ArrayList<Cuentas> _Lcuentas = (ArrayList<Cuentas>) iCuentaService.obtenerCuentas();
		model.addObject("listcuentas", _Lcuentas);
		model.addObject("mensaje", mensaje);

		return model;
	}
}
