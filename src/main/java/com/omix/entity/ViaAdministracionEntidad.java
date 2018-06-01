package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name ="ViaAdministracion")

public class ViaAdministracionEntidad {
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "ViaAdministracion") 	
	private String ViaAdministracion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getViaAdministracion() {
		return ViaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		ViaAdministracion = viaAdministracion;
	}
	
	

}
