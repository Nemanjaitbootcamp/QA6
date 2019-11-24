package Predavanja;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite pozitivan broj: ");
		int broj;
		broj = sc.nextInt();
		if (broj > 0) {
			System.out.println("Unesite brojeve: ");
			int brojevi = sc.nextInt();
			int min = brojevi;
			for (int i = 1; i < broj; i++) {
				brojevi = sc.nextInt();
				if (brojevi < min) {
					min = brojevi;

				}

			}
			System.out.println("Najmanji broj je: " + min);
		} else {
			System.out.println("Broj nije pozitivan!");

		}
	}

}
