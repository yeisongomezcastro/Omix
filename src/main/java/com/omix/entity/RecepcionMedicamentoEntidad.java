package com.omix.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


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
	private Date FechaVencimientoMedicamento;
	
	@Column(name = "Cantidad") 	
	private int Cantidad;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idLaboratorio")
	private LaboratorioEntidad laboratorio;
	

	public Date getFechaVencimientoMedicamento() {
		return FechaVencimientoMedicamento;
	}

	public void setFechaVencimientoMedicamento(Date fechaVencimientoMedicamento) {
		FechaVencimientoMedicamento = fechaVencimientoMedicamento;
	}

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


	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
}
