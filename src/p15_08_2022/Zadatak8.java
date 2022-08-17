package p15_08_2022;

public class Zadatak8 {

	public static void main(String[] args) {
//		8. Zadatak
//		Napisati metodu koja proverava da li je trougao pravougli. 
//		Metoda prima stranice trougla i hipotenuzu trougla. 
//		Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//		Trougao je pravougli ukoliko je a*a+b*b=c*c
		
	
	if(jePravougli(3,4,6) == true) {
	System.out.println("Jeste pravougli.");
	} else {
		System.out.println("Nije pravougli."); }
	
	
	
	
	}
	public static boolean jePravougli(int a, int b, int c) {
		if(a * a + b * b == c * c) {
			return true;
	}{
		return false;
}
}
}