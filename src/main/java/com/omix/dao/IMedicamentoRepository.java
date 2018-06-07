package com.omix.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.omix.entity.MedicamentoEntidad;

@Repository("MedicamentoRepository")

public interface IMedicamentoRepository extends JpaRepository<MedicamentoEntidad,Serializable>{
@Query(value = "FROM Medicamento m WHERE m.Medicamento = :nombreMedicamento" , nativeQuery = true)
MedicamentoEntidad consultarMedicamentoPorNombre(@Param("nombreMedicamento") String nombreMedicamento);
	
}
