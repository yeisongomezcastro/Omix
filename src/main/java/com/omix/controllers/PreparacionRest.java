package com.omix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omix.exception.OmixException;
import com.omix.model.PreparacionDTO;
import com.omix.services.IPreparacionServicio;

@Controller
@RequestMapping("/omix")
public class PreparacionRest {
	
	@Autowired
	IPreparacionServicio preparacionServicio;
	
	@RequestMapping(method = RequestMethod.POST, value = "/registrarpreparacion")
	public ResponseEntity<Object> registraringresarVehiculoParqueadero(@RequestBody PreparacionDTO preparacion) {
		try {
			preparacionServicio.gurdarPreparacion(preparacion);
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(preparacion, HttpStatus.OK);

	}

}
