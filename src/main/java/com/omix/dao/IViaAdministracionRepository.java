package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.ViaAdministracionEntidad;

@Repository("ViaAdministracionRepository")

public interface IViaAdministracionRepository extends JpaRepository<ViaAdministracionEntidad, Serializable> {

}
