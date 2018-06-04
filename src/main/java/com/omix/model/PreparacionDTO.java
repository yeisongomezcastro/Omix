package com.omix.model;

import java.util.Date;

public class PreparacionDTO {
	
	private int idPreparacion;
	private PacienteDTO pacienteDTO;
	private UbicacionDTO ubicacionDTO;
	private MedicamentoDTO medicamentoDTO;
	private double dosis;
	private ViaAdministracionDTO viaAdministracionDTO;
	private VehiculoDTO vehiculo;
	private double VolumenMedicamento;
	private double VolumenFinal;
	private double ConcentracionMezcla;
	private String TipoMedicamento; //Para la identificación del lote
	private Date FechaElaboracion;
	private Date FechaVencimiento;
	private String Usuario;
	
	public PreparacionDTO(int idPreparacion, PacienteDTO pacienteDTO, UbicacionDTO ubicacionDTO,
			MedicamentoDTO medicamentoDTO, double dosis, ViaAdministracionDTO viaAdministracionDTO,
			VehiculoDTO vehiculo, double volumenMedicamento, double volumenFinal, double concentracionMezcla,
			String tipoMedicamento, Date fechaElaboracion, Date fechaVencimiento, String usuario) {
		super();
		this.idPreparacion = idPreparacion;
		this.pacienteDTO = pacienteDTO;
		this.ubicacionDTO = ubicacionDTO;
		this.medicamentoDTO = medicamentoDTO;
		this.dosis = dosis;
		this.viaAdministracionDTO = viaAdministracionDTO;
		this.vehiculo = vehiculo;
		VolumenMedicamento = volumenMedicamento;
		VolumenFinal = volumenFinal;
		ConcentracionMezcla = concentracionMezcla;
		TipoMedicamento = tipoMedicamento;
		FechaElaboracion = fechaElaboracion;
		FechaVencimiento = fechaVencimiento;
		Usuario = usuario;
	}

	public int getIdPreparacion() {
		return idPreparacion;
	}

	public void setIdPreparacion(int idPreparacion) {
		this.idPreparacion = idPreparacion;
	}

	public PacienteDTO getPacienteDTO() {
		return pacienteDTO;
	}

	public void setPacienteDTO(PacienteDTO pacienteDTO) {
		this.pacienteDTO = pacienteDTO;
	}

	public UbicacionDTO getUbicacionDTO() {
		return ubicacionDTO;
	}

	public void setUbicacionDTO(UbicacionDTO ubicacionDTO) {
		this.ubicacionDTO = ubicacionDTO;
	}

	public MedicamentoDTO getMedicamentoDTO() {
		return medicamentoDTO;
	}

	public void setMedicamentoDTO(MedicamentoDTO medicamentoDTO) {
		this.medicamentoDTO = medicamentoDTO;
	}

	public double getDosis() {
		return dosis;
	}

	public void setDosis(double dosis) {
		this.dosis = dosis;
	}

	public ViaAdministracionDTO getViaAdministracionDTO() {
		return viaAdministracionDTO;
	}

	public void setViaAdministracionDTO(ViaAdministracionDTO viaAdministracionDTO) {
		this.viaAdministracionDTO = viaAdministracionDTO;
	}

	public VehiculoDTO getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoDTO vehiculo) {
		this.vehiculo = vehiculo;
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

	public String getTipoMedicamento() {
		return TipoMedicamento;
	}

	public void setTipoMedicamento(String tipoMedicamento) {
		TipoMedicamento = tipoMedicamento;
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

	public String getUsuario() {
		return Usuario;
	}

	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	

	
}
