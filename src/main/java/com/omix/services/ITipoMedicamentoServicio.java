package com.omix.services;

import java.util.List;
import java.util.Optional;

import com.omix.entity.TipoMedicamentoEntidad;

public interface ITipoMedicamentoServicio {

	public List<TipoMedicamentoEntidad> listarTipoMedicamento();

	public TipoMedicamentoEntidad guardarTipoMedicamento(TipoMedicamentoEntidad medicamentoEntidad);

	public TipoMedicamentoEntidad actualizarTipoMedicamento(TipoMedicamentoEntidad medicamentoEntidad);

	public Optional<TipoMedicamentoEntidad> consultarPorId(String id);

}
