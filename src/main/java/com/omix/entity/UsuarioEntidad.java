package com.omix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Usuario")

public class UsuarioEntidad {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "Nombre") 	
	private String Nombre;
	
	@Column(name = "Cargo") 	
	private String Cargo;
	
	@Column(name = "Contrasena") 	
	private String Contrasena;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}
	


}
