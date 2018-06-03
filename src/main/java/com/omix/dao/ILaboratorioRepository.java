package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.LaboratorioEntidad;


@Repository("LaboratorioRepository")

public interface ILaboratorioRepository extends JpaRepository<LaboratorioEntidad,Serializable>{
	
}
