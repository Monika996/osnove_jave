package d22_08_2022;

public class Knjiga {
//	Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

	private int ISBN;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;
	
	public Knjiga() {
	}

	public Knjiga(int iSBN, String naziv, int godinaIzdanja, Autor autor) {
		ISBN = iSBN;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public void print() {
		System.out.println(this.ISBN);
		System.out.println(this.naziv + " - " + this.godinaIzdanja);
		System.out.println("Autor: " + this.autor.getIme() + " " + this.autor.getPrezime());
	}
	
	
	
	
}
