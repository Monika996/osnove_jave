package d26_08_2022;

public class Osoba {
//	1.Zadatak
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
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//	godine iskustva
//	tip trenera (kondicioni, za igru, pomocni, personalni)
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//	U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

	private String imeiPrezime;
	private String jmbg;
	private int godinaRodjenja;

	public Osoba() {
		super();
	}

	public Osoba(String imeiPrezime, String jmbg, int godinaRodjenja) {
		super();
		this.imeiPrezime = imeiPrezime;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void print() {
		System.out.println(this.imeiPrezime + " , " + this.jmbg + " , " + this.godinaRodjenja);
	}

}
