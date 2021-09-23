package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/teste2")
public class Controller {
	
	@GetMapping
	public String testeHello() {
		return "Aprender mais sobre arquitetura DAL e toda camada controller.";
	}


}
