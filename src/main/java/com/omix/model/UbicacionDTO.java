package com.omix.model;

public class UbicacionDTO {
	private int idUbicacion;
	private String Detalle;
	
	public UbicacionDTO(int idUbicacion, String detalle) {
		super();
		this.idUbicacion = idUbicacion;
		Detalle = detalle;
	}

	public int getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getDetalle() {
		return Detalle;
	}

	public void setDetalle(String detalle) {
		Detalle = detalle;
	}
}
