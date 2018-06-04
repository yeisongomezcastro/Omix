package com.omix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omix.entity.MedicamentoEntidad;
import com.omix.exception.OmixException;
import com.omix.services.IMedicamentoServicio;

@Controller
@RequestMapping("/omix")
public class MedicamentoRest {
	
	@Autowired
	IMedicamentoServicio  medicamentoServicio;

	@RequestMapping(method = RequestMethod.GET, value = "/cargarmedicamentos")
	public ResponseEntity<Object> listarubicacion() {
		List<MedicamentoEntidad> listaMedicamentoEntidad;
		try {
			listaMedicamentoEntidad = medicamentoServicio.listarMedicamentos();
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(listaMedicamentoEntidad, HttpStatus.OK);

	}

}
