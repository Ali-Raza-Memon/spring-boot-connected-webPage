package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	
	@PostMapping("/login")
	public String welcomePage(ModelMap model  , @RequestParam String userId,@RequestParam String password) {
		
		if(userId.equals("admin") && password.equals("root")) {
			return "welcome";
		}
		
		model.put("errorMsg", "Please provide the correct userId and password");
		
		return "login";
	}

	

}
