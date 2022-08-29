package p26_08_2022;

public class Zadatak1 {
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

	public static void main(String[] args) {
		Student monika = new Student("Monika Nikolic", "439453", 45096, 5000);
		monika.uplatiSkolarinu(500);
		monika.stampaj();

		Student milos = new Student("Milos Nikolic", "23842395", 45131, 20000);
		milos.uplatiSkolarinu(2000);
		milos.stampaj();

		Profesor goran = new Profesor("Goran Petrovic", "57349345", "Menadzment", 120000);

		goran.povecajPlatu(2);
		goran.stampaj();

		Profesor srdjan = new Profesor("Srdjan Dobrojevic", "34975345", "Matematika", 110000);
		srdjan.povecajPlatu(3);
		srdjan.stampaj();

	}

}
