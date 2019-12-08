package domaci_12022019;

public class Putnik extends Covek {

	// Putnik je covek koji poseduje novac.
	// Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom
	// kreiranja.
	// Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno
	// vratiti indikator uspesnosti.

	private double money; // add/oduzmi

	public Putnik(String firstName, String lastName, double money) {
		super(firstName, lastName);
		this.money = money;
	}

	public double getMoney() {
		return money;
	}

	public boolean addMoney(double amount) {
		if (amount <= 0) {
			System.out.println("Invalid input.");
			return false;
		}
		money += amount;
		return true;
	}

	public boolean removeMoney(double amount) {
		if (amount <= 0 || amount > money) {
			System.out.println("Invalid input.");
			return false;
		}
		money -= amount;
		return true;
	}
}
