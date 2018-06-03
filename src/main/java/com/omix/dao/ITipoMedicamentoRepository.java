package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.TipoMedicamentoEntidad;

@Repository("TipoMedicamentoRepository")

public interface ITipoMedicamentoRepository extends JpaRepository<TipoMedicamentoEntidad,Serializable> {

}
