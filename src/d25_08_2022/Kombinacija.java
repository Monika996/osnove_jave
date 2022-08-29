package d25_08_2022;

import java.util.ArrayList;

public class Kombinacija {
//	2. Zadatak (Za vezbanje)
//	Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//
//	Za potrebe Lotto igre na srecu potrebno je 
//	Kreirati klasu Kombinacija koja ima:
//	id kombinacije (String)
//	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//	Zaglavlje metode je:
//	public boolean daLiJeIstaKombinacija( Kombinacija k)
//	metoda vraca true ako su svi elementi na istim pozicija isti
//	npr: this [0] == k [0], this [1] == k [1] …. 
//	metodu za stampu koja stampa podatke u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//		Kreirati klasu Listic koja ima: 
//	niz kombinacija - maksimalno 7 kombinacija
//	metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//	metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru.
	// Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji
	// prosledjena kombinacija.
	// Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//	Zaglavlje metode 
//	public boolean dobitna(Kombinacija dobitnaKombinacija)
//	metodu koja stampa listic u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
//
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
//
//	…… i tako za sve kombinacije

	private ArrayList<Integer> brojevi = new ArrayList<Integer>();

	private String ID;

	public Kombinacija(String ID, int broj1, int broj2, int broj3, int broj4, int broj5, int broj6, int broj7) {
		this.ID = ID;
		this.brojevi.add(broj1);
		this.brojevi.add(broj2);
		this.brojevi.add(broj3);
		this.brojevi.add(broj4);
		this.brojevi.add(broj5);
		this.brojevi.add(broj6);
		this.brojevi.add(broj7);

	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getbroj1() {
		return this.brojevi.get(0);
	}

	public void setbroj1(int broj1) {
		this.brojevi.add(broj1);
	}

	public int getbroj2() {
		return this.brojevi.get(1);
	}

	public void setbroj2(int broj2) {
		this.brojevi.add(broj2);
	}

	public int getbroj3() {
		return this.brojevi.get(2);
	}

	public void setbroj3(int broj3) {
		this.brojevi.add(broj3);
	}

	public int getbroj4() {
		return this.brojevi.get(3);
	}

	public void setbroj4(int broj4) {
		this.brojevi.add(broj4);
	}

	public int getbroj5() {
		return this.brojevi.get(4);
	}

	public void setbroj5(int broj5) {
		this.brojevi.add(broj5);
	}

	public int getbroj6() {
		return this.brojevi.get(5);
	}

	public void setbroj6(int broj6) {
		this.brojevi.add(broj6);
	}

	public int getbroj7() {
		return this.brojevi.get(6);
	}

	public void setbroj7(int broj7) {
		this.brojevi.add(broj7);
	}

	public void dodajKombinaciju() {

	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		if (this.getbroj1() == k.getbroj1() && this.getbroj2() == k.getbroj2() && this.getbroj3() == k.getbroj3()
				&& this.getbroj4() == this.getbroj4() && this.getbroj5() == k.getbroj5()
				&& this.getbroj6() == this.getbroj6() && this.getbroj7() == this.getbroj7()) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println("ID: " + this.ID);
		System.out.println("Brojevi: ");
		for (int i = 0; i < brojevi.size(); i++) {
			System.out.print(this.brojevi.get(i) + " , ");

		}
	}
}
