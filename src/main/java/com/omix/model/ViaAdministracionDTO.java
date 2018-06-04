package com.omix.model;

public class ViaAdministracionDTO {
	
	private int idViaAdministracion;
	private String ViaAdministracion;
	
	public ViaAdministracionDTO(int idViaAdministracion, String viaAdministracion) {
		super();
		this.idViaAdministracion = idViaAdministracion;
		ViaAdministracion = viaAdministracion;
	}

	public int getIdViaAdministracion() {
		return idViaAdministracion;
	}

	public void setIdViaAdministracion(int idViaAdministracion) {
		this.idViaAdministracion = idViaAdministracion;
	}

	public String getViaAdministracion() {
		return ViaAdministracion;
	}

	public void setViaAdministracion(String viaAdministracion) {
		ViaAdministracion = viaAdministracion;
	}
	
}
