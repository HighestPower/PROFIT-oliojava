package java2;


/**
 * Perusharjoituksia laskimen avulla
 * @author Ari Tuhkala
 *
 */
public class Laskin {
	
	/**
	 * Summaa kaksi lukua
	 * @param a ensimmäinen luku
	 * @param b toinen luku
	 * @return lukujen summa
	 */
	public int summaa (int a, int b){
		return a + b;
	}
	
	/**
	 * Nollaa taulukon alkiot
	 * 
	 * Indeksi: 0 1 2
	 * Taulu:   4 6 8
	 * 
	 * Nollauksen jälkeen
	 * Indeksi: 0 1 2
	 * Taulu:   0 0 0
	 * @param taulu taulukko, jonka alkiot nollataan
	 */
	public void nollaaTaulu (int [] taulu) {

	}
	
/**
 * Pääohjelma
 * @param args
 */
	public static void main(String[] args) {
		Laskin laskin = new Laskin();
		
		//summaa metodi
		int summa = laskin.summaa(4,6);
		System.out.println(summa);
		
		//Tyhjä taulu, jossa on 5 indeksiä	
		int [] tyhjaTaulu = new int [5];
		System.out.println("Indeksissä 0: " + tyhjaTaulu[0] + "\nIndeksissä 1: " + tyhjaTaulu[1]);
		
		//Täytetään taulun pari ekaa alkiota
		tyhjaTaulu[0] = 100;
		tyhjaTaulu[1] = 1000;
		System.out.println("Indeksissä 0: " + tyhjaTaulu[0] + "\nIndeksissä 1: " + tyhjaTaulu[1]);
		
		//Uuden taulukon alustaminen arvoilla
		int  taulu [] = {4,6};
		System.out.println(laskin.summaa(taulu[0], taulu[1]));

		//Mitä tarkoittaa käytännössä, että taulukko on olioviite? Toteuta metodi ja pohdi
		laskin.nollaaTaulu(taulu);
		System.out.println("Nollauksen jälkeen:\nIndeksissä 0: " + taulu[0] + "\nIndeksissä 1: " + taulu[1]);
		
		
		
	}

}
