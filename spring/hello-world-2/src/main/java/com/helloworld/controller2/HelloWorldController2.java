package com.helloworld.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste2")
public class HelloWorldController2 {
	
	@GetMapping
	public String testeGetMapping() {
		return "Objetivo de aprendizagem da semana: \nAprender mais sobre o padrão DAL, e entender mais sobre a camada controller.";
	}

}
