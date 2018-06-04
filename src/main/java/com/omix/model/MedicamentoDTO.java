package com.omix.model;

public class MedicamentoDTO {
	
	private int IdMedicamento;
	private String Medicamento;
	private double ConcentracionMedicamento;
	private UnidadMedidaDTO unidadMedidaDTO;
	private double ConcentracionMadre;
	private int Estabilidad;
	private String MedidaEstabilidad;
	private VehiculoDTO vehiculoDTO;
	private String TipoMedicamento;
	private String Almacenamiento;
	private String CadenaDeFrio;
	
	

	public MedicamentoDTO(int idMedicamento, String medicamento, double concentracionMedicamento,
			UnidadMedidaDTO unidadMedidaDTO, double concentracionMadre, int estabilidad, String medidaEstabilidad,
			VehiculoDTO vehiculoDTO, String tipoMedicamento, String almacenamiento, String cadenaDeFrio) {
		super();
		IdMedicamento = idMedicamento;
		Medicamento = medicamento;
		ConcentracionMedicamento = concentracionMedicamento;
		this.unidadMedidaDTO = unidadMedidaDTO;
		ConcentracionMadre = concentracionMadre;
		Estabilidad = estabilidad;
		MedidaEstabilidad = medidaEstabilidad;
		this.vehiculoDTO = vehiculoDTO;
		TipoMedicamento = tipoMedicamento;
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



	public UnidadMedidaDTO getUnidadMedidaDTO() {
		return unidadMedidaDTO;
	}



	public void setUnidadMedidaDTO(UnidadMedidaDTO unidadMedidaDTO) {
		this.unidadMedidaDTO = unidadMedidaDTO;
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



	public VehiculoDTO getVehiculoDTO() {
		return vehiculoDTO;
	}



	public void setVehiculoDTO(VehiculoDTO vehiculoDTO) {
		this.vehiculoDTO = vehiculoDTO;
	}



	public String getTipoMedicamento() {
		return TipoMedicamento;
	}



	public void setTipoMedicamento(String tipoMedicamento) {
		TipoMedicamento = tipoMedicamento;
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
	
	


}
