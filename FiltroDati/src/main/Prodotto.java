/*
 * 2)  Filtraggio dei dati
Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea un ArrayList di prodotti con almeno 5 elementi.
Implementa un metodo che filtra e restituisce solo i prodotti appartenenti a una determinata categoria (ad esempio, "Elettronica").
Stampa i prodotti filtrati.
Obiettivo: Applicare i metodi sugli ArrayList per filtrare i dati in base a criteri specifici.
 */

package main;

import java.util.ArrayList;

public class Prodotto {
	String nome;
	String categoria;
	int prezzo;
	static ArrayList<Prodotto> prodotto = new ArrayList<>();

	public Prodotto(String nome, String categoria, int prezzo) {	//Creo costruttore
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}

	static void aggiunta(ArrayList<Prodotto> prodotti) {		//creo metodo di aggiunta
		Prodotto prod1=new Prodotto("telefono", "elettronica", 100);	//creo il primo prodotto. Dal costruttore Prodotto creo l'oggetto prod1 con i valori nome, categoria, prezzo
		Prodotto prod2=new Prodotto("computer", "elettronica", 500);
		Prodotto prod3=new Prodotto("Guerra e Pace", "libri", 12);
		Prodotto prod4=new Prodotto("Gift Card", "varie", 50);
		Prodotto prod5=new Prodotto("cacciavite", "utensili", 100);
		prodotti.add(prod1);		//aggiungo nell'arraylist prodotto l'oggetto prod1
		prodotti.add(prod2);
		prodotti.add(prod3);
		prodotti.add(prod4);
		prodotti.add(prod5);
	}
	
	static void filtro (ArrayList<Prodotto> prodotti) {		//filtro
		for  (Prodotto x : prodotti) {						// per ogni elemento della classe Prodotto scorro l'arraylist prodotti
			if (x.categoria.equals("elettronica")) {		//se la categoria di un elemento corrisponde a "elettronica" stampa
					System.out.println(x.nome);
		}
	}
}
}