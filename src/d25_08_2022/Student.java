package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
//
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)

	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	private int brojIndeksa;
	private String imeiPrezime;
	private String tipStudija;

	public Student(int brojIndeksa, String imeiPrezime, String tipStudija) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.imeiPrezime = imeiPrezime;
		this.tipStudija = tipStudija;

	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void setIspiti(ArrayList<Ispit> ispiti) {
		this.ispiti = ispiti;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getImeiPrezime() {
		return imeiPrezime;
	}

	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public void dodajIspit(Ispit i) {
		this.ispiti.add(i);
	}

	public double prosek() {
		int brojac = 0;
		double suma = 0;
		for (int i = 0; i < ispiti.size(); i++) {
			if (this.ispiti.get(i).polozioPao()) {
				suma = suma + this.ispiti.get(i).getOcena();
				brojac++;
			}
		}
		return suma / brojac;

	}

	public void print() {
		System.out.println(this.brojIndeksa + " - " + this.imeiPrezime + " - " + this.tipStudija);
		System.out.println("Predmeti: ");
		for (int i = 0; i < ispiti.size(); i++) {
			this.ispiti.get(i).print();

		}
		System.out.println("Prosecna ocena je: " + this.prosek());

	}
}
