package d_16_08_2022;

public class proizvod1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute naziv proizvoda (String) cenu proizvoda (double)
//		težinu proizvoda u gramima. (double) i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. 
//		Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012

		Proizvod p = new Proizvod();
		p.naziv = "Voda";
		p.cena = 100;
		p.tezina = 150;
		p.stampaj();
		p.konvertuj("kg");
		// System.out.println(p.konvertuj("kg"));
		// System.out.println(p.konvertuj("t"));
		Proizvod p1 = new Proizvod();
		p1.naziv = "Brasno";
		p1.cena = 115;
		p1.tezina = 2000;
		p1.stampaj();
		p1.konvertuj("t");

		Proizvod p2 = new Proizvod();
		p2.naziv = "Secer";
		p2.cena = 145;
		p2.tezina = 2100;
		p2.stampaj();
		p2.konvertuj("kg");

	}

}
