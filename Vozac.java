package domaci_12022019;

public class Vozac extends Covek {

	// Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

	private String title;

	public Vozac(String firstName, String lastName) {
		super(firstName, lastName);
		this.title = "zanimanje -> Sofer";
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Vozac [ime: " + super.getFirstName() + "prezime: " + super.getLastName() + " zvanje=" + title + "]";
	}

}
