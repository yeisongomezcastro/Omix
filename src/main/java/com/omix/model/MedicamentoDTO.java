package com.omix.model;

public class MedicamentoDTO {
	
	private int IdMedicamento;
	private String Medicamento;
	private double ConcentracionMedicamento;
	private static final String UnidadMedida ="UnidadMedida";
	private double ConcentracionMadre;
	private int Estabilidad;
	private String MedidaEstabilidad;
	private static final String Vehiculo ="Vehiculo";
	private static final String TipoMedicamento ="TipoMedicamento";
	private String Almacenamiento;
	private String CadenaDeFrio;
	public MedicamentoDTO(int idMedicamento, String medicamento, double concentracionMedicamento,
			double concentracionMadre, int estabilidad, String medidaEstabilidad, String almacenamiento,
			String cadenaDeFrio) {
		super();
		IdMedicamento = idMedicamento;
		Medicamento = medicamento;
		ConcentracionMedicamento = concentracionMedicamento;
		ConcentracionMadre = concentracionMadre;
		Estabilidad = estabilidad;
		MedidaEstabilidad = medidaEstabilidad;
		Almacenamiento = almacenamiento;
		CadenaDeFrio = cadenaDeFrio;
	}
	public int getIdMedicamento() {
		return IdMedicamento;
	}
	public void setIdMedicamento(int idMedicamento) {
		IdMedicamento = idMedicamento;
	}
	public String getMedicamento() {
		return Medicamento;
	}
	public void setMedicamento(String medicamento) {
		Medicamento = medicamento;
	}
	public double getConcentracionMedicamento() {
		return ConcentracionMedicamento;
	}
	public void setConcentracionMedicamento(double concentracionMedicamento) {
		ConcentracionMedicamento = concentracionMedicamento;
	}
	public double getConcentracionMadre() {
		return ConcentracionMadre;
	}
	public void setConcentracionMadre(double concentracionMadre) {
		ConcentracionMadre = concentracionMadre;
	}
	public int getEstabilidad() {
		return Estabilidad;
	}
	public void setEstabilidad(int estabilidad) {
		Estabilidad = estabilidad;
	}
	public String getMedidaEstabilidad() {
		return MedidaEstabilidad;
	}
	public void setMedidaEstabilidad(String medidaEstabilidad) {
		MedidaEstabilidad = medidaEstabilidad;
	}
	public String getAlmacenamiento() {
		return Almacenamiento;
	}
	public void setAlmacenamiento(String almacenamiento) {
		Almacenamiento = almacenamiento;
	}
	public String getCadenaDeFrio() {
		return CadenaDeFrio;
	}
	public void setCadenaDeFrio(String cadenaDeFrio) {
		CadenaDeFrio = cadenaDeFrio;
	}
	public static String getUnidadmedida() {
		return UnidadMedida;
	}
	public static String getVehiculo() {
		return Vehiculo;
	}
	public static String getTipomedicamento() {
		return TipoMedicamento;
	}
	
	
}
