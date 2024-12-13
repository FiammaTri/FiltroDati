/*
 * Crea una classe Prodotto con attributi nome, categoria e prezzo.
Crea una classe Negozio con un ArrayList di prodotti disponibili e metodi per:
- Filtrare i prodotti per categoria.
- Aggiungere nuovi prodotti al negozio.

 */
package main;

import java.util.Scanner;
import java.util.ArrayList;

public class Negozio {

	static ArrayList<Prodotto> prodotti;
	
	
	public Negozio(ArrayList<Prodotto> prodotti, String nome, String categoria, double prezzo) {
		this.prodotti = prodotti;
	}

	static void filtro(ArrayList<Prodotto> prodotti, Scanner scanner) { // filtro
		System.out.println("Scegli la categoria per vedere tutti i prodotti: ");
		String catScelta = scanner.nextLine();
		for (Prodotto x : prodotti) { // per ogni elemento della classe Prodotto scorro l'arraylist prodotti
			if (x.categoria.equalsIgnoreCase(catScelta)) { // se la categoria di un elemento corrisponde a "elettronica"
															// stampa
				System.out.println(x.nome);
			}
		}
	}

	public static void aggiunta(ArrayList<Prodotto> prodotti, Scanner scanner) { 
		Prodotto prod = new Prodotto (); //provato sia nome,categoria,prezzo sia a metterli sopra
		
		Prodotto prod1 = new Prodotto("telefono", "elettronica", 100); // creo il primo prodotto. Dal costruttore
																		// Prodotto creo l'oggetto prod1 con i valori
																		// nome, categoria, prezzo
		Prodotto prod2 = new Prodotto("computer", "elettronica", 500);
		Prodotto prod3 = new Prodotto("Guerra e Pace", "libri", 12);
		Prodotto prod4 = new Prodotto("Gift Card", "varie", 50);
		Prodotto prod5 = new Prodotto("cacciavite", "utensili", 100);
		prodotti.add(prod1); // aggiungo nell'arraylist prodotto l'oggetto prod1
		prodotti.add(prod2);
		prodotti.add(prod3);
		prodotti.add(prod4);
		prodotti.add(prod5);
		int scelta = 1;
		while (scelta == 1) {
				System.out.println("Nome del prodotto: ");
				String nome = scanner.nextLine();
				System.out.println("Categoria: ");
				String categoria = scanner.nextLine();
				System.out.println("Prezzo");
				double prezzo = scanner.nextInt();
				prodotti.add(prod);
				System.out.println("Vuoi inserire altri prodotti? 1) Sì  2) No");
				scelta = scanner.nextInt();
				scanner.nextLine();
			}
		}

	
}
