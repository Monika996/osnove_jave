package d_16_08_2022;

public class SmartAirConditioning {
	
	
	String marka;
	double temperatura;
	String mod;



	public void stampaj() {
		System.out.println("Marka klime: " + this.marka);
		System.out.println("Izabrana temperatura: " + this.mod);
		System.out.println("Temperatura je: " + this.temperatura);

	}

	public boolean jeVecaNapolju(int tempNapolju) {
		if(tempNapolju > this.temperatura) {
			return true;
		} else {
			return false;
		}
	}


}

