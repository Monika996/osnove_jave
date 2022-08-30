package d26_08_2022;

public class OsobaZad2 {
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

	protected String punoIme;
	protected String jmbg;
	protected int godRodjenja;

	public OsobaZad2(String punoIme, String jmbg, int godRodjenja) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public OsobaZad2() {
		super();
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}

	public void stampaj() {
		System.out.println(this.punoIme + " , " + this.jmbg + " , " + this.godRodjenja);
	}

}
