package com.SiGeBan.controllers;

import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import com.SiGeBan.models.commerce.NegMovimientos;
import com.SiGeBan.models.dao.UsuariosDAO;
import com.SiGeBan.models.entity.Movimientos;
import com.SiGeBan.models.entity.Usuarios;
import com.SiGeBan.models.services.UsuariosService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Controllers {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("servicioMovimientos") private NegMovimientos negocioMovimiento;
	 * 
	 * @Autowired private Movimientos movimiento;
	 */
	// @Autowired private UsuarioService usuarioService;

	@RequestMapping(value = "IrALogin.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView eventoRedireccionarLogin() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("login");
		return mv;

	}

	@RequestMapping(value = "AccionLoguear.html", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView accionLoguear(String txtUsuario, String Mensaje) {
		ModelAndView mv = new ModelAndView();
		return mv;
	}

	@RequestMapping("IrAMovimientos.html")
	public ModelAndView listMovement() {
		ObjectMapper mapper = new ObjectMapper();

		/* List<?> listMovement=negocioMovimiento.listarMovimientos(); */

		ModelAndView model = new ModelAndView("movementhistory");

		String json = "";
		/*
		 * try { json = mapper.writeValueAsString(listMovement); } catch (Exception e) {
		 * e.printStackTrace(); }
		 */

		model.addObject("listmovimientos", json);

		return model;

	}

	@RequestMapping("IrAAdd.html")
	public ModelAndView abrirAdd() {

		ModelAndView model = new ModelAndView();
		model.setViewName("add");
		return model;

	}

	@RequestMapping("IrAAddAccount.html")
	public ModelAndView abrirAddAccount() {

		ModelAndView model = new ModelAndView();
		model.setViewName("addaccount");
		return model;

	}

	@RequestMapping("IrATransferencias.html")
	public ModelAndView abrirTransferencias() {

		ModelAndView model = new ModelAndView("transferencias");
		// model.setViewName("transferencias");
		return model;

	}

	public Controllers() {
		// TODO Auto-generated constructor stub
	}

}
