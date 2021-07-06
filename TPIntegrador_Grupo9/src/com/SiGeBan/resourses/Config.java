package com.SiGeBan.resourses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration
public class Config {

	//Los beans de las provincias
	
//	@Bean
//	public Provincia ProvinciaBsAs()
//	{
//		Provincia provincia = new Provincia();
//		provincia.setNombre("Bs. As."); //Inyeccion de dependencias por Set
//		return provincia;
//	}
//	
//	@Bean
//	public Provincia ProvinciaSantaFe()
//	{
//		Provincia provincia = new Provincia("Santa Fe"); //Inyeccion de dependencias por constructor
//	//	provincia.setNombre("Santa Fe"); //Inyeccion de dependencias por Set
//		return provincia;
//	}
//	
//	@Bean
//	public Provincia ProvinciaEntreRios()
//	{
//		return new Provincia("Entre rios");
//	}
//	
//	
//	//Los beans de los paises
//	
//	@Bean
//	public Pais PaisMexico()
//	{
//		Pais pais = new Pais();
//		pais.setNombre("Mexico");
//		return pais;
//	}
//	
//	@Bean
//	public Pais PaisArgentina()
//	{
//		Pais pais = new Pais();
//		pais.setNombre("Argentina");
//		
//		List<Provincia> lProvincias = new ArrayList<Provincia>();
//		lProvincias.add(ProvinciaBsAs());
//		lProvincias.add(ProvinciaEntreRios());
//		lProvincias.add(ProvinciaSantaFe());
//		
//		pais.setListaProvincias(lProvincias);
//		
//		return pais;
//	}
//	
//	//Los beans de las personas
//	
//	@Bean(initMethod="initPersona",destroyMethod="destroyPersona")
//	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//	public Persona PersonaPepe()
//	{
//		Persona persona = new Persona("Pepe", "Casas");
//		persona.setNombre("Pepe");
//		persona.setDni(3333333);
//		persona.setPais(PaisArgentina()); //Asi se hace la referencia entre beans
//		return persona;
//	}
	
	
}
