package com.omix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.omix.entity.VehiculoEntidad;
import com.omix.exception.OmixException;
import com.omix.services.IVehiculoServicio;

@Controller
@RequestMapping("/omix")
public class VehiculoRest {
	
	@Autowired
	IVehiculoServicio  vehiculoServicio;

	@RequestMapping(method = RequestMethod.GET, value = "/cargarVehiculos")
	public ResponseEntity<Object> listarubicacion() {
		List<VehiculoEntidad> listaVehiculoEntidad;
		try {
			listaVehiculoEntidad = vehiculoServicio.listarVehiculos();
		} catch (OmixException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<>(listaVehiculoEntidad, HttpStatus.OK);

	}


}
