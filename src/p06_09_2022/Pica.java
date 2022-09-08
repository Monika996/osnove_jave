package p06_09_2022;

public class Pica extends Proizvod{
//2. Zadatak
//Caribic zeli da napravi program koji omogucava da se kreira proizvod sa proizvoljnim brojem podataka
//Npr: Ice point vanila sa dodacima: plazma, cokolada
//Npr: Pica sa dodacima: kackavalj, masline, kecap, majonez
//
//Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
// naziv dodatka
// cenu dodatka
// konstruktore, gettere i settere koji su vam potrebni
// metodu stampaj koja stampa u formatu:
//(dodatak)  (cena)
//
//Kreirati abstraktnu klasu Proizvod koja ima:
// niz dodataka
// metodu ubaciDodatak koja dodaje dodatak u niz
// metodu koja vraca cenu svih dodataka koje ima proizvod
// abstraktnu metodu ukupnu racunaj cenu 
// abstraktnu metodu stampaj
//
//
//
//Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
// tip sladoleda (vanila, cokolada)
// atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
// override uje metodu koja ukupnu cenu racuna:
//ako je mali ice point na cenu svih dodataka doda 100
//ako je veliki ice point cenu svih dodataka doda 130
//override uje metodu stampaj da stampa sve podatke
//	
//Kreirati klasu Pica koja nasledjuje klasu Proizvod i koja ima:
// cena podloge
// override uje metodu koja ukupnu racuna cenu tako sto na cenu svih dodataka doda i cenu podloge
//override uje metodu stampaj da stampa sve podatke
//	
//U glavnom programu kreirati niz proizvoda od 3 IcePinta i 2 Pice. Svakom proizvodu dodati po nekoliko dodataka i na kraju ispisati ukupnu cenu porudzbine.

	private int cenaPodloge;

	@Override
	public int ukupnuRacunajCenu() {
		int ukupnaCena = 0;
		for (int i = 0; i < dodaci.size(); i++) {
			ukupnaCena = dodaci.get(i).getCena();
			ukupnaCena = ukupnaCena + this.cenaPodloge;

		}
		return ukupnaCena;

	}

	@Override
	public void print() {
		System.out.println("Pica:");
		for (int i = 0; i < this.dodaci.size(); i++) {
			this.dodaci.get(i).print();
		}
		System.out.println("Ukupna cena: " + this.ukupnuRacunajCenu());
		System.out.println();
	}

	public Pica(int cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	public Pica() {
		super();
	}

	public int getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(int cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}
}
