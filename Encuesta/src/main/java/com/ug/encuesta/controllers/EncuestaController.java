package com.ug.encuesta.controllers;

import org.sp.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ug.encuesta.dominio.Encuesta;
import com.ug.encuesta.repository.EncuestaRepository;

@RestController
public class EncuestaController {

	@Autowired
	private EncuestaRepository encuestaRepository;
	
	@RequestMapping(value="/encuestas",method=RequestMethod.POST)
	public ResponseEntity<?> saveEncuesta(@RequestBody Encuesta encuesta)
	{
		encuestaRepository.save(encuesta);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@RequestMapping(value="/encuestas", method=RequestMethod.GET)
	
	public ResponseEntity<?> getEncuestas(){
		return new ResponseEntity<>(encuestaRepository.findAll(),HttpStatus.OK);
		
	}

}
