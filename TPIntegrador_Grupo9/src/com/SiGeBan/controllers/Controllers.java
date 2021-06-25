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
    @RequestMapping(value = "traermovhistoricos.html", method = RequestMethod.GET)
    public ModelAndView listMovement() {
    	ObjectMapper mapper = new ObjectMapper();
    
        List<String> list = new ArrayList<String>();
        list.add("List A");
        list.add("List B");
        list.add("List C");
        list.add("List D");
        list.add("List E");
        
        ModelAndView model = new ModelAndView("movementhistory");
        
        String json = "";
        try {
            json = mapper.writeValueAsString(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        model.addObject("listmovimientos", json);
        
        return model;

    }
	
	public Controllers() {
		// TODO Auto-generated constructor stub
	}

}
