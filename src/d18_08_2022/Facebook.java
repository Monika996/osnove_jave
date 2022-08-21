package d18_08_2022;
//2.Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

public class Facebook {
	public String imeIPrezime1;
	public String imeIPrezime2;
	public String tekstObjave;
	public int brojLajkova;
	public int brojDeljenja;

	public void povecanje() {
		this.brojLajkova++;
	}

	public void smanjenje() {
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
		System.out.println(this.brojLajkova + "/" + this.brojDeljenja);
	}
}
