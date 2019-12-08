package domaci_12022019;

public class Covek {

	// Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
	
	private String firstName;
	private String lastName;
	private int idCovek;
	private static int idGlobal=0;
	
	// konstruktor
	public Covek(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		++idCovek;
		++idGlobal;
		// idCovek = ++idGlobal;
	}
	
	// Svi podaci mogu da se dohvate, ali ne i postave.
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public static int getIdGlobal() {
		return idGlobal;
	}
	public int getIdCovek() {
		return idCovek;
	}

	@Override
	public String toString() {
		return "Covek [ime=" + firstName + ", prezime=" + lastName + ", id=" + idCovek + "]";
	}
}
