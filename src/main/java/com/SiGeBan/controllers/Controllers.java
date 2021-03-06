package main.java.com.SiGeBan.controllers;

import java.util.Objects;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import main.java.com.SiGeBan.models.entity.Usuario;
import main.java.com.SiGeBan.models.services.IUsuarioService;

@Controller
public class Controllers {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("servicioMovimientos") private NegMovimientos negocioMovimiento;
	 */
	@Autowired
	private IUsuarioService iUsuarioService;

	@RequestMapping("IrALogin.html")
	public ModelAndView eventoRedireccionarLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;

	}

//	@RequestMapping("IrAMisCuentas.html")
//	public ModelAndView eventoRedireccionarMisCuentas() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("MisCuentas");
//		return mv;
//
//	}

	@RequestMapping(value = "AccionLoguear.html", method= { RequestMethod.GET, RequestMethod.POST})
	public ModelAndView accionLoguear(String txtUsuario, String txtPass) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("usuarioLogueado"); //comentar esta linea para implementar navegacion
		mv.addObject("txtUsuario", txtUsuario);
		Usuario usuario = iUsuarioService.obtenerUnRegistro(txtUsuario);
		
		if (Objects.isNull(usuario)){
			
			mv.setViewName("login");
		}else
		{
		
		mv.addObject("txtPerfil",usuario.getPerfil().getIdPerfil());
		mv.addObject("txtPass",usuario.getPass());
		if (txtPass.trim().isEmpty() || !txtPass.trim().equals(usuario.getPass()))
			mv.setViewName("login");
//		if(usuario.getPerfil().getIdPerfil()== 1)
//			mv.setViewName("addaccount");
//		else
//			mv.setViewName("Cuentas");
		}
		return mv;
	}

	// @RequestMapping("AccionLoguear.html")
	// public ModelAndView accionLoguear(String txtUsuario, String txtPass) {
	// UsuarioDAO UserDao = new UsuarioDAO();
	// Usuario User = new Usuario();

	// ModelAndView mv = new ModelAndView();

	// User = UserDao.prueba1(txtUsuario,txtPass);
	// if (Objects.isNull(User)){
	//
	// mv.setViewName("login");
	//
	// }else
	// {
	// mv.addObject("txtUsuario", User.getUsuario());
	// mv.addObject("txtPass", User.getPass());
	// mv.addObject("txtPerfil", User.getPerfil().getIdPerfil());
	//
	// if (User.getPerfil().getIdPerfil() == 2){
	// mv.setViewName("usuarioLogueado");
	// }else
	// {
	// mv.setViewName("usuarioLogueado");
	//
	// }
	//
	// }
	// mv.addObject("txtUsuario", User.prueba1(txtUsuario));
	// mv.addObject("txtPrueba","si le pongo un texto cualquiera anda, pero no toma
	// el post");
	// mv.setViewName("usuarioLogueado");
	// return mv;
	// }

	// @RequestMapping("IrAMovimientos.html")
	// public ModelAndView listMovement() {
	// DaoMovimientos Movs = new DaoMovimientos();
	//
	// ArrayList<Movimientos>
	// _Lmovimientos=(ArrayList<Movimientos>)Movs.ListarMovimientos();
	// ModelAndView model = new ModelAndView("movementhistory");
	//
	// model.addObject("listmovimientos", _Lmovimientos);
	// return model;
	//
	// }

//	@RequestMapping("IrAAdd.html")
//	public ModelAndView abrirAdd() {
//
//		ModelAndView model = new ModelAndView();
//		model.setViewName("add");
//		return model;
//
//	}

//	@RequestMapping("IrAUsuarios.html")
//	public ModelAndView abrirUsuarios() {
//
//		ModelAndView model = new ModelAndView();
//		model.setViewName("Usuarios");
//		return model;
//
//	}

	/*@RequestMapping("IrACuentas.html")
	public ModelAndView abrirCuentas() {

		ModelAndView model = new ModelAndView();
		model.setViewName("Cuentas");
		return model;

	}

	@RequestMapping("IrAAddAccount.html")
	public ModelAndView abrirAddAccount() {

		ModelAndView model = new ModelAndView();
		model.setViewName("addaccount");
		return model;

	}*/

	/*
	 * public Controllers() { // TODO Auto-generated constructor stub }
	 */

}
