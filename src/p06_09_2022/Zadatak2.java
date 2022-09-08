package p06_09_2022;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {

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

		ArrayList<Proizvod> porudzbina = new ArrayList<Proizvod>();
		Pica pica = new Pica(120);
		pica.ubaciDodatak(new Dodatak("origano", 5));
		pica.ubaciDodatak(new Dodatak("prsuta", 20));
		pica.ubaciDodatak(new Dodatak("sampinjoni", 20));
		pica.ubaciDodatak(new Dodatak("kecap", 20));

		IcePoint vanila = new IcePoint(true);
		vanila.ubaciDodatak(new Dodatak("plazma", 10));
		vanila.ubaciDodatak(new Dodatak("lesnik", 10));
		vanila.ubaciDodatak(new Dodatak("vanila", 10));

		IcePoint cokolada = new IcePoint(true);
		cokolada.ubaciDodatak(new Dodatak("preliv od jagode", 20));
		cokolada.ubaciDodatak(new Dodatak("preliv od cokolade", 20));
		cokolada.ubaciDodatak(new Dodatak("plazma", 20));

		porudzbina.add(pica);
		porudzbina.add(vanila);
		porudzbina.add(cokolada);
		
		int cenaPorudzbine = 0;
		for (int i = 0; i < porudzbina.size(); i++) {
			cenaPorudzbine += porudzbina.get(i).ukupnuRacunajCenu();
			
		}
		for (int i = 0; i < porudzbina.size(); i++) {
			porudzbina.get(i).print();
		}
		System.out.println("Cena porudzbine: " + cenaPorudzbine);
	}

}
