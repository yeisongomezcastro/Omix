package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.RecepcionMedicamentoEntidad;

@Repository("RecepcionMedicamentoRepository")

public interface IRecepcionMedicamentoRepository extends JpaRepository<RecepcionMedicamentoEntidad,Serializable>{

}
