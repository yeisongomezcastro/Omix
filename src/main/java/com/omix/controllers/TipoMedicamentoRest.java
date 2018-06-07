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

import com.omix.entity.TipoMedicamentoEntidad;
import com.omix.exception.OmixException;
import com.omix.services.ITipoMedicamentoServicio;

@Controller
@RequestMapping("/omix")
public class TipoMedicamentoRest {

	@Autowired
	ITipoMedicamentoServicio tipoMedicamentoServicio;

	@RequestMapping(method = RequestMethod.GET, value = "/cargarTiposMedicamentos")
	public ResponseEntity<Object> listarubicacion() {
		List<TipoMedicamentoEntidad> listaMedicamentoEntidad;
		try {
			listaMedicamentoEntidad = tipoMedicamentoServicio.listarTipoMedicamento();
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(listaMedicamentoEntidad, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.GET,value="/consultarTipoMedicamentoId/{id}")
	public ResponseEntity<Object> consultarTipoMedicamentoId(@PathVariable("id") String id) {
		Optional<TipoMedicamentoEntidad> tipoMedicamentoEntidad;
		try {
			tipoMedicamentoEntidad = tipoMedicamentoServicio.consultarPorId(id);
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(tipoMedicamentoEntidad, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/guardarActualizarTipoMedicamento")
	public ResponseEntity<Object> registraringresarVehiculoParqueadero(
			@RequestBody TipoMedicamentoEntidad medicamentoEntidad) {
		try {
			tipoMedicamentoServicio.guardarTipoMedicamento(medicamentoEntidad);
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(medicamentoEntidad, HttpStatus.OK);

	}

}
