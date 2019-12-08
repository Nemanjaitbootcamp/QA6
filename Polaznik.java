package ucionica;

public class Polaznik {
	
	/*
	 * Polaznik ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
	 * Polaznik poseduje i identifikacioni broj koji se moze dohvatiti. Ime i
	 * prezime polaznika se moze dohvatiti ali ne i postaviti. Polaznik se ispisuje
	 * u obliku: IME_PREZIME{ID}.
	 */
	
	private String ime;
	private String prezime;
	private static int idGlobalPolaznik=0;
	private int idPolaznik = idGlobalPolaznik;
	
	
	// KONSTRUKTOR - ime i prezime se zadaje prilikom kreiranja polaznika
	public Polaznik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		idPolaznik++;
		idGlobalPolaznik++;
	}
	
	// GET metode
	public String getIme() {
		return this.ime;
	}
	public String getPrezime() {
		return this.prezime;
	}
	public int getIdPolaznika(String ime, String prezime) {
		return idPolaznik;
	}
	
	// metoda za ISPIS polaznika
	public String ispis() {
		String ispis = ime + " " + prezime + "{" + idPolaznik + "}";
		return ispis;
	}
}