package main.java.com.SiGeBan.controllers;

import java.util.ArrayList;

import javax.servlet.ServletConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Movimientos;
import main.java.com.SiGeBan.models.services.IMovimientoService;
import main.java.com.SiGeBan.models.services.MovimientoService;

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
	
	 @RequestMapping("IrAMovimientos.html")
	 public ModelAndView listMovement() {
	
	 ArrayList<Movimientos> _Lmovimientos=(ArrayList<Movimientos>) iMovimientoService.obtenerMovimientos();
	 ModelAndView model = new ModelAndView("movementhistory");
	
	 model.addObject("listmovimientos", _Lmovimientos);
	 return model;
	
	 }
}
