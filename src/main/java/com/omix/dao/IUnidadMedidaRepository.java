package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.UnidadMedidaEntidad;

@Repository ("UnidadMedidaRepository")

public interface IUnidadMedidaRepository extends JpaRepository<UnidadMedidaEntidad,Serializable> {

}
