package domaci_11292019;

public class Dete {
	/*
	 * Dete ima ime, prezime, broj godina i broj klikera. 
	 * Napraviti mogucnost da se kreira vise objekata klase Dete. 
	 * Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira. 
	 * Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina
	 * (ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje racunamo prosecne godine za to dvoje)
	 */
	
	// polja klase Dete su ime, prezime, broj godina i broj klikera
	private String ime;
	private String prezime;
	private int brGodina;
	private int brKlikera;
	private static int GlobalKlikeri=0;
	private static int GlobalDece=0;
	private static double GlobalGodina=0;

	
	// KONSTRUKTOR
	public Dete(String ime, String prezime, int brGodina, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGodina = brGodina;
		this.brKlikera = brKlikera;
		GlobalKlikeri += brKlikera;
		GlobalGodina += brGodina;
		GlobalDece++;
	}
	
	// GET metode
	public String getIme() {
		return ime;
	}
    public String getPrezime() {
		return prezime;
	}
	public int getBrGodina() {
		return brGodina;
	}
	public int getBrKlikera() {
		return brKlikera;
	}

	//  metoda dodajKlikere,  broj klikera se azurira 
	public void dodajKlikere(int klikeri) {
		if (klikeri > 0) {
			brKlikera += klikeri;
			GlobalKlikeri += klikeri;
		}
		else System.out.println("Pogresan unos, ne mozete dodati nula ili negativan broj klikera");
	}
	
	//  metoda oduzmiKlikere, broj klikera se azurira
	public void oduzmiKlikere(int klikeri) {
		if (klikeri > 0) {
			brKlikera -= klikeri;
			GlobalKlikeri -= klikeri;
		}
		else System.out.println("Pogresan unos.");
	}
	
	// metoda koja ispisuje ukupan broj klikera
	public String ukupnoKlikera() {
		String ispis = "Ukupan broj klikera sve dece iznosi " + GlobalKlikeri + ".";
		return ispis;
	}
	
	// metoda koja ispisuje prosek godina dece
	public String prosek () {
		String prosek = "Prosek godina je " + ( GlobalGodina / GlobalDece) + " godina.";
		return prosek;
	}
	
}
