package p15_08_2022;

public class Zadatak6 {

	public static void main(String[] args) {
//		6. Zadatak
//		Napisati metodu koja stampa N zvezdica u istom redu. Broj zvezdica je odredjen parametrom N.
//		Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//		N=5, print je=> * * * * * 
		printStars(5);
		

	}
	public static void printStars(int numberOfStars) {
		for (int i = 0; i < numberOfStars; i++) {
			System.out.print("* ");
		}
			
	

		System.out.println();
	}
}
