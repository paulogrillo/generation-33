package com.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class HelloWorldController {
	
	@GetMapping
	public String testeHello() {
		return "Habilidade: Atenção ao detalhe\nMentalidade: Persistência";
	}

}
