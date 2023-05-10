package org.lessons.java.shop;

public class Shop {
	public static void main(String[] args) {
		Prodotto prodotto1 = new Prodotto("Prodotto 1", "Descrizione prodotto 1", 100, 22);
		Prodotto prodotto2 = new Smartphone("Prodotto 2", "Descrizione prodotto 2", 100, 22, 1234, 256);
		Prodotto prodotto3 = new Televisore("Prodotto 3", "Descrizione prodotto 3", 100, 22, 50, true);
		Prodotto prodotto4 = new Cuffie("Prodotto 4", "Descrizione prodotto 4", 100, 22, "Nero", true);
		
		System.out.println(prodotto1);
		System.out.println(prodotto2);
		System.out.println(prodotto3);
		System.out.println(prodotto4);
	}
}
