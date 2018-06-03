package com.omix.model;

import java.util.Date;

public class PreparacionDTO {
	
	private int idPreparacion;
	private static final String Paciente = "Paciente";
	private static final String Ubicacion ="Ubicacion";
	private static final String Medicamento = "Medicamento";
	private double dosis;
	private static final String Vehiculo ="Vehiculo";
	private double VolumenMedicamento;
	private double VolumenFinal;
	private double ConcentracionMezcla;
	private static final String TipoMedicamento ="TipoMedicamento"; //Para la identificación del lote
	private Date FechaElaboracion;
	private Date FechaVencimiento;
	private static final String Usuario ="Usuario";
	private static final String ViaAdministracion ="ViaAdministracion";
	
	
	public PreparacionDTO(int idPreparacion, double dosis, double volumenMedicamento, double volumenFinal,
			double concentracionMezcla, Date fechaElaboracion, Date fechaVencimiento) {
		super();
		this.idPreparacion = idPreparacion;
		this.dosis = dosis;
		VolumenMedicamento = volumenMedicamento;
		VolumenFinal = volumenFinal;
		ConcentracionMezcla = concentracionMezcla;
		FechaElaboracion = fechaElaboracion;
		FechaVencimiento = fechaVencimiento;
	}
	
	
	public int getIdPreparacion() {
		return idPreparacion;
	}
	public void setIdPreparacion(int idPreparacion) {
		this.idPreparacion = idPreparacion;
	}
	public double getDosis() {
		return dosis;
	}
	public void setDosis(double dosis) {
		this.dosis = dosis;
	}
	public double getVolumenMedicamento() {
		return VolumenMedicamento;
	}
	public void setVolumenMedicamento(double volumenMedicamento) {
		VolumenMedicamento = volumenMedicamento;
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
	public static String getPaciente() {
		return Paciente;
	}
	public static String getUbicacion() {
		return Ubicacion;
	}
	public static String getMedicamento() {
		return Medicamento;
	}
	public static String getVehiculo() {
		return Vehiculo;
	}
	public static String getTipomedicamento() {
		return TipoMedicamento;
	}
	public static String getUsuario() {
		return Usuario;
	}
	public static String getViaadministracion() {
		return ViaAdministracion;
	}
	

	
}
