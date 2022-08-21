package d18_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		SmartAirConditioning klima = new SmartAirConditioning();
		klima.marka = "Samsung";
		klima.energijaHladi = 1;
		klima.energijaGreje = 2;
		klima.izabranaTemp = 20;
		klima.mod = "Greje";
		klima.stampaj();
		
		System.out.println("Mesecna potrosnja je: " + klima.mesecnaPotrosnja() + "KWh" );
		
		
	
	}

}
