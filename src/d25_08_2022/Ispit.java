package d25_08_2022;

public class Ispit {
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

	private String nazivPredmeta;
	private int ocena;
	private String imeiPrezimeProfesora;

	public Ispit(String nazivPredmeta, int ocena, String imeiPrezimeProfesora) {
		super();
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.imeiPrezimeProfesora = imeiPrezimeProfesora;

	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getImeiPrezimeProfesora() {
		return imeiPrezimeProfesora;
	}

	public void setImeiPrezimeProfesora(String imeiPrezimeProfesora) {
		this.imeiPrezimeProfesora = imeiPrezimeProfesora;
	}

	public boolean polozioPao() {
		if (this.ocena > 5 && this.ocena <= 10) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.imeiPrezimeProfesora + " - " + this.ocena);
	}
}
