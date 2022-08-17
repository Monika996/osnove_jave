package p16_08_2022;

public class slackmessage1 {

	public static void main(String[] args) {
//		Krairti klasu SlackMessage koja ima:
//			tekst poruke
//			ime i prezime osobe koja je stavila poruku
//			datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//			U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i
//			ostampati obe poruke u formatu:
//			[ime i prezime osobe] - [kad je poslata]
//			[Tekst poruke]
//		Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u 
//		formatu koji je naveden iznad i u mainu pozovite metode nad objektima 
//		koje ste kreirali.

		SlackMessage m = new SlackMessage();
		m.tekst = "Milane posalji nam zadatke za test i daj mi obecanih 10 poena.";
		m.ime = "Monika";
		m.prezime = "Petrovic";
		m.datum = "16.08.2022.";
		m.vreme = "18:50";
		
		m.stampaj();
		


		SlackMessage r = new SlackMessage();
		r.tekst = "Test nije eliminacionog tipa";
		r.ime = "Milos";
		r.prezime = "Nikolic";
		r.datum = "20.08.2022.";
		r.vreme = "18:00";
		
		r.stampaj();

	}
	
	
}
