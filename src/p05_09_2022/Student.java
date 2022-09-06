package p05_09_2022;

public abstract class Student {

//	1.Zadatak
//
//	Kreirati apstraktnu klasu Student koja ima:
//	ime i prezime studenta
//	broj indeksa
//	godinu studija
//	gettere, settere i konstruktore
//	apstraktnu metodu koja vraca cenu skolarine.
//	apstraktnu metodu koja vraca da li je student na buzetu ili ne.
//	metodu koja stampa podatke u formatu:
//	ime i prezime, broj indeksa, godina studija
//	Finansiranje: budzet/samofinansirajuci
//	Cena skolarine: cena
//
//		Kreirati klasu StudentOsnovnih koja nasledjuje klasu Student i koja ima:
//	koja za cenu skolarine vraca 90000
//	za metodu da li je na budzetu vraca true ako je student ispod 5 godine studija
//
//	Kreirati klasu StudentMaster koja nasledjuje klasu Student i koja ima:
//	koja za cenu skolarine vraca 100000
//	za metodu da li je na budzetu vraca true ako je student ispod 2 godine studija
//		U glavnoj klasi kreirati studente i testirati funkciolanosti

	protected String imeiPrezime;
	protected int brojIndeksa;
	protected int godineStudija;

	public Student(String imeiPrezime, int brojIndeksa, int godineStudija) {
		super();
		this.imeiPrezime = imeiPrezime;
		this.brojIndeksa = brojIndeksa;
		this.godineStudija = godineStudija;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getGodineStudija() {
		return godineStudija;
	}

	public void setGodineStudija(int godineStudija) {
		this.godineStudija = godineStudija;
	}

	public abstract int cenaSkolarine();

	public abstract boolean budzet();

	public void print() {
		System.out.println(this.imeiPrezime + " , " + this.brojIndeksa + " , " + this.godineStudija);
		System.out.println("Finansiranje: " + this.budzet());
		System.out.println("Cena skolarine: " + this.cenaSkolarine());
	}
}
