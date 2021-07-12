package main.java.com.SiGeBan.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Generos;
import main.java.com.SiGeBan.models.entity.Localidades;
import main.java.com.SiGeBan.models.entity.Paises;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.Provincias;
import main.java.com.SiGeBan.models.services.ILocalidadService;
import main.java.com.SiGeBan.models.services.IPaisService;
import main.java.com.SiGeBan.models.services.IPersonaService;
import main.java.com.SiGeBan.models.services.IProvinciaService;


@Controller
public class UsuarioController {

	@Autowired
	private IPersonaService iPersonaService;
	@Autowired
	private IPaisService iPaisService;
	@Autowired
	private IProvinciaService iProvinciaService;
	@Autowired
	private ILocalidadService ilocalidadService;
	
	 @RequestMapping("IrAUsuarios.html")
	 public ModelAndView abrirUsuarios() {
	
	 ArrayList<Personas> _LPersonas=(ArrayList<Personas>) iPersonaService.obtenerPersonas();
	 ModelAndView model = new ModelAndView("Usuarios");
	
	 model.addObject("listpersonas", _LPersonas);
	 return model;
	
	 }
	 
	
	 @RequestMapping("IrAAdd.html")
		public ModelAndView abrirAdd() {
		 ArrayList<Personas> _LPersonas=(ArrayList<Personas>) iPersonaService.obtenerPersonas();
		 ArrayList<Paises> _LPaises=(ArrayList<Paises>) iPaisService.obtenerPaises();
		 ArrayList<Provincias> _LProvincias=(ArrayList<Provincias>) iProvinciaService.obtenerProvincias();
		 ArrayList<Localidades> _LLocalidades=(ArrayList<Localidades>) ilocalidadService.obtenerLocalidades();
		 ArrayList<Generos> _LGeneros=(ArrayList<Generos>) iGeneroService.obtenerGeneros();
			ModelAndView model = new ModelAndView();
			
			model.setViewName("add");

			model.addObject("listpaises", _LPaises);
			model.addObject("listprovincias", _LProvincias);
			model.addObject("listlocalidades", _LLocalidades);
			model.addObject("listpersonas", _LPersonas);
			model.addObject("listgeneros", _LGeneros);
			return model;

		}
	 
	 @RequestMapping("agregarUsuario.html")
		public ModelAndView agregarUser(String txtNombre, String txtApellido, int txtDNI, String Sexo, String pais, String provincia, String localidad) {
		 ArrayList<Personas> _LPersonas=(ArrayList<Personas>) iPersonaService.obtenerPersonas();
		 Personas persona = new Personas();
		 persona.setNombre(txtNombre);
		 persona.setApellido(txtApellido);
		 persona.setDNI(txtDNI);
		 
		 
		 
			
		 ModelAndView model = new ModelAndView();
			model.setViewName("add");
			ArrayList<Personas> _LPersonas1=(ArrayList<Personas>) iPersonaService.obtenerPersonas();
			 model.addObject("listpersonas", _LPersonas1);
			return model;

		}

}

