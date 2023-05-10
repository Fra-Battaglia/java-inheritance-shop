package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float iva;
	
	public Prodotto(String nome, String descrizione, float prezzo, float iva) {
		Random random = new Random();
		
		codice = random.nextInt(999999);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	
	protected String getProdottoString() {
		return getCodice() + "\n" + 
				"Nome: " + getNome() + "\n" + 
				"Descrizione: " + getDescrizione() + "\n" + 
				"Prezzo: " + getPrezzo() + "\n" +
				"Iva: " + getIva() + "\n";
	}
	
	@Override
	public String toString() {
		return "(P) " + getProdottoString();
	}
}
