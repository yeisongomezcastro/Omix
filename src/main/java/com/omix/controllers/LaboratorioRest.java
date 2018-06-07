package com.omix.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omix.entity.LaboratorioEntidad;
import com.omix.exception.OmixException;
import com.omix.services.ILaboratorioServicio;

@Controller
@RequestMapping("/omix")
public class LaboratorioRest {

	@Autowired
	ILaboratorioServicio  laboratorioServicio;

	@RequestMapping(method = RequestMethod.GET, value = "/cargarLaboratorios")
	public ResponseEntity<Object> listarubicacion() {
		List<LaboratorioEntidad> listaLaboratorioEntidad;
		try {
			listaLaboratorioEntidad = laboratorioServicio.listarLaboratorios();
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(listaLaboratorioEntidad, HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/guardarActualizarLaboratorio")
	public ResponseEntity<Object> registraringresarVehiculoParqueadero(
			@RequestBody LaboratorioEntidad laboratorioEntidad) {
		try {
			laboratorioServicio.guardarLaboratorio(laboratorioEntidad);
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(laboratorioEntidad, HttpStatus.OK);

	}
	
	@RequestMapping(method = RequestMethod.GET,value="/consultarLaboratoriById/{id}")
	public ResponseEntity<Object> consultarLaboratoriById(@PathVariable("id") Integer id) {
		Optional<LaboratorioEntidad> laboratorioEntidad;
		try {
			laboratorioEntidad = laboratorioServicio.buscarLaboratorioPorId(id);
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(laboratorioEntidad, HttpStatus.OK);

	}

}
