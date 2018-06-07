package com.omix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.omix.entity.UnidadMedidaEntidad;
import com.omix.exception.OmixException;
import com.omix.services.IUnidadMedidaServicio;


@Controller
@RequestMapping("/omix")
public class UnidadMedidaRest {

	@Autowired
	IUnidadMedidaServicio  unidadMedidaServicio;

	@RequestMapping(method = RequestMethod.GET, value = "/cargarUnidadMedida")
	public ResponseEntity<Object> listarubicacion() {
		List<UnidadMedidaEntidad> listaUnidaMedidaEntidad;
		try {
			listaUnidaMedidaEntidad = unidadMedidaServicio.listarUnidadMedida();
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(listaUnidaMedidaEntidad, HttpStatus.OK);

	}

	
}
