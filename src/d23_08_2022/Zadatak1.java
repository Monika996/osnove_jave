package d23_08_2022;

import java.util.ArrayList;


public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//		U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite

		ZeleniKarton zk1 = new ZeleniKarton("Monika Nikolic ", 45096, "Planiranje i politika preduzeca",
				"Suzana Stefanovic", 7);
		ZeleniKarton zk2 = new ZeleniKarton("Marija Tevdenic ", 45106, "Medjunarodna ekonomija", "Milos Todorovic", 10);
		ZeleniKarton zk3 = new ZeleniKarton("Natalija Stankovic ", 44120, "Informatika", "Slobodan Cvetanovic", 5);
		ZeleniKarton zk4 = new ZeleniKarton("Aleksandar Veselic ", 42315, "Istorija srednjovekovne Srbije",
				"Miodrag Momcilovic", 6);
		ZeleniKarton zk5 = new ZeleniKarton("Katarina Stojiljkovic ", 45023, "Bankarski menadzment", "Marija Stamenic",
				5);
		ZeleniKarton zk6 = new ZeleniKarton("Slobodan Andjelkovic ", 44092, "Francuski jezik", "Slavica Bozilovic", 9);
		ZeleniKarton zk7 = new ZeleniKarton("Jovana Milosavljevic ", 45671, "Statistika", "Velibor Ilic", 5);
		ZeleniKarton zk8 = new ZeleniKarton("Milos Nikolic ", 44321, "Medjunarodni menadzment", "Goran Milovanovic",
				10);
		ZeleniKarton zk9 = new ZeleniKarton("Stasa Sekulic ", 43251, "Elektronsko poslovanje", "Ognjen Radovic", 8);
		ZeleniKarton zk10 = new ZeleniKarton("Lazar Pavlovic ", 46001, "Regionalna geografija", "Marko Radenkovic", 5);

		zk1.stampaj();
		zk2.stampaj();
		zk3.stampaj();
		zk4.stampaj();
		zk5.stampaj();
		zk6.stampaj();
		zk7.stampaj();
		zk8.stampaj();
		zk9.stampaj();
		zk10.stampaj();

//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite.

		ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<ZeleniKarton>();

		zeleniKarton.add(zk1);
		zeleniKarton.add(zk2);
		zeleniKarton.add(zk3);
		zeleniKarton.add(zk4);
		zeleniKarton.add(zk5);
		zeleniKarton.add(zk6);
		zeleniKarton.add(zk7);
		zeleniKarton.add(zk8);
		zeleniKarton.add(zk9);
		zeleniKarton.add(zk10);

		int suma = 0;
		for (int i = 0; i < zeleniKarton.size(); i++) {
			suma = suma + zeleniKarton.get(i).getOcena();
		}
		double prosecnaOcena = suma / zeleniKarton.size();
		System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);

	}

}
