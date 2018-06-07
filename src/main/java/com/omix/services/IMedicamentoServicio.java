package com.omix.services;

import java.util.List;

import com.omix.entity.MedicamentoEntidad;

public interface IMedicamentoServicio {

	public List<MedicamentoEntidad> listarMedicamentos();

	public MedicamentoEntidad guardarMedicamento(MedicamentoEntidad medicamentoEntidad);

	public MedicamentoEntidad actualizarMedicamento(MedicamentoEntidad medicamentoEntidad);

	public MedicamentoEntidad buscarMedicamentoPorNombre(String nombreMedicamento);

}
