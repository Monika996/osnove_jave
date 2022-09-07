package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak  
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

		Magacioner m = new Magacioner("Marko Miljkovic");
		Menadzer n = new Menadzer("Nikola Nikolic");

		Sektor magacin = new Sektor("Magacin", 30000);
		Sektor logistika = new Sektor("Logistika", 70000);
		Sektor nabavka = new Sektor("Nabavka", 40000);
		Sektor administracija = new Sektor("Administracija", 50000);

		m.zaposliUSektor(magacin);
		m.zaposliUSektor(nabavka);

		n.zaposliUSektor(logistika);
		n.zaposliUSektor(administracija);

		System.out.println("Plata magacionera je: " + m.plataRadnika());
		System.out.println("Plata menadzera je: " + n.plataRadnika());

	}

}
