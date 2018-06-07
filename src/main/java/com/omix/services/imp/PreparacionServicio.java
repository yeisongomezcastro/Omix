package com.omix.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.IPreparacionRepository;
import com.omix.entity.PreparacionEntidad;
import com.omix.services.IPreparacionServicio;

@Service
public class PreparacionServicio implements IPreparacionServicio{
	
	@Autowired
	IPreparacionRepository preparacionRepository;
	PreparacionEntidad preparacionEntidad;
	
	@Override
	public PreparacionEntidad gurdarPreparacion(PreparacionEntidad preparacionEntidad) {
		return preparacionRepository.save(preparacionEntidad);
	}

	@Override
	public List<PreparacionEntidad> consultarPreparacion() {
		return preparacionRepository.findAll();
	}

	@Override
	public List<PreparacionEntidad> consultarPreparacionPorDocumento(String nroDocumento) {
		return preparacionRepository.consultarMedicamentoPorNombre(nroDocumento);
	}

	@Override
	public PreparacionEntidad actualizarPreparacion(PreparacionEntidad preparacionEntidad) {
		return preparacionRepository.save(preparacionEntidad);
	}

}
