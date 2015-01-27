package java2;

/**
 * 
 * @author Ari Tuhkala
 *
 */
public class HelloWorld {

	
	/**
	 * @param nimi nimi, jota huudetaan
	 */
	public void yellToWorld (String nimi){
		System.out.println("Hello there " + nimi);
	}
	/**
	 * Metodi muuttaa parametrina syötetyn nimen isoiksi kirjaimiksi
	 * 
	 * @param nimi annettava nimi
	 * @return nimi isolla kirjoitettuna
	 */
	
	
	/**
	 * Pääohjelma, jossa käynnistetään ohjelma
	 * @param args ei käytössä
	 */
	
	public static void main(String[] args) {

		//Luodaan HelloWorld olio
		HelloWorld olio = new HelloWorld();
		
		
		//Kutsutaan olion yellToWorld metodia
		olio.yellToWorld("Arska");
		
		//Muutetaan nimi isoiksi kirjaimiksi
		// String isoNimi = olio.muutaIsoksi("Arska");
		// olio.yellToWorld(isoNimi);
	}

}
