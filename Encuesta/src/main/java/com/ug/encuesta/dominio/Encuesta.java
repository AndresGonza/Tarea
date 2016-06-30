package com.ug.encuesta.dominio;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity (name="encuentas")
public class Encuesta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="encuesta_id")
	
	private int encuestaid;
	private String pregunta;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="pregunta_id")
	
	private List<Opcion> opciones;

	public int getEncuestaid() {
		return encuestaid;
	}

	public void setEncuestaid(int encuestaid) {
		this.encuestaid = encuestaid;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public List<Opcion> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<Opcion> opciones) {
		this.opciones = opciones;
	}
	
	
	
	
}
