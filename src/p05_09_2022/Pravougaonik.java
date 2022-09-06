package p05_09_2022;

public class Pravougaonik extends Figura{
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
//

	private double a;
	private double b;

	public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double povrsina() {

		return a * b;
	}

	@Override
	public double obim() {

		return 2 * (a + b);
	}

}
