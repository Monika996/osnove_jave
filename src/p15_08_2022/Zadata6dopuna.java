package p15_08_2022;

public class Zadata6dopuna {

	public static void main(String[] args) {
//		6. Zadatak
//		Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//		Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
//		Napisati main program koji koristi metodu definisanu u 6.zad tako da stampa sledecu sliku za N. N unosi korisnik.
//		Primer izvrsenja:
//		Unesite N: 6
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
//		* * * * * *
		printStars(1);
		printStars(2);
		printStars(3);
		printStars(4);
		printStars(5);
		printStars(6);
	}
	public static void printStars(int numberOfStars) {
		for (int i = 0; i < numberOfStars; i++) {
			System.out.print("* ");
		}
			
	

		System.out.println();
	}
}

	


