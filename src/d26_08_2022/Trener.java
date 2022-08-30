package d26_08_2022;

public class Trener extends Osoba {
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

	private int godineIskustva;
	private String tipTrenera;

	public Trener(String imeiPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
		super(imeiPrezime, jmbg, godinaRodjenja);
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}

	public int getGodineIskustva() {
		return godineIskustva;
	}

	public void setGodineIskustva(int godineIskustva) {
		this.godineIskustva = godineIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Godine iskustva: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
		System.out.println();
	}

}
