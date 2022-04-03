package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class main_controller {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String prepareView() {
		
		return "login";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String myView() {
		
		return "index";
	}
	

}
