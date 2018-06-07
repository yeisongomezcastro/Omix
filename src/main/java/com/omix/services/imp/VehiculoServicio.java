package com.omix.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.IVehiculoRepository;
import com.omix.entity.VehiculoEntidad;
import com.omix.services.IVehiculoServicio;

@Service
public class VehiculoServicio implements IVehiculoServicio {

	@Autowired
	IVehiculoRepository  vehiculoRepository;
	
	@Override
	public List<VehiculoEntidad> listarVehiculos() {
		return vehiculoRepository.findAll();
	}

}
