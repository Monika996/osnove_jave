package p06_09_2022;

public abstract class Atleticar {
//	Zadatak 3. Kreirati apstraktnu klasu Atleticar čiji su tributi: 
//		ime i prezime privatni
//		i rezultat ostvaren na takmičenju koji je zasticen
//		Javne metode klase su: 
//		apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//		metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//		Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći. 
//		Kreirati i klasu Disciplina čiji su privatni atributi: 
//		ime discipline
//		tip discipline (Trkacka ili Skakacka)
//		niz atletičara koji učestvuju u toj disciplini. 
//		U javnom delu klase definisati: 
//		konstuktore, gettere i settere
//		konstruktor koji postavlja ime discipline i tip
//		metodu dodaj atleticara u disciplinu
//		metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//		(za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
//		(za vezbanje) metoda koja prikazuje podatke o pobedniku discipline. 
//		U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,  (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline. 

	private String imeIPrezime;
	protected double rezultat;
	
	public Atleticar() {
		
	}
	public Atleticar(String imeIPrezime, double rezultat) {
		super();
		this.imeIPrezime = imeIPrezime;
		this.rezultat = rezultat;
	}
	public double getRezultat() {
		return rezultat;
	}
	public void setRezultat(double rezultat) {
		this.rezultat = rezultat;
	}
	public abstract boolean daLijeBolji(Atleticar a);

	public void print() {
		System.out.println(this.imeIPrezime + " , " + this.rezultat);
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

}
