package p26_08_2022;

public class Profesor extends Osoba{
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

	private String nazivPredmeta;
	private double iznosPlate;

	public Profesor(String imeiPrezime, String jmbg, String nazivPredmeta, double iznosPlate) {
		super(imeiPrezime, jmbg);
		this.nazivPredmeta = nazivPredmeta;
		this.iznosPlate = iznosPlate;
	}

	public double povecajPlatu(double procenat) {
		return this.iznosPlate + (this.iznosPlate * procenat) / 100;

	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Naziv predmeta: " + this.nazivPredmeta);
		System.out.println("Iznos plate: " + this.iznosPlate);

	}

}
