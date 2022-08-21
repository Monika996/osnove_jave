package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Facebook facebook1 = new Facebook();
		facebook1.imeIPrezime1 = "Monika Nikolic";
		facebook1.imeIPrezime2 = "Isidora Petrovic";
		facebook1.tekstObjave = "Women are not meant to sit still and look pretty. We are meant to build empires";
		facebook1.brojLajkova = 11;
		facebook1.brojDeljenja = 8;
		System.out.println("Ime korisnika koje je objavio post je: " + facebook1.imeIPrezime1);
		System.out.println("Ime korisnika na cijem profilu je objavljen post je: " + facebook1.imeIPrezime2);
		System.out.println("Tekst objave: " + facebook1.tekstObjave);
		System.out.println(); // zbog preglednosti.
		facebook1.smanjenje();
		facebook1.povecanje();
		facebook1.share();

		Facebook facebook2 = new Facebook();
		facebook2.imeIPrezime1 = "Jakov Janicijevic";
		facebook2.imeIPrezime2 = "Milos Nikolic";
		facebook2.tekstObjave = "Happy birthday!";
		facebook2.brojLajkova = 2;
		facebook2.brojDeljenja = 0;
		facebook2.povecanje();
		facebook2.smanjenje();
		facebook2.share();
		System.out.println("Ime korisnika koje je objavio post je: " + facebook2.imeIPrezime1);
		System.out.println("Ime korisnika na cijem profilu je objavljen post je: " + facebook2.imeIPrezime2);
		System.out.println("Tekst objave: " + facebook2.tekstObjave);

	}

}
