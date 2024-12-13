/*
 * 2)  Filtraggio dei dati
Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea un ArrayList di prodotti con almeno 5 elementi.
Implementa un metodo che filtra e restituisce solo i prodotti appartenenti a una determinata categoria (ad esempio, "Elettronica").
Stampa i prodotti filtrati.
Obiettivo: Applicare i metodi sugli ArrayList per filtrare i dati in base a criteri specifici.
 */
package main;
import java.util.Scanner;
import java.util.ArrayList;

public class FiltroDati {
	static Scanner scanner = new Scanner(System.in);
	

	

	public static void main(String[] args) { // richiamo i metodi
		ArrayList<Prodotto> prodotti = new ArrayList<>();
		//Prodotto prodFiltro = new Prodotto(nome, categoria, int);
		Negozio.aggiunta(prodotti, scanner);
		Negozio.filtro(prodotti, scanner);

	}

}
