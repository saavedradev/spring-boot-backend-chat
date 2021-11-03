package com.saavedradev.springboot.backend.chat.models.documents;

import java.io.Serializable;

public class Mensaje implements Serializable {

	private String texto;
	private Long fecha;

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Long getFecha() {
		return fecha;
	}

	public void setFecha(Long fecha) {
		this.fecha = fecha;
	}

	private static final long serialVersionUID = -2913567587212882184L;

}
