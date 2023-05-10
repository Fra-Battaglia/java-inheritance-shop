package org.lessons.java.shop;

public class Televisore extends Prodotto {
	private int dimensioni;
	private boolean smartTV;
	
	public Televisore(String nome, String descrizione, float prezzo, float iva,
			int dimensioni, boolean smartTV) {
		super(nome, descrizione, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmartTV(smartTV);
	}
	
	public int getDimensioni() {
		return dimensioni;
	}
	
	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public boolean getSmartTV() {
		return smartTV;
	}
	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(T) " + getProdottoString() + 
				"Dimensioni: " + dimensioni + " Pollici" + "\n" + 
				"Smart TV:  " + smartTV + "\n";
	}
}
