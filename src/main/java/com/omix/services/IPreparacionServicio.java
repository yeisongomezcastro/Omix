package com.omix.services;


import com.omix.entity.PreparacionEntidad;
import com.omix.model.PreparacionDTO;

public interface IPreparacionServicio {
	
	public PreparacionEntidad gurdarPreparacion(PreparacionDTO preparacionDTO);

}
