package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.omix.entity.LaboratorioEntidad;

@Service
@Repository("LaboratorioRepository")
public interface ILaboratorioRepository extends JpaRepository<LaboratorioEntidad,Serializable>{
	
}
