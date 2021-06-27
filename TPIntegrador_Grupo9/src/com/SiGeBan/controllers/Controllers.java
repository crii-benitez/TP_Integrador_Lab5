package com.SiGeBan.controllers;

import javax.servlet.ServletConfig;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.SiGeBan.models.dao.UsuariosDAO;
import com.SiGeBan.models.entity.Usuarios;
import com.SiGeBan.models.services.IUsuariosService;
import com.SiGeBan.models.services.UsuariosService;
import com.SiGeBan.resources.ConfigBeans;
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
//	@Autowired
//	private IUsuariosService usuarioService;
//


	@RequestMapping("IrALogin.html")
	public ModelAndView eventoRedireccionarLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;

	}

	@RequestMapping("AccionLoguear.html")
	public ModelAndView accionLoguear(String txtUsuario) {
		UsuariosDAO User = new UsuariosDAO();
		
		System.out.println(txtUsuario);
		ModelAndView mv = new ModelAndView();
		mv.addObject("txtUsuario", User.prueba1(txtUsuario));
	//	mv.addObject("txtPrueba","si le pongo un texto cualquiera anda, pero no toma el post");
		mv.setViewName("usuarioLogueado");
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
