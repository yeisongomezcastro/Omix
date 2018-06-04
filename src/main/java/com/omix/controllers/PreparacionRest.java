package com.omix.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omix.exception.OmixException;
import com.omix.model.PreparacionDTO;

@Controller
@RequestMapping("/omix")
public class PreparacionRest {
	
	@RequestMapping(method = RequestMethod.POST, value = "/registrarpreparacion")
	public ResponseEntity<Object> registraringresarVehiculoParqueadero(@RequestBody PreparacionDTO preparacion) {
		try {
			//vigilanteServicio.registraringresoVehiculoParqueadero(vehiculo);
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(preparacion, HttpStatus.OK);

	}

}
