package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.PacienteEntidad;

@Repository("LaboratorioRepository")

public interface IPacienteRepository extends JpaRepository<PacienteEntidad,Serializable> {
	
	
}
