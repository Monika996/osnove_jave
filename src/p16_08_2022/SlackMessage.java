package p16_08_2022;

public class SlackMessage {
	public String tekst;
	public String ime;
	public String prezime;
	public String datum;
	public String vreme;
	
	public void stampaj() {
		System.out.println("Tekst" + this.tekst);
		System.out.println("Ime" + this.ime);
		System.out.println("Prezime" + this.prezime);
		System.out.println("Datum" + this.datum);
		System.out.println("Vreme" + this.vreme);
	}
}
