package Testovi;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite cenu: ");
		double n = 1500;
		double m = 7000;
		double p;
		p = sc.nextDouble();
		if (p > 0) {
			if (p <= m && p >= n) {
				p = p - (p * 0.1);
				System.out.println("Vasa cena sa popustom je: " + p);
			} else {
				if (p > m) {
					p = p - (p * 0.2);
					System.out.println("Vasa cena sa popustom je: " + p);
				}

				else {
					System.out.println("Vasa cena je: " + p);

				}
			}

		} else {
			System.out.println("Greska, cena mora biti pozitivna");
		}
	}
}
