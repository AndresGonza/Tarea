package com.ug.encuesta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Voto;
import com.ug.encuesta.repository.VotoRepository;

@RestController
public class VotoController {

	@Autowired
	private VotoRepository votoRepository;
	
	@RequestMapping(value="/encuestas/{encuesta_id}/votos", method=RequestMethod.POST)
	public ResponseEntity<?> SaveVoto(@PathVariable int encuesta_id, @RequestBody Voto voto)
	{
	
		votoRepository.save(voto);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
}
