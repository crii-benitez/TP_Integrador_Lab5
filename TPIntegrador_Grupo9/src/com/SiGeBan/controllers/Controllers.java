package com.SiGeBan.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Controllers {

	@RequestMapping("IrALogin.html")
	public ModelAndView eventoRedireccionarLogin()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("/login");
		return MV;
		
	}
    @RequestMapping(value = "IrAMovimientos.html", method = RequestMethod.GET)
    public ModelAndView listMovement() {
    	ObjectMapper mapper = new ObjectMapper();
    
        List<String> listMovement = new ArrayList<String>();
        listMovement.add("List A");
        listMovement.add("List B");
        listMovement.add("List C");
        listMovement.add("List D");
        listMovement.add("List E");
        
        ModelAndView model = new ModelAndView("movementhistory");
        
        String json = "";
        try {
            json = mapper.writeValueAsString(listMovement);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
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
