package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.Zadatak
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati 
//		sve igrace i trenere. Podatke za igrace i trenere unosi korisnik sa tastature.

		Scanner s = new Scanner(System.in);
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();

		Igrac k = new Igrac("Milos Nikolic", "2212994214", 1994, 14, "napadac", true);
		Igrac r = new Igrac("Marko Trifunovic", "1349972304", 2000, 13, "odbrana", false);
		k.print();
		r.print();

		Trener t = new Trener("Ljubisa Petrovic", "12432435", 1973, 25, "Kondicioni");
		Trener m = new Trener("Dejan Spasojevic", "732347234", 1975, 20, "Pomocni");
		t.print();
		m.print();

		System.out.println("Unesite broj igraca: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			Igrac x = new Igrac();

			System.out.println("Unesite ime i prezime: ");
			String imeiPrezime = s.next();
			imeiPrezime += s.nextLine();
			x.setImeiPrezime(imeiPrezime);
			System.out.println("Unesite jmbg: ");
			x.setJmbg(s.next());
			System.out.println("Unesite godinu rodjenja: ");
			x.setGodinaRodjenja(s.nextInt());
			System.out.println("Unesite broj igraca: ");
			x.setBrojIgraca(s.nextInt());
			System.out.println("Unesite poziciju igraca: ");
			x.setPozicija(s.next());
			System.out.println("Da li je kapiten ili ne?");
			x.setKapiten(s.nextBoolean());
			igraci.add(x);

		}

	}

}
