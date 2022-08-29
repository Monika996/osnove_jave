package p26_08_2022;

public class Osoba {
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
//koja od dodatnih atributa ima:
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

	protected String imeiPrezime;
	protected String jmbg;

	public Osoba(String imeiPrezime, String jmbg) {
		super();
		this.imeiPrezime = imeiPrezime;
		this.jmbg = jmbg;
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

	public void stampaj() {
		System.out.println(this.imeiPrezime + " " + this.jmbg);
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

}
