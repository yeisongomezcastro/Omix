package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.VehiculoEntidad;

@Repository("VehiculoRepository")

public interface IVehiculoRepository extends JpaRepository<VehiculoEntidad, Serializable> {

}
