package com.example.jspcontroller.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RESTController {
	
	@RequestMapping(value="/")
	public String testController() {
		return "<<< JSP REST CONTROLLER RUNNING >>>";
	}
	
	
	@RequestMapping(value="/loginREST")
	public void fromLoginPage(String username, String password, ModelMap map) {
		RestTemplate restTemplate = new RestTemplate();
		
		
	}

}
