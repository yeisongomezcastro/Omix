package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "Ubicacion") 

public class UbicacionEntidad {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "detalle") 	
	private String detalle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

}
