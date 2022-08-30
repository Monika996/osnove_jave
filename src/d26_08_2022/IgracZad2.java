package d26_08_2022;

import java.util.ArrayList;

public class IgracZad2 extends OsobaZad2 {
//	(Za vezbanje) 
//	2. Zadatak
//	Kreirati klasu Karton koja ima:
//	tip kartona (crveni, zuti)
//	konstuktore za koje mislite da ce vam trebati
//	gettere i settere za karton
//		
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
//
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	niz kartona
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu dodaj karton, gde se dodaje karton u niz
//	metodu koja vraca broj zutih kartona
//	metodu koja vraca broj crvenih kartona
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//	U glavnom programu kreirati igraca i dodati mu nekoliko kartona.
//
	private int brojIgraca;
	private String pozicija;
	private boolean kapiten;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();

	public IgracZad2(String punoIme, String jmbg, int godRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kapiten = kapiten;

	}

	public IgracZad2(String punoIme, String jmbg, int godRodjenja) {
		super(punoIme, jmbg, godRodjenja);
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void doddajKarton(Karton kartoni) {
		this.kartoni.add(kartoni);
	}

	public int brojZutih() {
		int brojac = 0;
		for (int i = 0; i < this.kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("Zuti")) {
				brojac++;
			}
		}
		return brojac;

	}

	public int brojCrvenih() {
		int brojac = 0;
		for (int i = 0; i < this.kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("Crveni")) {
				brojac++;
			}
		}
		return brojac;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj igraca je: " + this.brojIgraca);
		System.out.println("Pozicija igraca je: " + this.pozicija);
		if (this.kapiten) {
			System.out.println("Kapiten");
		}
		System.out.println("Broj zutih kartona je: " + this.brojZutih());
		System.out.println("Broj crvenih kartona je: " + this.brojCrvenih());

	}

}
