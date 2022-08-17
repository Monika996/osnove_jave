package d_16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu 
//		atribut za mod (hladi/greje) - string
//		metodu za stampu (proizvoljno)
//		metodu koja vraca informaciju da li je napolju veca temperatura od 
//		one na koju je klima postavljena. Metoda kao parametar prima temperaturu koja je napolju.
//		Uglavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode

		SmartAirConditioning klima1 = new SmartAirConditioning();
		SmartAirConditioning klima2 = new SmartAirConditioning();

		klima1.marka = "Gree";
		klima1.mod = "greje";
		klima1.temperatura = 22.3;

		klima2.marka = "Samsung";
		klima2.mod = "hladi";
		klima2.temperatura = 17.0;

		klima1.stampaj();
		boolean temp1 = klima1.jeVecaNapolju(29);
		System.out.println("Prva klima: " + temp1);

		klima2.stampaj();
		boolean temp2 = klima2.jeVecaNapolju(12);
		System.out.println("Druga klima: " + temp2);

	}

}
