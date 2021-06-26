package com.SiGeBan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping("IrALogin.html")
	public ModelAndView eventoRedireccionarLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;

	}

	@RequestMapping(value = "AccionLoguear.html", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView accionLoguear(String txtUsuario, String txtPass) {
		ModelAndView mv = new ModelAndView();
		Usuarios usuario = new Usuarios();
		usuario.setPass(txtPass);
		usuario.setUsuario(txtUsuario);
//		mv.addObject("txtUsuario", txtUsuario);s
//		UsuariosDAO usuarioDAO = new UsuariosDAO();
//		usuario = (Usuarios) usuarioDAO.obtenerUsuarioPorUsuario(txtUsuario);
	
		System.out.println(usuario.toString());
//		if(txtPass!=usuario.getPass())
//			System.out.println(mv.addObject("Mensaje", "La contraseña ingresada es erronea."));
				
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping("IrAMovimientos.html")
	public ModelAndView listMovement() {
		ObjectMapper mapper = new ObjectMapper();

		/* List<?> listMovement=negocioMovimiento.listarMovimientos(); */

<<<<<<< HEAD
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

=======
    }
    
   
	
    
	public Controllers() {
		// TODO Auto-generated constructor stub
>>>>>>> branch 'master' of https://github.com/crii-benitez/TP_Integrador_Lab5.git
	}

}
