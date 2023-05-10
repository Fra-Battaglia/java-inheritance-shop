package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	private int IMEI;
	private int memoria;
	
	public Smartphone(String nome, String descrizione, float prezzo, float iva,
			int IMEI, int memoria) {
		super(nome, descrizione, prezzo, iva);
		
		setIMEI(IMEI);
		setMemoria(memoria);
	}
	
	public int getIMEI() {
		return IMEI;
	}
	
	public void setIMEI(int IMEI) {
		this.IMEI = IMEI;
	}
	
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(S) " + getProdottoString() + 
				"Codice IMEI: " + IMEI + "\n" + 
				"Memoria: " + memoria + " GB" + "\n";
	}
}
