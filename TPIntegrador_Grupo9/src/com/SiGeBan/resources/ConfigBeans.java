package com.SiGeBan.resources;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.SiGeBan.models.dao.ConfigHibernate;
import com.SiGeBan.models.dao.UsuariosDAO;
import com.SiGeBan.models.services.InitDB;

@Configuration
public class ConfigBeans {
	ConfigHibernate configHibernate;

	@Bean(initMethod="iniDB",destroyMethod="destroyDB")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public void init() {
		new InitDB().iniciarBase();
	}
	@Bean
	public UsuariosDAO usuarioServiceBean() {
		return new UsuariosDAO();
	}

}
