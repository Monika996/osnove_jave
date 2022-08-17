package p16_08_2022;

public class auto1 {

	public static void main(String[] args) {
//		3.  Zadatak
//		Kreirati klasu Auto koja ima:
//		ime i prezime vozaca
//		marku automobila
//		broj vrata
//		potrosnju na 100km (npr: 10)
//		trenutnu brzinu kojom se auto krece
//		metodu za stampu koja stampa podatke u formatu:
//		[Vozac]
//			[Marka] - [br vrata]-ro vrata
//			Sa potrosnjom od [potrosnja] l na 100km
//			[Trenutna brzina auta] km/h je trenutna brzina.
//		(Dopuna)
//		U okviru klase Auto, implementirati jos 2 metode:
////		metoda koja vraca informaciju da li je vozac prekoracio brzinu. 
//		Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca
//		true ili false ako je trenutna brzina veca od ogranicenja.
////		metoda koja vraca visinu novcane kazne za prekoracenje, za svaku 
//		jedinicu prekoracenja placa se 1000din. Metoda od parametara prima 
//		ogranicenje brzine
////		U glavnom programu pozvati ove metode i odstmpajte neke poruke na
//		osnovu informacija koje dobijete od njih.



		Auto a = new Auto();
		a.punoIme = "Monika Petrovic";
		a.marka = "BMW";
		a.brojVrata = 5;
		a.potrosnja = 20;
		a.brzina = 150;
		a.stampaj();
		boolean x = a.prekoracenje(50);
	}
	
	
	

}