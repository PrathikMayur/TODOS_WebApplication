package com.in28minutes.springboot.myfirstwebapp.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Gym {
	
	@RequestMapping("GymLogin")
	public String goToLogin() {
	 return "GymLogin";	
	}

}
