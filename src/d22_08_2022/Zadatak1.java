package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
	
		Autor autor = new Autor("Donato", "Karizi");
		Knjiga K1 = new Knjiga (23456, "Decak od stakla", 2019, autor);
		Knjiga K2 = new Knjiga (56788, "Saptac", 2005, autor);
		K1.print();
		K2.print();
		
		Autor autor1 = new Autor ("Sidni" , "Sheldon");
		Knjiga K3 = new Knjiga (780567, "Ako docekam sutra", 1990, autor1);
		Knjiga K4 = new Knjiga (73954, "Gnev andjela", 1995, autor1);
		K3.print();
		K4.print();
		

	}

}
