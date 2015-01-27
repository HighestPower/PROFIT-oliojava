package java2;

/**
 * Luodaan luokka, joka tekee sanoille temppuja
 * 
 * @author Ari Tuhkala
 *
 */
public class Sanakone {

	/**
	 * Muutetaan merkkijonotaulukon avulla joka toinen kirjain isoksi
	 * 1) Muuta ensin merkkijono merkkijonotaulukoksi (tutki Java API String)
	 * 
	 * 
	 * @param sana
	 * @return
	 */
	private String jokaToinenIsona(String sana) {

		// Otetaan talteen sanan pituus
		int sananPituus = sana.length();

		// Luodaan uusi kirjaintaulu, joka on saman pituinen kuin alkuper‰inen
		// merkkijono
		char[] kirjainTaulu = new char[sananPituus];
		// Alustetaan yksi kirjainmuuttuja isoksi muuttamista varten
		char kirjain;

		// Alustetaan laskuri
		int i = 0;

		// K‰yd‰‰n sana l‰pi ja muutetaan joka toinen kirjain isoksi ja lis‰t‰‰n
		// samalla kirjaimet taulukkoon
		while (i < sananPituus) {

			
			// Jos sanan indeksi on parillinen, niin muutetaan kirjain isoksi ja lis‰t‰‰n tauluun
				// if () ...
				// TODOO
			
			// Muuten lis‰t‰‰n kirjain tauluun
				//else
				//TODOO

			// Kasvatetaan laskuria
			i++;
		}

		// Muutetaan kirjaintaulu merkkijono-olioksi ja palautetaan
		return new String(kirjainTaulu);
	}

	/**
	 * Markon ratkaisu sovellettuna
	 * Teht‰v‰: toteuta metodi StringBuilderin avulla
	 * 
	 * @author Marko Back
	 * @param merkkijono
	 * @return merkkijono, jossa joka toinen isona
	 */
	public String jokaToisenIsonaPaluu(String merkkijono) {
		StringBuilder jokatoinen = new StringBuilder("");
		
		//TODOOO
		
		return jokatoinen.toString();
	}

	/**
	 * Naapurinpojan koodailut. Mik‰ t‰ss‰ m‰tt‰‰?
	 * 
	 * @param sana
	 * @return
	 */
	private String huonoTapa(String sana) {
		int i = 0;
		String uusiJono = "";
		while (i < sana.length()) {
			uusiJono = uusiJono + sana.charAt(i);
			i++;
		}
		return uusiJono;

	}

	/**
	 * Sanakoneen k‰ynnistysmetodi
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Sanakone sanakone = new Sanakone();
		String sana = "Aasin silta alla auringon maan taivaan p‰‰kallon";
		System.out.println("Alkuper‰inen sana: " + sana);

		String huonoSana = sanakone.huonoTapa(sana);
		System.out.println("Naapurinpojan ratkaisu: " + huonoSana);
		
		String uusisana = sanakone.jokaToinenIsona(sana);
		System.out.println("Joka toinen kirjain isona: " + uusisana);

		// Markon ratkaisu StringBuilderin avulla

		String aasiMerkkijono = "Aasin silta alla auringon maan taivaan p‰‰kallon";
		String tulosMerkkijono = sanakone.jokaToisenIsonaPaluu(aasiMerkkijono);
		System.out.println("Markon ratkaisu: " + tulosMerkkijono);
		

	}

}
