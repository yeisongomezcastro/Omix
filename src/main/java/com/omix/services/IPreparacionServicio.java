package com.omix.services;


import java.util.List;

import com.omix.entity.PreparacionEntidad;

public interface IPreparacionServicio {
	
	public PreparacionEntidad gurdarPreparacion(PreparacionEntidad preparacionEntidad);
	public List<PreparacionEntidad> consultarPreparacion();

}
