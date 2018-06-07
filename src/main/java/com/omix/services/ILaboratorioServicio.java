package com.omix.services;

import java.util.List;
import java.util.Optional;

import com.omix.entity.LaboratorioEntidad;

public interface ILaboratorioServicio {

	public List<LaboratorioEntidad> listarLaboratorios();

	public LaboratorioEntidad guardarLaboratorio(LaboratorioEntidad laboratorioEntidad);

	public LaboratorioEntidad actualizarLaboratorio(LaboratorioEntidad laboratorioEntidad);

	public Optional<LaboratorioEntidad> buscarLaboratorioPorId(Integer id);

}
