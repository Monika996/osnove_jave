package p16_08_2022;

public class Auto {
//	3.  Zadatak
//	Kreirati klasu Auto koja ima:
//	ime i prezime vozaca
//	marku automobila
//	broj vrata
//	potrosnju na 100km (npr: 10)
//	trenutnu brzinu kojom se auto krece
//	metodu za stampu koja stampa podatke u formatu:
//	[Vozac]
//		[Marka] - [br vrata]-ro vrata
//		Sa potrosnjom od [potrosnja] l na 100km
//		[Trenutna brzina auta] km/h je trenutna brzina.
	public String punoIme;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
	public int dozvoljenaBrzina;
	
	
	public void stampaj() {
		System.out.println("Ime i prezime " + this.punoIme);
		System.out.println("Marka automobila je: " + this.marka);
		System.out.println("Broj vrata je: " + this.brojVrata);
		System.out.println("Potrosnja je: " + this.potrosnja);
		System.out.println("Brzina je: " + this.brzina);
	}
	
	public boolean prekoracenje(int dozvoljenaBrzina) {
		if (this.dozvoljenaBrzina < this.brzina) {
			return true;
		}
		else { return false;
	}
}
}
