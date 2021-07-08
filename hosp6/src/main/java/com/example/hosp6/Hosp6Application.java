package com.example.hosp6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Hosp6Application {

	public static void main(String[] args) {
		SpringApplication.run(Hosp6Application.class, args);
	}
	@GetMapping("/")
	public String hello(Model model){
		model.addAttribute("Привет мир");
		return "У МЕНЯ ПОЛУЧИЛОСЬ ТЕБЯ ПОЧИНИТЬ! Что же дальше?";
	}

}
