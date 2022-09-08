package p06_09_2022;

public class Lokal extends Objekat{
//	Zadatak 1.. Kreirati abstraktnu klasu Objekat ciji su zasticeni atributi: 
//		adresa (ulica i broj)
//		povrsina objekta
//		zona (1, 2 ili 3)
//		konstuktore, gettere i settere
//		metodu koja vraca koeficijent koji ce se koristiti za racunanje poreza u zavisnosti u kojoj zoni se nalazi objekat
//		zona 1, koeficijent je 1.4
//		zona 2, koeficijent je 1.1
//		zona 3, koeficijent je 1.05
//		abstraktnu metodu koja racuna i vraca porez objekta
//		abstraktnu metodu stampaj 
//
//			Kreirati klasu Kuca koja nasledjuje klasu Objekat koja ima broj clanova koji zive u tom objektu, 
//		konstuktore, gettere i setter
//		porez racuna po formuli: koeficijent * povrsina.
//		prepisati metodu stampaj tako da stampa sve podatke vezane za kucu
//
//			Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//		broj stanova
//		konstuktore, gettere i setter
//		porez racuna po formuli koeficijent * povrsina * broj stanova
//		prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu
//			
//			Kreirati klasu Lokal koja naslejduje klasu Objekat koja od metoda ima:
//		konstuktore
//		porez racuna po formuli koeficijent * povrsina * 1.3
//		prepisati metodu stampaj tako da stampa sve podatke vezane za lokal
//
//			Kreirati klasu PoreskaUprava koja za atribute ima:
//		ime grada u kom se nalazi
//		niz objekata
//		metodu dodaj objekat
//		(ze vezbanje)metodu koja vraca objekat sa najvecim porezom public Objekat najveciPorez
//		(za vezbanje) metodu koja vraca objekat sa najmanjim porezom
//		metodu koja racuna ukupan porez za ceo grad
//		metodu koja stampa sve objekte
//		U glavnom programu napraviti jednu poresku upravu i u nju dodati minimum 3 razlicita objekta i istestirati sve metode.

	public Lokal(String ulicaIBroj, int povrsina, int zona) {
		super(ulicaIBroj, povrsina, zona);
		
	}

	@Override
	public double porez() {
		return this.koeficijent() * this.povrsina * 1.3;
	}

	@Override
	public void print() {
		System.out.println("Adresa lokala je: " + this.ulicaIBroj);
		System.out.println("Povrsina lokala je: " + this.povrsina);
		System.out.println("Zona u kojoj se nalazi lokal je: " + this.zona);

	}

}
