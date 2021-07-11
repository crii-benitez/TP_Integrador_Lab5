package main.java.com.SiGeBan.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Cuentas;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.services.ICuentaService;
import main.java.com.SiGeBan.models.services.IPersonaService;

@Controller
public class UsuarioController {

	@Autowired
	private IPersonaService iPersonaService;
	
	 @RequestMapping("IrAUsuarios.html")
	 public ModelAndView abrirUsuarios() {
	
	 ArrayList<Personas> _LPersonas=(ArrayList<Personas>) iPersonaService.obtenerPersonas();
	 ModelAndView model = new ModelAndView("Usuarios");
	
	 model.addObject("listpersonas", _LPersonas);
	 return model;
	
	 }
}
