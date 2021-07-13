package main.java.com.SiGeBan.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.java.com.SiGeBan.models.entity.Generos;
import main.java.com.SiGeBan.models.entity.Localidades;
import main.java.com.SiGeBan.models.entity.Paises;
import main.java.com.SiGeBan.models.entity.Perfiles;
import main.java.com.SiGeBan.models.entity.Personas;
import main.java.com.SiGeBan.models.entity.Provincias;
import main.java.com.SiGeBan.models.entity.Usuario;
import main.java.com.SiGeBan.models.services.IGeneroService;
import main.java.com.SiGeBan.models.services.ILocalidadService;
import main.java.com.SiGeBan.models.services.IPaisService;
import main.java.com.SiGeBan.models.services.IPerfilService;
import main.java.com.SiGeBan.models.services.IPersonaService;
import main.java.com.SiGeBan.models.services.IProvinciaService;
import static javax.swing.JOptionPane.showMessageDialog;



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
	@Autowired
	private IGeneroService igeneroService;
	@Autowired
	private IPerfilService iperfilService;
	
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
		 ArrayList<Generos> _LGeneros=(ArrayList<Generos>) igeneroService.obtenerGeneros();
		 ArrayList<Perfiles> _LPerfiles=(ArrayList<Perfiles>) iperfilService.obtenerPerfiles();
			ModelAndView model = new ModelAndView();
			
			model.setViewName("add");

			model.addObject("listpaises", _LPaises);
			model.addObject("listprovincias", _LProvincias);
			model.addObject("listlocalidades", _LLocalidades);
			model.addObject("listpersonas", _LPersonas);
			model.addObject("listgeneros", _LGeneros);
			model.addObject("listperfiles", _LPerfiles);
			return model;

		}
	 
	 @RequestMapping("agregarUsuario.html")
		public ModelAndView agregarUser(String txtNombre, String txtApellido,Integer txtPerfil, String txtFecha, String txtDNI, Integer txtSexo, Integer txtPais, Integer txtProvincia, Integer txtLocalidad, String txtCalle, String txtNumero, String txtDto) {
		 ArrayList<Paises> _LPaises=(ArrayList<Paises>) iPaisService.obtenerPaises();
		 ArrayList<Provincias> _LProvincias=(ArrayList<Provincias>) iProvinciaService.obtenerProvincias();
		 ArrayList<Localidades> _LLocalidades=(ArrayList<Localidades>) ilocalidadService.obtenerLocalidades();
		 ArrayList<Generos> _LGeneros=(ArrayList<Generos>) igeneroService.obtenerGeneros();
		 ArrayList<Perfiles> _LPerfiles=(ArrayList<Perfiles>) iperfilService.obtenerPerfiles();
		 
		 Personas persona = new Personas();
		 Generos genero = new Generos();
		 Paises pais = new Paises();
		 Usuario usuario = new Usuario();
		 Perfiles perfil = new Perfiles();
		 Provincias provincia = new Provincias();
		 Localidades localidad = new Localidades();
		 
		 perfil  = iperfilService.obtenePerfilPorId(txtPerfil);
		// perfil.setIdPerfil(txtPerfil);	 
		// perfil.setPerfil(perfil);
		 
		 pais = iPaisService.obtenerUnPais(txtPais);
	//	 pais.setIdPais(txtPais);
		 
		 provincia = iProvinciaService.obtenerUnProvincia(txtProvincia);
	//	 provincia.setIdProvincia(txtProvincia);
		 
		localidad = ilocalidadService.obtenerUnLocalidad(txtLocalidad);
		// localidad.setIdLocalidad(txtLocalidad);
		 
		genero = igeneroService.obtenerGeneroPorId(txtSexo);
	//	 genero.setIdGenero(txtSexo);
		
		//2000-11-10
		
		int anio= 2020;//Integer.parseInt(txtFecha.substring(0,4));
		int mes= 02;//Integer.parseInt(txtFecha.substring(5,7));
		int dia= 01;//Integer.parseInt(txtFecha.substring(8,10));
//		
		Date fechaCrea = new java.sql.Date(anio,mes,dia);
//		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
//		//String strFecha = “2007-12-25”;
//		Date fecha = null;
//		try {
//		fecha = formatoDelTexto.parse(txtFecha);
//		}catch (ParseException ex) {
//
//			ex.printStackTrace();
//
//		}
		 usuario.setActivo(true);
		 usuario.setPerfil(perfil);
		 usuario.setPass("1234");
		 usuario.setUsuario(txtNombre.substring(0,3)+txtApellido.substring(0,3));
		 
		 persona.setNombre(txtNombre);
		 persona.setApellido(txtApellido);
		 persona.setFechanac(fechaCrea);
		 persona.setDNI(txtDNI);
		 persona.setPais(pais);
		 persona.setProvincia(provincia);
		 persona.setLocalidad(localidad);
		 persona.setDireccion(txtCalle + " " + txtNumero + " " + txtDto);
		 persona.setUsuario(usuario);
		 persona.setGenero(genero);
		 
		 String mensaje ="";
		 
		 try {
			 iPersonaService.insertarPersona(persona);
			
			 mensaje = "Usuario Creado";
		
			 
		} catch (Exception e) {
			mensaje = e.toString();
			
		}
		 //showMessageDialog(null, mensaje);
		 
		 ArrayList<Personas> ListaPersonas2=(ArrayList<Personas>) iPersonaService.obtenerPersonas();
		 ModelAndView model = new ModelAndView();
			model.setViewName("add");
			 model.addObject("listpersonas", ListaPersonas2);
				model.addObject("listpaises", _LPaises);
				model.addObject("listprovincias", _LProvincias);
				model.addObject("listlocalidades", _LLocalidades);
				model.addObject("listgeneros", _LGeneros);
				model.addObject("listperfiles", _LPerfiles);
				model.addObject("mensaje", mensaje);
			return model;

		}

}
