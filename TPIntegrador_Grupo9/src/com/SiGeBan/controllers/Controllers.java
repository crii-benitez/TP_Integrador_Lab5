package com.SiGeBan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.SiGeBan.models.commerce.NegMovimientos;
import com.SiGeBan.models.entity.Movimientos;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Controllers {
	
	/*@Autowired
	@Qualifier("servicioMovimientos")
	private NegMovimientos negocioMovimiento;
	@Autowired
	private Movimientos movimiento;*/

	@RequestMapping("IrALogin.html")
	public ModelAndView eventoRedireccionarLogin()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("login");
		return MV;
		
	}
    @RequestMapping("IrAMovimientos.html")
    public ModelAndView listMovement() {
    	ObjectMapper mapper = new ObjectMapper();
    	
    	/*List<?> listMovement=negocioMovimiento.listarMovimientos();*/
            
        ModelAndView model = new ModelAndView("movementhistory");
        
        String json = "";
        /*try {
            json = mapper.writeValueAsString(listMovement);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        model.addObject("listmovimientos", json);
        
        return model;

    }
    
    @RequestMapping("IrAAdd.html")
    public ModelAndView abrirAdd() {   
        
        ModelAndView model = new ModelAndView();
        model.setViewName("add");
        return model;

    }
    
    @RequestMapping("IrAAddAccount.html")
    public ModelAndView abrirAddAccount() {   
        
        ModelAndView model = new ModelAndView();
        model.setViewName("addaccount");
        return model;

    }
    @RequestMapping("IrATransferencias.html")
    public ModelAndView abrirTransferencias() {   
        
        ModelAndView model = new ModelAndView("transferencias");
        //model.setViewName("transferencias");
        return model;

    }
    
   
	
    
	public Controllers() {
		// TODO Auto-generated constructor stub
	}

}
