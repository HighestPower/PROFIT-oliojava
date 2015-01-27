package java2;

/**
 * Kikkaillaan Fibonaccilla ja rekursiolla
 * 
 * @author Ari Tuhkala
 *
 */
public class Fibo {

	/**
	 * Fibonacci Marko Back
	 * 
	 * @param loop
	 */
	public static void fibonacciwhile(int loop) {
		int vanhaArvo = 1;
		int edellinenVanhaArvo = 0;
		int n = 0;
		do {
			int nykyArvo = edellinenVanhaArvo;
			edellinenVanhaArvo = vanhaArvo;
			vanhaArvo = nykyArvo + edellinenVanhaArvo;
			System.out.print(nykyArvo + " ");
			n++;
		} while (n < loop);
	}

	/**
	 * Fibonaccin jono rekursion avulla
	 * @param i
	 * @return pyydetty alkio Fibonaccin jonosta
	 */

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Markon
		int lukumaara = 10;
		System.out.print("Fibonacci by Marko: ");
		fibonacciwhile(lukumaara);
		System.out.println();

		// Rekursiolla

		/**for (int i = 1; i < 10; ++i)
			System.out.println(i + ". fibo on " + fibo(i));
			**/
	}

}
