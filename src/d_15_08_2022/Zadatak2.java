package d_15_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. 
//		Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string tako
//		sto spoji ime i prezime. METODA NISTA NE STAMPA.
//		Primer poziva: Ako se metoda pozvoe za ime=?Milan? i prezime=?Jovanovic?, metoda vraca ?Milan Jovanovic?
		imePrezime("Monika", "Nikolic");

	}

	public static String imePrezime(String ime, String prezime) {
		return ime + " " + prezime;
	}

}
