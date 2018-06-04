package com.omix.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omix.entity.UbicacionEntidad;

@Service
public interface IUbicacionServicio {
	
	public List<UbicacionEntidad> listarUbicacion();

}
