package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Laboratorio")

public class LaboratorioEntidad {
	
	@Id
	@Column (name = "id")
	private int id;
	
	@Column(name = "Laboratorio")
	private String Laboratorio;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaboratorio() {
		return Laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		Laboratorio = laboratorio;
	}
	
	

}
