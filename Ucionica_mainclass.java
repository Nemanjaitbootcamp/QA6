package ucionica;

import novi_pokusaj_domaceg.Laptop;
import novi_pokusaj_domaceg.Polaznik;

public class Ucionica_mainclass {

	public static void main(String[] args) {
		/*
		 * Napraviti paket ucionica. Unutar paketa ucionica, pisati klase.
		 * 
		 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
		 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
		 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
		 * u obliku: IME_PREZIME{ID}.
		 * 
		 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
		 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
		 * koriste laptop moze da se prosiri. Moze da se ispise u obliku (koristiti
		 * metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
		 */

		Polaznik pol1 = new Polaznik("Marko", "Markovic");
		
		
		Polaznik pol2 = new Polaznik("Jovana", "Jovanovic");
		System.out.println(pol2.ispis());
		
		Polaznik pol3 = new Polaznik("Todor", "Todorovic");
		System.out.println(pol3.ispis());
		System.out.println(pol1.ispis());
		
		Laptop lt1 = new Laptop("Dell");
		Laptop lt2 = new Laptop("Lenovo");
		
		lt1.dodajPolaznika(pol1);
		lt1.dodajPolaznika(pol2);
		lt2.dodajPolaznika(pol3);

		String polaznici = pol3.ispis();
		System.out.println(polaznici);
		
		String laptopovi = lt1.ispis();
		System.out.println(laptopovi);
		
		
		
	}

}
