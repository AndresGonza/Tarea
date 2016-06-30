package com.ug.encuesta.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="votos")
public class Voto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="voto_id")
	
	private int votoid;
	@ManyToOne
	private Opcion opcion;
	
	public int getVotoid() {
		return votoid;
	}
	public void setVotoid(int votoid) {
		this.votoid = votoid;
	}
	public Opcion getOpcion() {
		return opcion;
	}
	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}


	
	

}
