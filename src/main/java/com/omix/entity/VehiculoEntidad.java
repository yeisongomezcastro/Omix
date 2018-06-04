package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Vehiculo")

public class VehiculoEntidad {
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "Diluente") 	
	private String Diluente;  
	
	@Column(name = "VolumenFinal") 	
	private int VolumenFinal;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDiluente() {
		return Diluente;
	}

	public void setDiluente(String diluente) {
		Diluente = diluente;
	}

	public int getVolumenFinal() {
		return VolumenFinal;
	}

	public void setVolumenFinal(int volumenFinal) {
		VolumenFinal = volumenFinal;
	}
	
	

	//El vehículo es el medio en que se diluye el medicamento (dextrosa, salino, agua para inyección y lactato de ringer)
	
	

}
