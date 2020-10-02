package com.juego.licencias.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta")
public class Respuesta {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String mensaje;
	private int codigo;
	
	public Respuesta() {
		// TODO Auto-generated constructor stub
	}

	public Respuesta(int id, String titulo, String mensaje, int codigo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.mensaje = mensaje;
		this.codigo = codigo;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
	
}
