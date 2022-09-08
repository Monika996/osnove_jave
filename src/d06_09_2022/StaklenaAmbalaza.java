package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{
//	1.Zadatak
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
//
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
//
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)
//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//	U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

	private double kaucija;
	private boolean daLiSeplacaK;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(String barKod, String nazivArtikla, double brutoTezina, double netoTezina, double kaucija,
			boolean daLiseplacaK, double osnovnaCena) {
		super(barKod, nazivArtikla, brutoTezina, netoTezina);
		this.kaucija = kaucija;
		this.daLiSeplacaK = daLiseplacaK;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSeplacaK() {
		return daLiSeplacaK;
	}

	public void setDaLiseplacaK(boolean daLiSeplacaK) {
		this.daLiSeplacaK = daLiSeplacaK;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.daLiSeplacaK == true) {
			return this.osnovnaCena * 1.2 * this.kaucija;
		} else {
			return this.osnovnaCena * 1.2;
		}

	}

	@Override
	public void print() {
		System.out.println("Bar kod je: " + this.barKod);
		System.out.println("Naziv artikla je: " + this.nazivArtikla);
		System.out.println("Bruto tezina je: " + this.brutoTezina);
		System.out.println("Neto tezina je: " + this.netoTezina);
		System.out.println("Osnovna cena je: " + this.osnovnaCena);
		System.out.println("Kaucija je: " + this.kaucija);
		System.out.println("Osnovna cena je: " + this.osnovnaCena);
		System.out.println("Da li se placa kaucija: " + this.daLiSeplacaK);

	}

}
