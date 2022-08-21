package d18_08_2022;

public class Zadatak {

	public static void main(String[] args) {
		Proizvod proizvod = new Proizvod();
		
		proizvod.nazivProizvoda = "Kafa";
		proizvod.cenaProizvoda = 110.0;
		proizvod.tezinaProizvoda = 100.0;
		proizvod.stampaj();
		proizvod.povecajCenu(50);
		System.out.println("Nova cena proizvoda je: " + proizvod.cenaProizvoda);
		System.out.println("Cena sa popustom je: " + proizvod.cenaSaPopustom(30));
		System.out.println("Postarina proizvoda je: " + proizvod.postarina() + "din");
		System.out.println();
	
		Proizvod proizvod2 = new Proizvod();
		proizvod2.nazivProizvoda = "Mleko";
		proizvod2.cenaProizvoda = 155.0;
		proizvod2.tezinaProizvoda = 1000.0;
		proizvod2.stampaj();
		proizvod2.povecajCenu(25);
		System.out.println("Nova cena proizvoda je: " + proizvod2.cenaProizvoda);
		System.out.println("Cena sa popustom je: " + proizvod2.cenaSaPopustom(15));
		System.out.println("Postarina proizvoda je: " + proizvod2.postarina() + "din");
		System.out.println();
		

	}

}
