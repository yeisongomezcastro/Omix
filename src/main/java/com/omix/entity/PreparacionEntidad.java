package com.omix.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="Preparacion")

public class PreparacionEntidad {
	
	@Id
	@Column(nullable = false)
	private int id;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idPaciente")
	private PacienteEntidad paciente;
	
	@OneToMany (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idUbicacion")
	private UbicacionEntidad ubicacion;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idMedicamento")
	private MedicamentoEntidad medicamento;
	
	@Column(nullable = false)
	private double Dosis;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idVehiculo")
	private VehiculoEntidad vehiculo;
	
	@Column(nullable = false)
	private double VolumenMedicamento;
	
	@Column(nullable = false)
	private double VolumenFinal;
	
	@Column(nullable = false)
	private double ConcentracionMezcla;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idViaAdministracion")
	private ViaAdministracionEntidad viaAdministracion;
	
	@Column(nullable = false)
	private String Lote; //Lote de identificación de la producción
	
	@Column(nullable = false)
	private Date FechaElaboracion;
	
	@Column(nullable = false)
	private Date FechaVencimiento;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idUsuario")
	private UsuarioEntidad usuario;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public double getDosis() {
		return Dosis;
	}

	public void setDosis(double dosis) {
		Dosis = dosis;
	}

	public double getVolumenMedicamento() {
		return VolumenMedicamento;
	}

	public void setVolumenMedicamento(double volumenMedicamento) {
		VolumenMedicamento = volumenMedicamento;
	}

	public double getConcentracionMezcla() {
		return ConcentracionMezcla;
	}

	public void setConcentracionMezcla(double concentracionMezcla) {
		ConcentracionMezcla = concentracionMezcla;
	}

	public String getLote() {
		return Lote;
	}

	public void setLote(String lote) {
		Lote = lote;
	}

	public Date getFechaElaboracion() {
		return FechaElaboracion;
	}

	public void setFechaElaboracion(Date fechaElaboracion) {
		FechaElaboracion = fechaElaboracion;
	}

	public Date getFechaVencimiento() {
		return FechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}
	
	
}

