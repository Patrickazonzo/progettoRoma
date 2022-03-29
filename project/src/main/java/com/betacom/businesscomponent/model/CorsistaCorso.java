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
	}
	
	public CorsistaCorso(long codCorsista, long codCorso) {		
		this.codCorsista = codCorsista;
		this.codCorso = codCorso;
	}
	

}
