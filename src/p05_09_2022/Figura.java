package p05_09_2022;

public abstract class Figura {
//	3. Zadatak
//	Kreirati abstraktnu klasu Figura koja ima
//	abstraktnu metodu povrsina
//	abstraktnu metodu obim
//	metodu koja stampa podatke u formatu:
//	Povrsina je (povrsina)
//	Obim je (obim)
//
//	Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//	stranicu a
//	gettere/settere/konstruktore
//	implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//	implementira metodu obim
//
//	Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//	stranice a i b
//	gettere/settere/konstruktore
//	implementira metodu povrsina
//	implementira metodu obim
//
//	U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati sve povrsine i obime i za svaku figuru ispisati ponaosob

	public abstract double povrsina();

	public abstract double obim();

	public void print() {
		System.out.println("Povrsina je: " + this.povrsina());
		System.out.println("Obim je: " + this.obim());
	}

}
