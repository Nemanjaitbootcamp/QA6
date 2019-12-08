package domaci_11292019;

import java.util.ArrayList;

public class Zadatak_1_11292019_mainclass {

	public static void main(String[] args) {
		
		Dete prvo = new Dete("Todor", "Todorovic", 7, 12);
		Dete drugo = new Dete("Marko", "Todorovic", 6, 9);
		Dete trece = new Dete("Luka", "Todorovic", 9, 23);
		
		prvo.dodajKlikere(4);

        System.out.println(prvo.getIme() + " ima " + prvo.getBrKlikera() + " klikera.");
        System.out.println(drugo.getIme() + " ima " + drugo.getBrGodina() + " godina.");
        
		trece.oduzmiKlikere(3);
		
        System.out.println(trece.getBrKlikera() + " klikera ima dete od " + trece.getBrGodina() + ".");        
        
        System.out.println(prvo.prosek());
        
        System.out.println(prvo.getBrKlikera() + " + " + drugo.getBrKlikera() + " + " + trece.getBrKlikera() + " => " + prvo.ukupnoKlikera());

	}

}
