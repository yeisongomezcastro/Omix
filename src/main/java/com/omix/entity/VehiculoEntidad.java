package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Vehiculo")

public class VehiculoEntidad {
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "vehiculo") 	
	private String vehiculo;  
	
	@Column(name = "VolumenFinal") 	
	private String VolumenFinal;
	
	@Column(name = "Concentracion") 	
	private double Concentracion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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


	//El vehículo es el medio en que se diluye el medicamento (dextrosa, salino, agua para inyección y lactato de ringer)
	
	

}
