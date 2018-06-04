package com.omix.model;

public class UnidadMedidaDTO {

	private int idUnidadMedida;
	private String UnidadMedida;
	private String Abreviatura;
	
	public UnidadMedidaDTO(int idUnidadMedida, String unidadMedida, String abreviatura) {
		super();
		this.idUnidadMedida = idUnidadMedida;
		UnidadMedida = unidadMedida;
		Abreviatura = abreviatura;
	}

	public int getIdUnidadMedida() {
		return idUnidadMedida;
	}

	public void setIdUnidadMedida(int idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}

	public String getUnidadMedida() {
		return UnidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		UnidadMedida = unidadMedida;
	}

	public String getAbreviatura() {
		return Abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		Abreviatura = abreviatura;
	}
	
	


}
