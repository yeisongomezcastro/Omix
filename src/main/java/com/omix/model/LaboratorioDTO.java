package com.omix.model;

public class LaboratorioDTO {
	
	private int idLaboratorio;
	private String Laboratorio;
	
	public LaboratorioDTO(int idLaboratorio, String laboratorio) {
		super();
		this.idLaboratorio = idLaboratorio;
		Laboratorio = laboratorio;
	}

	public int getIdLaboratorio() {
		return idLaboratorio;
	}

	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}

	public String getLaboratorio() {
		return Laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		Laboratorio = laboratorio;
	}
	
	

}
