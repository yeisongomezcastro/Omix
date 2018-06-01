package com.omix.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.jvnet.hk2.config.DataType;

@Entity (name="RecepcionMedicamento")

public class RecepcionMedicamentoEntidad {
	
	@Id
	@Column (name = "id")
	private int id; 
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idMedicamento")
	private MedicamentoEntidad Medicamento;
	
	@Column(name = "Lote") 	
	private String	Lote;
	
	@Column(name = "FechaVencimientoMedicamento") 	
	private DataType FechaVencimientoMedicamento;
	
	@Column(name = "Cantidad") 	
	private int Cantidad;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idLaboratorio")
	private LaboratorioEntidad laboratorio;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getLote() {
		return Lote;
	}

	public void setLote(String lote) {
		Lote = lote;
	}

	public DataType getFechaVencimientoMedicamento() {
		return FechaVencimientoMedicamento;
	}

	public void setFechaVencimientoMedicamento(DataType fechaVencimientoMedicamento) {
		FechaVencimientoMedicamento = fechaVencimientoMedicamento;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
}
