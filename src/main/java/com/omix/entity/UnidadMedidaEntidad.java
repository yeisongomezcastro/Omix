package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "UnidadMedida")

public class UnidadMedidaEntidad {
	
	@Id
	@Column(name = "id") 	
	private int id;
	
	@Column(name = "UnidadMedida") 	
	private String UnidadMedida; // Miligramos, microgramos, Unidades Internacionales
	
	@Column(name = "Abreviatura") 	
	private String Abreviatura; //mg, g, UI

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUnidadMedida() {
		return UnidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		UnidadMedida = unidadMedida;
	}

	public String getAbreviatura() {
		return Abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		Abreviatura = abreviatura;
	}
	
	

}
