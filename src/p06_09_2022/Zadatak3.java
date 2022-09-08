package p06_09_2022;

public class Zadatak3 {
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

	public static void main(String[] args) {
		Disciplina skok = new Disciplina("Skok udalj ", "skakaci");
		Disciplina trka = new Disciplina("Trka na 110 metara sa preponama ", "trkaci");
		skok.dodajAtleticara(new Skakac("Milan Milovanovic ", 9.2));
		skok.dodajAtleticara(new Skakac("Uros Nedeljkovic ", 8.4));
		skok.dodajAtleticara(new Skakac("Lazar Radovanovic ", 8.0));
		skok.diskvalifikujAtleticara("Lazar Radovanovic ");
		skok.najbolji().print();

		trka.dodajAtleticara(new Trkac("Nikola Nikolov ", 9.11));
		trka.dodajAtleticara(new Trkac("Vuk Ristic ", 10.0));
		trka.dodajAtleticara(new Trkac("Petar Miljkovic ", 9.9));
		trka.diskvalifikujAtleticara("Nikola Nikolov");
		trka.najbolji().print();

	}

}
