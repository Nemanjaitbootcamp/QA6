package Klase;

public class Dete {

	private String ime;
	private String prezime;
	private int broj_godina;
	private int broj_klikera;
	
	public Dete (String ime,String prezime,int broj_godina,int broj_klikera)
	{
		this.ime = ime;
		this.prezime = prezime;
		this.broj_godina = broj_godina;
		this.broj_klikera = broj_klikera;
	}
	
	public String getIme()
	{
		return this.ime;
	}
	public String getPrezime()
	{
		return this.prezime;
	}
	public int getBroj_godina()
	{
		return this.broj_godina;
	}
	public int getBroj_klikera()
	{
		return this.broj_klikera;
	}
	
	public void setIme(String ime)
	{
		this.ime = ime;
		
	}
	public void setPrezime(String prezime)
	{
		this.prezime = prezime;
		
	}
	public void setBroj_klikera(int broj_klikera)
	{
		this.broj_klikera = broj_klikera;
		
	}
	public void setBroj_godina(int broj_godina)
	{
		this.broj_godina = broj_godina;
		
	}
	
	public void dodajKlikere(int broj_klikera_za_dodati)
	{
		this.broj_klikera = this.broj_klikera + broj_klikera_za_dodati;
		
	}
	public void oduzmiKlikere(int broj_klikera_za_oduzeti)
	{
		if(this.broj_klikera > broj_klikera_za_oduzeti)
		{
			this.broj_klikera = this.broj_klikera - broj_klikera_za_oduzeti;
		}
		
	}
	public void ispisiKlikere()
	{
		System.out.println(this.ime+" ima " + this.broj_klikera + " klikera");
}
}
