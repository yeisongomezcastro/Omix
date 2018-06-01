package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="TipoMedicamento")

public class TipoMedicamentoEntidad {
	@Id
	@Column(name = "id") 	
	private String id; 
	
	@Column(name = "TipoMedicamento") 	
	private String TipoMedicamento; // Oncol - Inyec

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipoMedicamento() {
		return TipoMedicamento;
	}

	public void setTipoMedicamento(String tipoMedicamento) {
		TipoMedicamento = tipoMedicamento;
	}
	

}  	

	