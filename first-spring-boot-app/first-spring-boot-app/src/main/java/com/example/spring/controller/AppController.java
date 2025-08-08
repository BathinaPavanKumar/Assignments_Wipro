package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	
	@GetMapping("/home")
    public String showHomePage() {
        return "home"; // This will map to /WEB-INF/home.jsp
    }
    @GetMapping("/test")
    public String testPage() {
        return "test"; // Resolves to /WEB-INF/test.jsp
}
    
    @PostMapping ("/login")
    public String loginvalidate (@RequestParam String name, @RequestParam String password ) {
    	
    	if(name.equals("admin") && password.equals("wipro")) {
    		return "dashboard";
    	}else {
    		System.out.println("failed");
    		return "home";
    	}
    	
   }}
