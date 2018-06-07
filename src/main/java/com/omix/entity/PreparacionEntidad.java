package com.omix.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Preparacion")

public class PreparacionEntidad implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(nullable = false)
	private int id;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "idPaciente")
	private PacienteEntidad paciente;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "idUbicacion")
	private UbicacionEntidad ubicacion;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "idMedicamento")
	private MedicamentoEntidad medicamento;

	@Column(nullable = false)
	private double Dosis;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "idVehiculo")
	private VehiculoEntidad vehiculo;

	@Column(nullable = false)
	private double VolumenMedicamento;

	@Column(nullable = false)
	private double VolumenVehiculo;

	@Column(nullable = false)
	private double VolumenFinal;

	@Column(nullable = false)
	private double ConcentracionMezcla;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "idViaAdministracion")
	private ViaAdministracionEntidad viaAdministracion;

	@Column(nullable = false)
	private String Lote; // Lote de identificación de la producción

	@Column(nullable = false)
	private Date FechaElaboracion;

	@Column(nullable = false)
	private Date FechaVencimiento;

	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "idUsuario")
	private UsuarioEntidad usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PacienteEntidad getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteEntidad paciente) {
		this.paciente = paciente;
	}

	public UbicacionEntidad getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionEntidad ubicacion) {
		this.ubicacion = ubicacion;
	}

	public MedicamentoEntidad getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(MedicamentoEntidad medicamento) {
		this.medicamento = medicamento;
	}

	public double getDosis() {
		return Dosis;
	}

	public void setDosis(double dosis) {
		Dosis = dosis;
	}

	public VehiculoEntidad getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoEntidad vehiculo) {
		this.vehiculo = vehiculo;
	}

	public double getVolumenMedicamento() {
		return VolumenMedicamento;
	}

	public void setVolumenMedicamento(double volumenMedicamento) {
		VolumenMedicamento = volumenMedicamento;
	}

	public double getVolumenVehiculo() {
		return VolumenVehiculo;
	}

	public void setVolumenVehiculo(double volumenVehiculo) {
		VolumenVehiculo = volumenVehiculo;
	}

	public double getVolumenFinal() {
		return VolumenFinal;
	}

	public void setVolumenFinal(double volumenFinal) {
		VolumenFinal = volumenFinal;
	}

	public double getConcentracionMezcla() {
		return ConcentracionMezcla;
	}

	public void setConcentracionMezcla(double concentracionMezcla) {
		ConcentracionMezcla = concentracionMezcla;
	}

	public ViaAdministracionEntidad getViaAdministracion() {
		return viaAdministracion;
	}

	public void setViaAdministracion(ViaAdministracionEntidad viaAdministracion) {
		this.viaAdministracion = viaAdministracion;
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

	public UsuarioEntidad getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntidad usuario) {
		this.usuario = usuario;
	}

}
