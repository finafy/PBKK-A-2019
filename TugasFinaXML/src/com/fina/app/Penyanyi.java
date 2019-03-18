package com.fina.app;


public class Penyanyi {
	private Lagu lagunya;
	private String namaPenyanyi;
	private String asal;
	private String agensi;

	public Penyanyi () {}
	
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
	public Penyanyi(Lagu lagunya) {
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
