package p16_08_2022;

import java.util.Scanner;

public class racun1 {

	public static void main(String[] args) {
//		Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
//////		U mainu kreirati minimum dva racuna sa pratecim podacima i ostampati podatke za svaki objekat.
//		Dopuniti zadatak tako da se vrsi transakcija sa prvog na drugi racun. Korisnik unosi svotu koja se skida sa prvog i prebacuje na drugi racun.
//
//		Primer izvrsenja:
//		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//		Primalac: Marko Markovic, 840-23932-334, stanje: 200
//		Unesite sumu za transakciju: 500
//		Stanje nakon stransakcije
//		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//		Primalac: Marko Markovic, 840-23932-334, stanje: 700
		
		Racun r = new Racun();
		
		r.broj = "12345";
		r.ime = "Monika";
		r.prezime = "Nikolic";
		r.stanjeNaRacunu = 1000;
		System.out.println("Ime je: " + r.ime);
		System.out.println("Prezime je: " + r.prezime);
		System.out.println("Stanje na racunu: " + r.stanjeNaRacunu);
		System.out.println("Broj je: " + r.broj);
		
		
		Racun n = new Racun();
		n.broj = "12678";
		n.ime = "Nikola";
		n.prezime = "Nikolic";
		n.stanjeNaRacunu = 400;
		System.out.println("Ime je: " + n.ime);
		System.out.println("Prezime je: " + n.prezime);
		System.out.println("Stanje na racunu: " + n.stanjeNaRacunu);
		System.out.println("Broj je: " + n.broj);
		
		System.out.println("Posaljilac: " + r.broj + r.ime + r.prezime + r.stanjeNaRacunu);
		
		System.out.println("Primalac: " + n.broj + n.ime + n.prezime + n.stanjeNaRacunu);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite sumu: ");
		int suma = s.nextInt();
		r.stanjeNaRacunu = r.stanjeNaRacunu - suma;
		n.stanjeNaRacunu =n.stanjeNaRacunu + suma;
		System.out.println("Posaljilac: " + r.broj + r.ime + r.prezime + r.stanjeNaRacunu);
		
		System.out.println("Primalac: " + n.broj + n.ime + n.prezime + n.stanjeNaRacunu);
		
		
		
	}

}
