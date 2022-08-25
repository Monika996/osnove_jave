package d23_08_2022;

public class ZeleniKarton {
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//	(naziv predmeta) - (ocena)
//	Student: ime i prezime, broj indeksa
//	Profesor: ime i prezime
//
//	U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite

	private String imeiPrezimeStudenta;
	private int brojIndeksa;
	private String nazivPredmeta;
	private String imeiPrezimeProfesora;
	private int ocena;

	public ZeleniKarton() {

	}

	public ZeleniKarton(String imeiPrezimeStudenta, int brojIndeksa, String nazivPredmeta, String imeiPrezimeProfesora,
			int ocena) {

		this.imeiPrezimeStudenta = imeiPrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeiPrezimeProfesora = imeiPrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeiPrezimeStudenta() {
		return imeiPrezimeStudenta;
	}

	public void setImeiPrezimeStudenta(String imeiPrezimeStudenta) {
		this.imeiPrezimeStudenta = imeiPrezimeStudenta;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeiPrezimeProfesora() {
		return imeiPrezimeProfesora;
	}

	public void setImeiPrezimeProfesora(String imeiPrezimeProfesora) {
		this.imeiPrezimeProfesora = imeiPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeiPrezimeStudenta + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeiPrezimeProfesora);
		System.out.println();
	}

}
