package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="Paciente")
public class PacienteEntidad {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "Paciente") 	
	private String Paciente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaciente() {
		return Paciente;
	}

	public void setPaciente(String paciente) {
		Paciente = paciente;
	}
	
	
	
}
	
	
