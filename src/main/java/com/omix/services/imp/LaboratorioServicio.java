package com.omix.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.ILaboratorioRepository;
import com.omix.entity.LaboratorioEntidad;
import com.omix.services.ILaboratorioServicio;

@Service
public class LaboratorioServicio implements ILaboratorioServicio {

	@Autowired
	ILaboratorioRepository laboratorioRepository;

	@Override
	public List<LaboratorioEntidad> listarLaboratorios() {
		return laboratorioRepository.findAll();
	}

	@Override
	public LaboratorioEntidad guardarLaboratorio(LaboratorioEntidad laboratorioEntidad) {
		return laboratorioRepository.save(laboratorioEntidad);
	}

	@Override
	public LaboratorioEntidad actualizarLaboratorio(LaboratorioEntidad laboratorioEntidad) {
		return laboratorioRepository.save(laboratorioEntidad);
	}

	@Override
	public Optional<LaboratorioEntidad> buscarLaboratorioPorId(Integer id) {
		return laboratorioRepository.findById(id);
	}

}
