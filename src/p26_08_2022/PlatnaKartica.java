package p26_08_2022;

public class PlatnaKartica {
//	2.Zadatak 
//	  Napraviti klasu PlatnaKartica koja ima
//	  atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//	  atribut broj kartice  primer: 4012-1239-1221-3381
//	  atribut godina - godina do kada vazi kartica
//	  atribut mesec-  mesec do kada vazi kartica
//	  konstruktor sa parametrima
//	  gettere za sve atribute, bez settera
//	   metodu dodajSredstva koja povecava sumu za unetu vrednost
//	  metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
//	  metodu koja stampa podatke o kartici u formatu:
//		  4012-1239-1221-3381, 11/2019, $212
//
//		  Napraviti klasu VisaKartica koja nasledjuje klasu PlatnaKartica
//	ovlaceno lice, cuva se ime i prezime osobe koja ima ovlascenje da podize novac u ekspozituri.
//	getter i setter za ovlasceno lice
//	konstruktor sa parametrima
//	  implementira metodu izvrsiTransakciju,  tako da na prosledjenu sumu dodaje proviziju od 1.8% sume. Najmanja provizija moze biti $4.
//	  implementira metodu koja stampa podatke o kartici u formatu:
//		  Visa Card: 4012-1239-1221-3381, 11/2019, $212
//
//		  Napraviti klasu MasterKartica koja nasledjuje klasu PlatnaKartica
//	  konstruktor sa parametrima
//	  implementira metodu koja vrsi transakciju, tako da na prosledjenu sumu dodaje proviziju od 1.5 posto na sumu.
//	  metoda naplatiOdrzavanje, koja sa racuna skida $2.
//	  implementira metodu koja stampa podatke o kartici u formatu:
//		  Master Card: 12/2019, 4012-1239-1221-3381, $232
//		  u main funkciji, napraviti visa i master kartice i testirati funkcije

	protected double suma;
	protected String brojKartice;
	protected int godinaVazenja;
	protected int mesecVazenja;

	public PlatnaKartica(double suma, String brojKartice, int godinaVazenja, int mesecVazenja) {
		super();
		this.suma = suma;
		this.brojKartice = brojKartice;
		this.godinaVazenja = godinaVazenja;
		this.mesecVazenja = mesecVazenja;

	}

	public double getSuma() {
		return suma;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public int getGodinaVazenja() {
		return godinaVazenja;
	}

	public int getMesecVazenja() {
		return mesecVazenja;
	}

	public void dodajSredstva(int iznos) {
		this.suma = this.suma + iznos;
	}

	public void izvrsiTransakciju(int vrednost) {
		this.suma = this.suma - vrednost;
	}

	public void stampaj() {
		System.out.println(
				this.brojKartice + " , " + this.mesecVazenja + "/" + this.godinaVazenja + " , " + "$" + this.suma);
	}

}
