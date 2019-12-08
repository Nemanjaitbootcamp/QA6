package ucionica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import novi_pokusaj_domaceg.Polaznik;

public class Laptop {
	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri. Moze da se ispise u obliku (koristiti
	 * metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */
	
	private ArrayList<Polaznik>polaznici;
	private String marka;
	
	// KONSTRUKTOR - lista polaznika i marku se zadaju prilikom kreiranja
	public Laptop (String marka) {   
		polaznici = new ArrayList<Polaznik>();
		this.marka = marka;
	}
	
	// GET metoda - marka
	public String getMarka() {
		return this.marka;
	}
	
	// metoda za dodavanje novih polaznika
		public void dodajPolaznika(Polaznik pol) {
			polaznici.add(pol);
		}
		
	// ispis polaznika
	public String ispis() {
		String ispis = marka + " {";
		for(int i = 0; i < polaznici.size(); i++) {
			ispis += polaznici.get(i).ispis();
		}
		ispis += "} ";
		return ispis;
	}
}
