package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Student koja ima
//		broj indeksa
//		ime i prezime
//		tip studija (osnovne, master, doktorske)
//		niz ispita
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za indeks, ime i prezime, tip studija
//		getter za niz predmeta
//		metodu dodaj ispit u niz ispita
//		metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//		metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)
//
//
//		Napisati klasu Ispit koja ima
//		naziv predmeta
//		ocenu (u rasponu od 5 do 10)
//		Ime i prezime profesora koji predaje predmet
//		konstuktore koje mislite da ce vam trebati
//		gettere i settere za sve atribute
//		metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//		metodu koja stampa ispit u formatu:
//		(naziv predmeta) - (profesor) - (ocena)

		Student S = new Student(45096, "Monika Petrovic ", "Osnovne akademske studije");

		Ispit i1 = new Ispit("Matematika ", 5, "Milovanovic Goran");
		Ispit i2 = new Ispit("Regionalna Geografija ", 10, "Milos Simic");
		Ispit i3 = new Ispit("Statistika ", 8, "Velibor Dragicevic");
		Ispit i4 = new Ispit("Informatika ", 9, "Ognjen Radovic");
		Ispit i5 = new Ispit("Upravljanje poslovnim performansama ", 5, "Vesna Sekulic");

		S.dodajIspit(i1);
		S.dodajIspit(i2);
		S.dodajIspit(i3);
		S.dodajIspit(i4);
		S.dodajIspit(i5);

		S.print();

	}

}
