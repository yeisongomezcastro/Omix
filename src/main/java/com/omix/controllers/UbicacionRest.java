package com.omix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.omix.entity.UbicacionEntidad;
import com.omix.exception.OmixException;
import com.omix.services.IUbicacionServicio;




@Controller
@RequestMapping("/omix")
public class UbicacionRest {
	@Autowired
	IUbicacionServicio ubicacionServicio;

	@RequestMapping(method = RequestMethod.GET, value = "/cargarubicacion")
	public ResponseEntity<Object> listarubicacion() {
		List<UbicacionEntidad> ubicacionEntidad;
		try {
			ubicacionEntidad = ubicacionServicio.listarUbicacion();
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(ubicacionEntidad, HttpStatus.OK);

	}
}
