package com.example.com.spring.portfolio.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {	
			 @GetMapping("/")
			    public String showLoginPage() {
			        return "portfolio";
			    }
			 
			 @GetMapping("/contact")
				public String showContactPage() {
				    return "contact"; 
				}
			 @GetMapping("/about")
				public String showAboutPage() {
				    return "dashboard"; 
				}
			 @GetMapping("/education")
				public String showEduPage() {
			 return "education"; 
			 }
			 @GetMapping("/skills")
				public String showSkillsPage() {
				    return "skills"; 
			 }
			 
			@PostMapping("/portfolio")
		    public String showPortfolioPage(@RequestParam String name, @RequestParam String password) {
			
				if(name.equals("Pavan") && password.equals("wipro")) {
		    		return "dashboard";
		    	}else {
		    		System.out.println("failed");
		    		
		    		return "portfolio";
		    	}		

		}
		}

