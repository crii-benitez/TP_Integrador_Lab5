package main.java.com.SiGeBan.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Objects;
//import java.util.Date;
import java.sql.Date;

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
		 
		 String mensaje ="";
		 
		 ArrayList<Paises> _LPaises=(ArrayList<Paises>) iPaisService.obtenerPaises();
		 ArrayList<Provincias> _LProvincias=(ArrayList<Provincias>) iProvinciaService.obtenerProvincias();
		 ArrayList<Localidades> _LLocalidades=(ArrayList<Localidades>) ilocalidadService.obtenerLocalidades();
		 ArrayList<Generos> _LGeneros=(ArrayList<Generos>) igeneroService.obtenerGeneros();
		 ArrayList<Perfiles> _LPerfiles=(ArrayList<Perfiles>) iperfilService.obtenerPerfiles();
		 
		 Personas persona = new Personas();
		 Personas personaPrueba = new Personas();
		 
		 Generos genero = new Generos();
		 Paises pais = new Paises();
		 Usuario usuario = new Usuario();
		 Perfiles perfil = new Perfiles();
		 Provincias provincia = new Provincias();
		 Localidades localidad = new Localidades();
		 
		 perfil  = iperfilService.obtenePerfilPorId(txtPerfil);
		 
		 pais = iPaisService.obtenerUnPais(txtPais);
		 
		 provincia = iProvinciaService.obtenerUnProvincia(txtProvincia);
		 
		localidad = ilocalidadService.obtenerUnLocalidad(txtLocalidad);
		 
		genero = igeneroService.obtenerGeneroPorId(txtSexo);

		if (txtFecha.isEmpty()) {
			txtFecha="2000-01-01";
		} 
		 Date date = Date.valueOf(txtFecha);
		 if (txtNombre.isEmpty()) {
				mensaje = "NO se puede crear usuario sin NOMBRE";
			}
		 if (txtApellido.isEmpty()) {
				mensaje = "NO se puede crear usuario sin APELLIDO";
			}
		if (txtDNI.isEmpty()) {
			mensaje = "NO se puede crear usuario sin DNI";
		}
		personaPrueba= iPersonaService.obtenerUnRegistro(txtDNI);
		if (mensaje.isEmpty()) {
			if (Objects.isNull(personaPrueba)){
	
			 usuario.setActivo(true);
			 usuario.setPerfil(perfil);
			 usuario.setPass("1234");
			 usuario.setUsuario(txtNombre.substring(0,3)+txtApellido.substring(0,3));
			 
			 persona.setNombre(txtNombre);
			 persona.setApellido(txtApellido);
			 persona.setFechanac(date);
			 persona.setDNI(txtDNI);
			 persona.setPais(pais);
			 persona.setProvincia(provincia);
			 persona.setLocalidad(localidad);
			 persona.setDireccion(txtCalle + " " + txtNumero + " " + txtDto);
			 persona.setUsuario(usuario);
			 persona.setGenero(genero);
			 
				 try {
					 iPersonaService.insertarPersona(persona);
					
					 mensaje = "Usuario Creado";
				
					 
				} catch (Exception e) {
					mensaje = "No se pudo crear el usuario";
					
				}
			}else
			{
				mensaje="No se puede insertar usuario - DNI DUPLICADO: "+txtDNI;
			}
		}
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
