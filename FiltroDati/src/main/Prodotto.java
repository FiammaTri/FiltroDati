/*
 * 2)  Filtraggio dei dati
Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea un ArrayList di prodotti con almeno 5 elementi.
Implementa un metodo che filtra e restituisce solo i prodotti appartenenti a una determinata categoria (ad esempio, "Elettronica").
Stampa i prodotti filtrati.
Obiettivo: Applicare i metodi sugli ArrayList per filtrare i dati in base a criteri specifici.
 */

package main;

public class Prodotto {
	String nome;
	String categoria;
	int prezzo;
	
	public Prodotto(String nome, String categoria, int prezzo) {	//Creo costruttore
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}
}