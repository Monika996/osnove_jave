package d_15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//		(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		int rezultat = najmanjiBroj(21, 19, 12);
		System.out.println("Najmanji broje je: " + rezultat);
	}

	public static int najmanjiBroj(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}

	}

}

