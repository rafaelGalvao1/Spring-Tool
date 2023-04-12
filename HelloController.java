package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica para o spring que o codigo abaixo vai ser um controller, ou um controlador da nossa api
@RestController

// indica o endpoint da nossa classe controladora
@RequestMapping ("/hello")

public class HelloController {

	@GetMapping
	public String hello() {
		return "Alo mundão, te desejo tudo de bom!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação aos detalhes e percistencia!!!";
	}
	
	@GetMapping("/listaBSM")
	public String listaBSM() {
		return "Organizar e realizar todas atividades, atualizar o linkedin, refazer alguns exercicios para melhorar a fixação do conteudo, fazer o pitch!!!";
	}
	
	@GetMapping("/agendamentos")
	public String agendamentos() {
		return "treinamento de entrevista, revisão do linkedin com bem estar, revisão de curriculo!!!";
	}
	
}
