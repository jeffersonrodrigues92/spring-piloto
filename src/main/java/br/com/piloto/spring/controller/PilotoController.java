package br.com.piloto.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/piloto")
public class PilotoController {

	
	@GetMapping
	public ResponseEntity<String> get(){
		String retorno = "It's working";
		return new ResponseEntity<String>(retorno, HttpStatus.OK);
	}
	
}
