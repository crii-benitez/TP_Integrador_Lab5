package com.SiGeBan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {

	@RequestMapping("IrALogin.html")
	public ModelAndView eventoRedireccionarLogin()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("login");
		return MV;
		
	}
	
	
	public Controllers() {
		// TODO Auto-generated constructor stub
	}

}
