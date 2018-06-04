package com.omix.model;

public class VehiculoDTO {
<<<<<<< HEAD
	
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
	
	
=======

	private String vehiculo;
	private String VolumenFinal;
	private double Concentracion;

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getVolumenFinal() {
		return VolumenFinal;
	}

	public void setVolumenFinal(String volumenFinal) {
		VolumenFinal = volumenFinal;
	}

	public double getConcentracion() {
		return Concentracion;
	}

	public void setConcentracion(double concentracion) {
		Concentracion = concentracion;
	}
>>>>>>> 48d73c890fd2ae64a5e7c7ce5f30a0f8438fba8f

}
