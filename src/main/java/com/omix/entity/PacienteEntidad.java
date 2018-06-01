package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="Paciente")
public class PacienteEntidad {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "Nombre") 	
	private String Nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
}
	
	
