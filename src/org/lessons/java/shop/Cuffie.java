package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	private String colore;
	private boolean wireless;
	
	public Cuffie(String nome, String descrizione, float prezzo, float iva,
			String colore, boolean wireless) {
		super(nome, descrizione, prezzo, iva);
		
		setColore(colore);
		setWireless(wireless);
	}
	
	public String getColore() {
		return colore;
	}
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public boolean getWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(C) " + getProdottoString() + 
				"Colore: " + colore + "\n" +
				"Wireless:  " + wireless + "\n";
	}
}
