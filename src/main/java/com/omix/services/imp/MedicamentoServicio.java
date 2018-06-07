package com.omix.services.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.IMedicamentoRepository;
import com.omix.entity.MedicamentoEntidad;
import com.omix.services.IMedicamentoServicio;

@Service
public class MedicamentoServicio implements IMedicamentoServicio{
	
	@Autowired
	IMedicamentoRepository medicamentoRepository;

	@Override
	public List<MedicamentoEntidad> listarMedicamentos() {
		return medicamentoRepository.findAll();
	}

	@Override
	public MedicamentoEntidad guardarMedicamento(MedicamentoEntidad medicamentoEntidad) {
		return medicamentoRepository.save(medicamentoEntidad);
	}

	@Override
	public MedicamentoEntidad actualizarMedicamento(MedicamentoEntidad medicamentoEntidad) {
		return medicamentoRepository.save(medicamentoEntidad);
	}

	@Override
	public MedicamentoEntidad buscarMedicamentoPorNombre(String nombreMedicamento) {
		return medicamentoRepository.consultarMedicamentoPorNombre(nombreMedicamento);
	}

}
