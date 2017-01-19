package com.antti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@ResponseBody
public class HelloController {
	
	@RequestMapping("/index")
	public String index(){
		return "Tämä on pääsivu";
	}
	
	@RequestMapping("/contact")
	public String hello(){
		return "Otamme teihin yhteyttä mahdollisimman pian";
	}
	
	@RequestMapping("/hello")
	public String greet(@RequestParam(name="location", required=false, defaultValue="earth") String location, @RequestParam(name="name" ,required=false, defaultValue="John Doe") String name) {

		
		return "<h1>Welcome to the " + location + " " + name + "!</h1>";
	}

}
