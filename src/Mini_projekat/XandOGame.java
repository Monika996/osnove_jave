package Mini_projekat;

import java.util.ArrayList;

public class XandOGame {
//	Kreirati klasu XandOGame koja ima:
//		table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//		nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//		playerX - igrac X
//		playerO - igrac O
//		Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//		Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i 
//		difoltni samo sto dodatno postavlja i igraca
//		gettere i settere za igrace
//		Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. 
//		Ako je niz iz primera iznad stampa izgleda:
//		x | x | 0 |
//		0 | x | 0 |
//		x | 0 | x |

//		Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da 
//		je na redu igrac X.
//		Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//		Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i
//		poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//		Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i 
//		obrnuto
//		Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//		Ako je trenutno stanje u igri i sledeci na redu je igrac x
//		x | x | 0 |
//		0 |   |   |
//		x |   |   |
//		I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//		x | x | 0 |
//		0 |   | x |
//		x |   |   |
//		Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//		Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//		Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//		Metodu gameScore, metoda vraca informaciju za kraj igre.
//		Ukoliko je pobednik igrac x, metoda vraca 1
//		Ukoliko je pobednik igrac o, metoda vraca 2
//		Ukoliko nemam pobednika vracamo 0
//	Glavni program (main):
//		Ucitati podatke za igrace
//		Kreirajte objekat klase XandOGame 
//		Startujte igru, tada je na potezu igrac X
//		Saveti za dobar zadatak
//		Igra treba da traje dok (while petlja)
//		nije kraj igre - imamo metodu za to
//		Ili dok ne dobijemo pobednika
//		U petlji
//		Trazimo od aktuelnog igraca da unese potez
//		Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//		Prebacujemo red na drugog igraca
//		Stampamo tablu
//		Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//		Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace

	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player igracX;
	private Player igracO;

	public XandOGame() {
		super();
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public XandOGame(Player igracX, Player igracO) {
		super();
		this.igracX = igracX;
		this.igracO = igracO;
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public Player getIgracX() {
		return igracX;
	}

	public void setIgracX(Player igracX) {
		this.igracX = igracX;
	}

	public Player getIgracO() {
		return igracO;
	}

	public void setIgracO(Player igracO) {
		this.igracO = igracO;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void print() {
		for (int i = 0; i < table.size(); i++) {
			if (i != 0 && (i + 1) % 3 == 0) {
				System.out.println(this.table.get(i) + " | ");

			} else {
				System.out.println(this.table.get(i) + " | ");
			}

		}

	}

	public void startGame() {
		this.table.set(0, " ");
		this.table.set(1, " ");
		this.table.set(2, " ");
		this.table.set(3, " ");
		this.table.set(4, " ");
		this.table.set(5, " ");
		this.table.set(6, " ");
		this.table.set(7, " ");
		this.table.set(8, " ");

		this.nextPlayer = "x";

	}

	public boolean isgameOver() {
		boolean isGameOver = true;
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				isGameOver = false;
			}

		}
		return isGameOver;
	}

	public boolean isFieldFree(int pozicija) {
		if (this.table.get(pozicija).equals("x") || this.table.get(pozicija).equals("o")) {
			return false;
		} else {
			return true;
		}
	}

	public void playNext() {
		if (this.nextPlayer == "x") {
			this.nextPlayer = "o";

		} else {
			this.nextPlayer = "x";
		}
	}

	public void makeAMove(int pozicija) {
		if (this.isFieldFree(pozicija) == true) {
			this.table.set(pozicija, this.nextPlayer);
		}
	}

	public boolean winerX() {
		if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")
				|| this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")
				|| this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")
				|| this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")
				|| this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")
				|| this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean winerO() {
		if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")
				|| this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")
				|| this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")
				|| this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")
				|| this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")
				|| this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidMove(int pozicija) {
		if (pozicija < 0 || pozicija > 8) {
			return false;

		} else {
			return true;
		}
	}

	public int gameScore() {
		if (this.winerX() == true) {
			return 1;
		} else if (this.winerO() == true) {
			return 2;
		} else {
		}
		return 0;

	}

}
