package com.ug.encuesta.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="opciones")
public class Opcion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="opcion_id")

	private  int opcionid;
	private String valor;
	
	
	public int getOpcionid() {
		return opcionid;
	}
	public void setOpcionid(int opcionid) {
		this.opcionid = opcionid;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	

	



	
	
}
