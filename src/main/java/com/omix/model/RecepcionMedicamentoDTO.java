package com.omix.model;

import java.util.Date;

public class RecepcionMedicamentoDTO {
	
	private int idRecepcion;
	private static final String Medicamento ="medicamento";
	private String Lote;
	private Date FechaVencimimientoMedicamento;
	private int cantidad;
	private static final String Laboratorio = "laboratorio";
	public RecepcionMedicamentoDTO(int idRecepcion, String lote, Date fechaVencimimientoMedicamento, int cantidad) {
		super();
		this.idRecepcion = idRecepcion;
		Lote = lote;
		FechaVencimimientoMedicamento = fechaVencimimientoMedicamento;
		this.cantidad = cantidad;
	}
	public int getIdRecepcion() {
		return idRecepcion;
	}
	public void setIdRecepcion(int idRecepcion) {
		this.idRecepcion = idRecepcion;
	}
	public String getLote() {
		return Lote;
	}
	public void setLote(String lote) {
		Lote = lote;
	}
	public Date getFechaVencimimientoMedicamento() {
		return FechaVencimimientoMedicamento;
	}
	public void setFechaVencimimientoMedicamento(Date fechaVencimimientoMedicamento) {
		FechaVencimimientoMedicamento = fechaVencimimientoMedicamento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public static String getMedicamento() {
		return Medicamento;
	}
	public static String getLaboratorio() {
		return Laboratorio;
	}
	

}
