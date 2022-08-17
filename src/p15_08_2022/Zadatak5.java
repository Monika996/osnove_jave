package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		5. Zadatak
//		Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost   prosledjene vrednosti.

		apsolutnaVrednost(-5);
	}
	public static void apsolutnaVrednost(int n) {
		if(n < 0) {
		n = n * (-1); 
		}
		System.out.println("Apsolutna vrednost je: " + n);
	}
}
