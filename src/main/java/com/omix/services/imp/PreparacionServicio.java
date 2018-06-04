package com.omix.services.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.omix.dao.IPreparacionRepository;
import com.omix.entity.PreparacionEntidad;
import com.omix.model.PreparacionDTO;
import com.omix.services.IPreparacionServicio;

public class PreparacionServicio implements IPreparacionServicio{
	
	@Autowired
	IPreparacionRepository preparacionRepository;
	PreparacionEntidad preparacionEntidad;
	
	@Override
	public PreparacionEntidad gurdarPreparacion(PreparacionDTO preparacionDTO) {
		//preparacionEntidad = preparacionDTO hacer databuilder para convertir domain a entity
		return preparacionRepository.save(preparacionEntidad);
	}

}
