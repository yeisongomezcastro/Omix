package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.UbicacionEntidad;

@Repository("UbicacionRepository")

public interface IUbicacionRepository extends JpaRepository<UbicacionEntidad,Serializable>{

}
