package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//		Napisati metodu koja vraca suprotno negativni broj od prosledjenog. 
//		Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//		Primer: Ako se metoda pozove za N=10, vraca -10
//			Ako se metoda pozove za N=-11, vraca 11
		int x = 5;
		int s = suprotan(x);
		System.out.println("X je " + x + ", suprotno je " + s);
		
		
		
		
		
		
	}
	public static int suprotan(int broj) {
		return -broj;
	}
	
	
}

