package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik
//		za dva prosledjena broja. Brojevi su ulazni parametri funkcije. 
//	U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim vrednostima. 
	printKalkulator(3,5);
	printKalkulator(2,8);

	}
	
	public static void printKalkulator(int a, int b) {
		int zbir = a + b;
		int razlika = a - b;
		int proizvod = a * b;
		int kolicnik = a / b;
		System.out.println("Zbir brojeva je: " + zbir);
		System.out.println("Razlika brojeva je: " + razlika);
		System.out.println("Proizvod brojeva je: " + proizvod);
		System.out.println("Kolicnik brojeva je: " + kolicnik);
	}
}
	
