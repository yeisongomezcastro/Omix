package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.MedicamentoEntidad;

@Repository("MedicamentoRepository")

public interface IMedicamentoRepository extends JpaRepository<MedicamentoEntidad,Serializable>{
	
}
