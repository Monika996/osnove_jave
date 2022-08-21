package d19_08_2022;

public class FacebookPost {
//	1.Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		 Konstruktore:
//		difoltni konstuktor
//		konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1
//		
	public String imeIPrezime1;
	public String imeIPrezime2;
	public String tekstObjave;
	public int brojLajkova;
	public int brojDeljenja;

	public FacebookPost() {

	}

	public FacebookPost(String imeIPrezime1, String imeIPrezime2, String tekstObjave) {
		this.imeIPrezime1 = imeIPrezime1;
		this.imeIPrezime2 = imeIPrezime2;
		this.tekstObjave = tekstObjave;
	}

	public void like() {
		this.brojLajkova++;
	}

	public void dislike() {
		this.brojLajkova--;
		if (this.brojLajkova < 0) {
			this.brojLajkova = 0;
		}
	}

	public void share() {
		this.brojDeljenja++;
	}

	public void stampaj() {
		System.out.println(this.imeIPrezime1 + ">>>" + this.imeIPrezime2);
		System.out.println(this.tekstObjave);
		System.out.println("Likes" + " " + this.brojLajkova + " | " + "Shares" + " " + this.brojDeljenja);
	}

}
