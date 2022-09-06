package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
//		3. Zadatak
//		Kreirati abstraktnu klasu Figura koja ima
//		abstraktnu metodu povrsina
//		abstraktnu metodu obim
//		metodu koja stampa podatke u formatu:
//		Povrsina je (povrsina)
//		Obim je (obim)
//
//		Kreirati klasu JednakostranicniTrougao koja nasledjuje klasu Figura:
//		stranicu a
//		gettere/settere/konstruktore
//		implementira metodu povrsina po formuli (a * a) * 1.73205 / 4
//		implementira metodu obim
//
//		Kreirati klasu Pravougaonik koja nasledjuje klasu Figura:
//		stranice a i b
//		gettere/settere/konstruktore
//		implementira metodu povrsina
//		implementira metodu obim
//
//		U glavnoj klasi kreirati niz od 5 figura (2 trougla, 3 pravougaonika) zatim sabrati
//		sve povrsine i obime i za svaku figuru ispisati ponaosob

		ArrayList<Figura> figure = new ArrayList<Figura>();
		figure.add(new JednakostranicniTrougao(3));
		figure.add(new JednakostranicniTrougao(5));
		figure.add(new Pravougaonik(4, 5));
		figure.add(new Pravougaonik(5, 6));
		figure.add(new Pravougaonik(7, 8));

		for (int i = 0; i < figure.size(); i++) {
			figure.get(i).print();
			System.out.println();
		}
		double povrsine = 0;
		for (int i = 0; i < figure.size(); i++) {
			povrsine += figure.get(i).povrsina();
		}
		System.out.println("Povrsine: " + povrsine);

		double obimi = 0;
		for (int i = 0; i < figure.size(); i++) {
			obimi += figure.get(i).obim();
		}
		System.out.println("Obimi: " + obimi);
	}

}
