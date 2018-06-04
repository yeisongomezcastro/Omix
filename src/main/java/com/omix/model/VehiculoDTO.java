package com.omix.model;

public class VehiculoDTO {

	
	private int idVehiculo;
	private String Diluente;
	private int VolumenFinalVehiculo;
	
	public VehiculoDTO(int idVehiculo, String diluente, int volumenFinalVehiculo) {
		super();
		this.idVehiculo = idVehiculo;
		Diluente = diluente;
		VolumenFinalVehiculo = volumenFinalVehiculo;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getDiluente() {
		return Diluente;
	}

	public void setDiluente(String diluente) {
		Diluente = diluente;
	}

	public int getVolumenFinalVehiculo() {
		return VolumenFinalVehiculo;
	}

	public void setVolumenFinalVehiculo(int volumenFinalVehiculo) {
		VolumenFinalVehiculo = volumenFinalVehiculo;
	}
	
}
