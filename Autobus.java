package domaci_12022019;

public class Autobus {

//	Autobus poseduje naziv, vozaca, cenu karte i niz putnika koji se njime voze. 
//	Naziv, cena karte i broj mesta zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
//	Autobus ispisati u sledecem obliku:
//	Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )
	
	private String name;
	private Vozac driver;
	private double price;
	private Putnik[] travelers;
	private int occupied; 
	
	public Autobus(String name, double price, int brojMesta) {
		this.name = name;
		this.price = price;
		travelers = new Putnik[brojMesta];
		
		occupied = 0; 
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public Vozac getDriver() {
		return driver;
	}

	public Putnik[] getTravelers() {
		return travelers;
	}
	
	public boolean addPassenger(Putnik p) {
		if (occupied == travelers.length) {
			return false;
		}
		travelers[occupied] = p; 
		occupied++;
		return true;
	}
	public boolean removePassenger(Putnik p) {
		boolean b=false;
		if (occupied == 0) {
			return b=false;
		}
		for (int i= 0; i < travelers.length; i++) {
		if (travelers[i] ==p) {
			
		travelers[i] = null; 
		occupied--;
		return b= true;
		}
		}
		return b;
		
	}
	public boolean addDriver(Vozac driver) {
		if (this.driver == null) {
			this.driver = driver;
			return true;
		}
		return false;
		
	}
	public boolean removeDriver() {
		if (this.driver != null) {
			this.driver=null;
			return true;
		}
		return false;
		
	}
	
	public void payTicket(Putnik p) {
		if(this.driver!=null) {
			p.removeMoney(this.price);
			System.out.println(p.getFirstName()+" ima jos "+p.getMoney()+" dinara.");
		}
	}
	
	public void printAutobus() {
		System.out.print(this.name + "( " + driver.toString());
		for(int i = 0; i < travelers.length; i++) {
			System.out.print(travelers[i].getFirstName() + "[" + travelers[i].getMoney() +"]");
			if(i < travelers.length- 1) {
				System.out.print(",");
			}
		}
	}
	
}
