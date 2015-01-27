package java2;

/**
 * Kokonaislukuharjoitus
 * 
 * @author Ari Tuhkala
 *
 */
public class Kokonaislukuja {

	/**
	 * @author Marko Laitinen
	 * @param root
	 */
	public static void printIfZeroModSqrt(double root) {
		if ((Math.sqrt(root) * 10) % 10 == 0) {
			System.out.println((int) root);
		}
	}

	/**
	 * @author Ari Tuhkala
	 * @param i laskuri, mihin asti tulostetaan
	 */
	private static void tulostaPotenssit(int raja) {
		
		int nelioJuuri=0;
		while (nelioJuuri * nelioJuuri <raja) {
			System.out.println(nelioJuuri*nelioJuuri);
			nelioJuuri++;
		}

	}

	/**
	 * Pääohjelma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Tapa A

		double root;
		System.out.println("The following sqrts have no remainder:");
		for (root = 0; root <= 1000; root++)
			printIfZeroModSqrt(root);

		// Tapa B
		
		System.out.println("Arin vastaus");
		tulostaPotenssit(1000);

	}
}
