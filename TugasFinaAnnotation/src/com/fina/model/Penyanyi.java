package com.fina.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("demi")
public class Penyanyi {
	
	@Autowired
	@Qualifier("StoneCold")
	private Lagu lagunya;
	private String namaPenyanyi;
	private String asal;
	private String agensi;

	public Penyanyi() {}
	
	public Penyanyi(Lagu lagunya) {
		super();
		this.lagunya = lagunya;
	}
	
	public Penyanyi(Lagu lagunya, String namaPenyanyi, String asal, String agensi) {
		super();
		this.lagunya = lagunya;
		this.namaPenyanyi = namaPenyanyi;
		this.asal = asal;
		this.agensi = agensi;
	}


	public Lagu getLagunya() {
		return lagunya;
	}


	public void setLagunya(Lagu lagunya) {
		this.lagunya = lagunya;
	}



	public String getNamaPenyanyi() {
		return namaPenyanyi;
	}


	public void setNamaPenyanyi(String namaPenyanyi) {
		this.namaPenyanyi = namaPenyanyi;
	}


	public String getAsal() {
		return asal;
	}


	public void setAsal(String asal) {
		this.asal = asal;
	}


	public String getAgensi() {
		return agensi;
	}


	public void setAgensi(String agensi) {
		this.agensi = agensi;
	}


	@Override
	public String toString() {
		return "Penyanyi=" + namaPenyanyi + ", Asal=" + asal + ", Agensi=" + agensi + "";
	}
	
	
	
}

