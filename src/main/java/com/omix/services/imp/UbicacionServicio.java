package com.omix.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.IUbicacionRepository;
import com.omix.entity.UbicacionEntidad;
import com.omix.services.IUbicacionServicio;

@Service
public class UbicacionServicio implements IUbicacionServicio {
	
	@Autowired
	IUbicacionRepository ubicacionRepository;

	@Override
	public List<UbicacionEntidad> listarUbicacion() {
		return ubicacionRepository.findAll();
	}

	@Override
	public UbicacionEntidad guardarUbicacion(UbicacionEntidad ubicacionEntidad) {
		return ubicacionRepository.save(ubicacionEntidad);
	}

	@Override
	public UbicacionEntidad actualizarUbicacion(UbicacionEntidad ubicacionEntidad) {
		return ubicacionRepository.save(ubicacionEntidad);
	}

	@Override
	public Optional<UbicacionEntidad> consultarubicacionPorId(Integer id) {
	return ubicacionRepository.findById(id);
	}
	

}
