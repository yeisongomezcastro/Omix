package com.omix.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.IUnidadMedidaRepository;
import com.omix.entity.UnidadMedidaEntidad;
import com.omix.services.IUnidadMedidaServicio;

@Service
public class UnidadMedidaServicio implements IUnidadMedidaServicio {

	@Autowired
	IUnidadMedidaRepository unidadMedidaRepository;
	
	@Override
	public List<UnidadMedidaEntidad> listarUnidadMedida() {
		return unidadMedidaRepository.findAll();
	}

}
