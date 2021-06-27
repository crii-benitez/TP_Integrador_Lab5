package com.SiGeBan.resources;

import javax.servlet.ServletConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.SiGeBan.models.services.IUsuariosService;

public class AppContext {
//	@Autowired
//	private IUsuariosService usuarioService;

	public void init(ServletConfig config) {
		ApplicationContext appContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		IUsuariosService usuarioService = (IUsuariosService) appContext.getBean("init");
	}

}
