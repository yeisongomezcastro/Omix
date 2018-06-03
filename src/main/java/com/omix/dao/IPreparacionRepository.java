package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omix.entity.PreparacionEntidad;

@Repository("PreparacionRepository")

public interface IPreparacionRepository extends JpaRepository<PreparacionEntidad,Serializable> {

}
