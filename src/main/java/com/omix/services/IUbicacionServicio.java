package com.omix.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.omix.entity.UbicacionEntidad;

@Service
public interface IUbicacionServicio {

	public List<UbicacionEntidad> listarUbicacion();

	public UbicacionEntidad guardarUbicacion(UbicacionEntidad ubicacionEntidad);

	public UbicacionEntidad actualizarUbicacion(UbicacionEntidad ubicacionEntidad);

	public Optional<UbicacionEntidad> consultarubicacionPorId(Integer id);

}
