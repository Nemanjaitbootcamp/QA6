package Klase;

import java.util.Scanner;

public class domaci {

	public float prosek_godina(Dete[] lista)
	{
		float zbir_godina = 0;
		
		for (int i = 0; i < lista.length; i++) {
			zbir_godina = zbir_godina + lista[i].getBroj_godina();
		}
		return zbir_godina/lista.length;
	}
	public static Scanner sc;
	public static void main(String[] args) {
		Dete d1 = new Dete("nemanja","jankovic",27,100);
		Dete d2 = new Dete("nemanja","jankovic",34,100);
		Dete d3 = new Dete("nemanja","jankovic",30,100);
		domaci d = new domaci(); // podrazumevani konstruktor
		System.out.println("Unesite koliko dece zelite:");
		
		String ime,prezime;
		int broj_godina,broj_klikera;
		sc = new Scanner(System.in);
		int broj_dece = sc.nextInt();
		Dete[] sva_janetova_deca = new Dete[broj_dece]; // definisemo listu od 3 deteta
		for(int i = 0;i<broj_dece;i++)
		{
			// i= 0 [popunjavamo prvo dete
			System.out.println("Unesite podatke o " + (i+1) + ". detetu.\n");
			System.out.println("Ime:");
			
			ime = sc.nextLine();
			System.out.println("prezime:");
			prezime = sc.nextLine();
			System.out.println("Broj godina:");
			broj_godina = sc.nextInt();
			System.out.println("Broj klikera:");
	          broj_klikera = sc.nextInt();

	          // popuni se celo prvp
			// 
			sva_janetova_deca[i] = new Dete(ime,prezime,broj_godina,broj_klikera);
			
		}
		
		
		
		
		
		float a = d.prosek_godina(sva_janetova_deca);
		System.out.println(a);
		
		d1.dodajKlikere(100);
		d1.ispisiKlikere();
		d1.oduzmiKlikere(150);
		d1.ispisiKlikere();

	}

}
