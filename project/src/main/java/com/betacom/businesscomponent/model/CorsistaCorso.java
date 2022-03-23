package com.betacom.businesscomponent.model;

public class CorsistaCorso {
	private  long codCorsista;
	private long codCorso;
	public long getCodCorsista() {
		return codCorsista;
	}
	public void setCodCorsista(long codCorsista) {
		this.codCorsista = codCorsista;
	}
	public long getCodCorso() {
		return codCorso;
	}
	public void setCodCorso(long codCorso) {
		this.codCorso = codCorso;
	}
	public CorsistaCorso() {
		super();
	}
	public CorsistaCorso(long codCorsista, long codCorso) {
		super();
		this.codCorsista = codCorsista;
		this.codCorso = codCorso;
	}
	

}
