package com.omix.model;

public class PacienteDTO {
	
	private int idPaciente;
	private String Paciente;
	
	public PacienteDTO(int idPaciente, String paciente) {
		super();
		this.idPaciente = idPaciente;
		Paciente = paciente;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getPaciente() {
		return Paciente;
	}

	public void setPaciente(String paciente) {
		Paciente = paciente;
	}
	
	
	

}
