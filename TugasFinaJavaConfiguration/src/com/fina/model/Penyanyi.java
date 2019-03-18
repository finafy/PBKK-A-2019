package com.fina.model;

import org.springframework.beans.factory.annotation.Value;

public class Penyanyi {

	

	private Lagu lagunya;
	
	@Value("${test.namaPenyanyi}")
	private String namaPenyanyi;
	
	@Value("${test.asal}")
	private String asal;
	
	@Value("${test.agensi}")
	private String agensi;

	public Penyanyi () {}
	
	public Penyanyi(Lagu lagunya) {
		super();
		this.lagunya = lagunya;
	}
	public Lagu getLagunya() {
		return lagunya;
	}
	public void setLagunya(Lagu lagunya) {
		this.lagunya = lagunya;
	}
	
	@Override
	public String toString() {
		return "Penyanyi=" + namaPenyanyi + ", Asal=" + asal + ", Agensi=" + agensi + "";
	}
		
}
