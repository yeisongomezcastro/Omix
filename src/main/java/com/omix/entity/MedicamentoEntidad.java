package com.omix.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity(name="Medicamento")

public class MedicamentoEntidad {
	
	@Id
	@Column (name = "id")
	private int id;
	
	@Column(name = "Medicamento") 	
	private String Medicamento;
	
	@Column(name = "Presentacion") 	
	private double Presentacion;
	
	@OneToMany (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idUnidadMedida")
	private UnidadMedidaEntidad unidadMedida;
	
	@Column(name = "ConcentracionMadre")
	private double ConcentracionMadre;
	
	@Column(name = "Estabilidad")
	private int Estabilidad; //cantidad en números
	
	@Column(name = "MedidaEstabilidad")
	private String MedidaEstabilidad; //horas, días, semanas
	
	@ManyToMany (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idVehiculo")
	private VehiculoEntidad vehiculo; 
	
	@OneToMany (cascade = {CascadeType.PERSIST})
	@JoinColumn (name = "idTipoMedicamento")
	private TipoMedicamentoEntidad TipoMedicamento;
	
	@Column(name = "ProtegerLuz") 	
	private String ProtegerLuz;
	
	@Column(name = "Refrigerar") 	
	private String Refrigerar;
	
	@Column(name = "Envase") 	
	private String Envase; //Tipo de envase compatible pvc, propietileno, jeringa

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicamento() {
		return Medicamento;
	}

	public void setMedicamento(String medicamento) {
		Medicamento = medicamento;
	}

	public double getPresentacion() {
		return Presentacion;
	}

	public void setPresentacion(double presentacion) {
		Presentacion = presentacion;
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
	
	public String getProtegerLuz() {
		return ProtegerLuz;
	}

	public void setProtegerLuz(String protegerLuz) {
		ProtegerLuz = protegerLuz;
	}

	public String getRefrigerar() {
		return Refrigerar;
	}

	public void setRefrigerar(String refrigerar) {
		Refrigerar = refrigerar;
	}

	public String getEnvase() {
		return Envase;
	}

	public void setEnvase(String envase) {
		Envase = envase;
	}

	
}



