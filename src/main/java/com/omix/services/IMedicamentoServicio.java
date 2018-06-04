package com.omix.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omix.entity.MedicamentoEntidad;
@Service
public interface IMedicamentoServicio {
	
	public List<MedicamentoEntidad> listarMedicamentos();

}
