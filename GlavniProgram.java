package domaci_12022019;

public class GlavniProgram {

	public static void main(String[] args) {
//		Covek poseduje ime i prezime, i jedinstveni identifikacioni broj koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.
//
//		Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
//
//		Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
//
//		Autobus poseduje naziv, vozaca, cenu karte i niz putnika koji se njime voze. 
//		Naziv, cena karte i broj mesta zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
//		Autobus ispisati u sledecem obliku:
//		Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )

		Covek c1 = new Covek("Sasa", "Savic");
		Covek c2 = new Covek("Marija", "Maric");

		Vozac v1 = new Vozac("Milica", "Vuckovic");	
		Vozac v2 = new Vozac("Dusko", "Duskovic");

		Putnik p1 = new Putnik("Kata", "Katic", 5000000);
     	Putnik p2 = new Putnik("Sara", "Car", 9000000);
		Putnik p3 = new Putnik("Nesa", "Paunov", 100000000);
		Putnik p4 = new Putnik("Nikola", "Nikolic", 200000);
		
		System.out.println(c1.getIdCovek() + " " + c1.getFirstName() + " " + c1.getLastName());
		System.out.println(c2.getIdCovek() + " " + c2.getFirstName() + " " + c2.getLastName());
		System.out.println(v1.getIdCovek() + " " + v1.getFirstName() + " " + v1.getLastName() + " " + v1.getTitle());
		System.out.println(p1.getIdCovek() + " " + p1.getFirstName() + " " + p1.getLastName() + " Iznos: " + p1.getMoney());
		
		p1.addMoney(2000);
		System.out.println(p1.getIdCovek() + " " + p1.getFirstName() + " " + p1.getLastName() + " Iznos: " + p1.getMoney());
		p1.removeMoney(1000);
		System.out.println(p1.getIdCovek() + " " + p1.getFirstName() + " " + p1.getLastName() + " Iznos: " + p1.getMoney());

		Autobus a1 = new Autobus("Lasta", 500, 3);
		System.out.println(
		a1.addPassenger(p4) + ", " + a1.addPassenger(p3) + ", " + a1.addPassenger(p2) + ", " + a1.addPassenger(p1));

		System.out.println(a1.removePassenger(p4));

		System.out.println(a1.addDriver(v1) + ", " + a1.addDriver(v2));

		a1.payTicket(p1);
	}

}
