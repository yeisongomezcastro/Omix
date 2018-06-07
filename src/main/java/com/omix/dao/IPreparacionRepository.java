package com.omix.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.omix.entity.PreparacionEntidad;

@Repository("PreparacionRepository")

public interface IPreparacionRepository extends JpaRepository<PreparacionEntidad,Serializable> {
	
@Query(value = "FROM Preparacion p WHERE p.paciente.id = :nroDocumento" , nativeQuery = true)
List<PreparacionEntidad> consultarMedicamentoPorNombre(@Param("nroDocumento") String nroDocumento);

}
