package com.omix.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omix.dao.ITipoMedicamentoRepository;
import com.omix.entity.TipoMedicamentoEntidad;
import com.omix.services.ITipoMedicamentoServicio;

@Service
public class TipoMedicamentoServicio implements ITipoMedicamentoServicio {

	@Autowired
	ITipoMedicamentoRepository tipoMediamentoRepository;
	
	@Override
	public List<TipoMedicamentoEntidad> listarTipoMedicamento() {
		return tipoMediamentoRepository.findAll();
	}

	@Override
	public TipoMedicamentoEntidad guardarTipoMedicamento(TipoMedicamentoEntidad medicamentoEntidad) {
		return tipoMediamentoRepository.save(medicamentoEntidad);
	}

	@Override
	public TipoMedicamentoEntidad actualizarTipoMedicamento(TipoMedicamentoEntidad medicamentoEntidad) {
		return tipoMediamentoRepository.save(medicamentoEntidad);
	}

	@Override
	public Optional<TipoMedicamentoEntidad> consultarPorId(String id) {
		return tipoMediamentoRepository.findById(id);
	}

}
