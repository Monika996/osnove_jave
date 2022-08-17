package d_16_08_2022;

public class Proizvod {
	
	public String naziv;
	public double cena;
	public double tezina;

	public void stampaj() {
		System.out.println("{{" + naziv + "}}, {{" + cena + "}}, {{" + tezina + "}}");
	}

	public double konvertuj(String tezina1) {
		if (tezina1.equals("kg")) {
			return tezina / 1000;
		} else if (tezina1.equals("t")) {
			return tezina / 100000;
		}
		return 0;

	}
}
