package com.example.Springboot_jpaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {

	@GetMapping("/test")
	private String test() {
		;
		return "sucesso";
	}
@GetMapping("/test-api")
	public String testApi(@RequestParam(name = "nome") String nome) {
		return "olá" + nome + "seja bem vindo"; 
	}
}
