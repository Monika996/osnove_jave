package d22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Proizvod p = new Proizvod("232455" , "Kafa", 60);
		Vaga p1 = new Vaga();
		p1.setProizvod(p);
		p1.setMernaJedinica("kg");
		p1.setMernaJedinica("lb");
		p1.printBill(60);
		
		
		Proizvod r = new Proizvod("232695" , "Mleko", 70);
		Vaga r1 = new Vaga();
		r1.setProizvod(r);
		r1.setMernaJedinica("kg");
		r1.setMernaJedinica("lb");
		r1.printBill(70);
		
		

	}

}
