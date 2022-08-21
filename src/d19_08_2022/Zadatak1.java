package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		FacebookPost facebookone = new FacebookPost();
		facebookone.imeIPrezime1 = "Official Nike Sport page";
		facebookone.imeIPrezime2 = "Jug Nikolic";
		facebookone.tekstObjave = "You have discount code in your email address, please use it for you next shopping on out page!";
		facebookone.brojLajkova = 1;
		facebookone.brojDeljenja = 0;
		facebookone.stampaj();
		facebookone.like();
		facebookone.dislike();
		facebookone.share();
		System.out.println(); // zbog preglednosti.

		FacebookPost facebooktwo = new FacebookPost();
		facebooktwo.imeIPrezime1 = "Alpas Resort";
		facebooktwo.imeIPrezime2 = "Andjela Janicijevic";
		facebooktwo.tekstObjave = "Iskoristite nasu snizenu ponudu i provedite leto u prirodi i svim benefitima koje vam nudi Alpas Resort ";
		facebooktwo.brojLajkova = 3;
		facebooktwo.brojDeljenja = 2;
		facebooktwo.stampaj();
		facebooktwo.like();
		facebooktwo.dislike();
		facebooktwo.share();

	}

}
