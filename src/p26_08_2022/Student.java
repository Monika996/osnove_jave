package p26_08_2022;

public class Student extends Osoba{
//	Zadatak
//	Kreirati klasu Osoba koja od atributa ima:
//ime i prezime
//jmbg
//konstuktor sa parametrima
//metodu stampaj koja stampa podatke u formatu
//		ime prezime, jmbg
//
//
//	Kreirati klasu Student koja nasledjuje klasu Osoba, 
//		koja od dodatnih atributa ima:
//broj indeksa
//dug za skolarinu 
//konstuktor sa parametrima
//metodu uplati skolarinu koja umanjuje dug za prosledjenu vrednost. Metoda prima iznos uplate kao parametar metode.
//Napisati metod stampajStudenta da stampa sve podatke o studentu
//
//
//Kreirati klasu Profesor koja nasledjuje klasu Osoba, 
//		koja od dodatnih atributa ima:
//naziv predmeta koji predaje
//iznos plate
//konstuktor sa parametrima
//metodu povecaj platu. Metoda kao parametar prima procenat povecanja.
//Napisati metodu stampajProfu da stampa sve podatke o profesoru
//
//
//		U glavnom programu kreirati 2 studenta i 2 profesora.
//
//(dopuna)
//Umesto metoda stampajStudent i stampajProfu, napisati override metoda za stampu

	private int brojIndeksa;
	private int dug;

	public Student(String imeiPrezime, String jmbg, int brojIndeksa, int dug) {
		super(imeiPrezime, jmbg);
		this.brojIndeksa = brojIndeksa;
		this.dug = dug;
	}

	public int uplatiSkolarinu(int iznos) {
		return this.dug - iznos;

	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj indeksa: " + this.brojIndeksa);
		System.out.println("Dug je: " + this.dug);

	}

}
