package com.whnm.springbootrest.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whnm.springbootrest.model.Curso;
import com.whnm.springbootrest.model.Persona;

@RestController
public class DemoController {
	
	@GetMapping("/")
//	@GetMapping(value = "/", produces = "application/xml")
	public ResponseEntity<Persona> mostrar() {
		Curso cur = Curso.builder()
				.id(3)
				.nombre("Developer FullStack Spring boot y Angular")
				.build();
		
		Persona per = Persona.builder()
				.id(1)
				.nombre("Wilson Neira")
				.curso(cur)
				.build();
		
		return new ResponseEntity<Persona>(per, HttpStatus.OK);
		
	}
	
}
