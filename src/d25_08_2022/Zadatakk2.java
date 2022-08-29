package d25_08_2022;

public class Zadatakk2 {

	public static void main(String[] args) {
//		2. Zadatak (Za vezbanje)
//		Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//
//		Za potrebe Lotto igre na srecu potrebno je 
//		Kreirati klasu Kombinacija koja ima:
//		id kombinacije (String)
//		niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//		konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//		gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//		metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//		Zaglavlje metode je:
//		public boolean daLiJeIstaKombinacija( Kombinacija k)
//		metoda vraca true ako su svi elementi na istim pozicija isti
//		npr: this [0] == k [0], this [1] == k [1] …. 
//		metodu za stampu koja stampa podatke u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
		//
		//
//			Kreirati klasu Listic koja ima: 
//		niz kombinacija - maksimalno 7 kombinacija
//		metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//		metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//		Zaglavlje metode 
//		public boolean dobitna(Kombinacija dobitnaKombinacija)
//		metodu koja stampa listic u formatu
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
		//
//		ID: id kombinacije
//		brojevi: 1, 3, 5, 14, 15, 21, 23
//
//		…… i tako za sve kombinacije

		Kombinacija a = new Kombinacija("3445t ", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija b = new Kombinacija("3445t ", 3, 4, 7, 8, 9, 9, 1);
		Kombinacija c = new Kombinacija("3445t ", 10, 11, 12, 15, 16, 18, 19);
		Kombinacija d = new Kombinacija("3445t ", 20, 11, 4, 5, 8, 10, 23);
		Kombinacija e = new Kombinacija("3445t ", 1, 3, 5, 14, 15, 21, 23);
		Kombinacija f = new Kombinacija("3445t ", 25, 26, 11, 6, 7, 8, 9);
		Kombinacija g = new Kombinacija("3445t ", 10, 30, 31, 38, 4, 6, 10);
		Kombinacija h = new Kombinacija("3445t ", 32, 33, 23, 26, 12, 25, 27);
		Kombinacija j = new Kombinacija("3445t ", 22, 11, 12, 2, 4, 3, 8);

		Kombinacija dobitna = new Kombinacija("abfge", 1, 2, 3, 4, 5, 6, 7);
		Listic l = new Listic();
		l.dodajKombinaciju(a);
		l.dodajKombinaciju(b);
		l.dodajKombinaciju(c);
		l.dodajKombinaciju(d);
		l.dodajKombinaciju(e);
		l.dodajKombinaciju(f);
		l.dodajKombinaciju(g);
		l.dodajKombinaciju(h);
		l.dodajKombinaciju(j);

	}

}
