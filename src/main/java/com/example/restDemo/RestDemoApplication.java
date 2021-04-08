package com.example.restDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.restDemo.model.UserModel;

@SpringBootApplication
@RestController
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public ModelAndView hello(Model model) {
		ModelAndView mv = new ModelAndView("index.html");
		return mv;
	}
	
	@GetMapping("/submit")
	public String formsubmit(UserModel user) {
		return "<h1 style='color:blue;text-align:center;'> Hello "+user.getName()+ " " + user.getSurname()+ " Welcome to Azure. <br>"+"<a href='/'><button>Go Back</button></a>";
	}
	
}
