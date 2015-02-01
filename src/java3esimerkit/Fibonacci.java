/**
 * Malliratkaisu teht‰v‰‰n 9.7.
 * 
 * @author Mika Vesterholm
 */
public class Fibonacci {

  public static void main(String[] args) {
    final int TOISTOJA = 48;
    long alku, loppu;
    
    System.out.println("Rekursiivinen tapa" );
    alku = System.currentTimeMillis();
    for (int i=0; i<TOISTOJA; i++) {
      System.out.println( i + ". " + fibo(i) );
    }
    loppu = System.currentTimeMillis();
    System.out.println("Aikaa kului " + (loppu-alku) + " ms." );

    System.out.println("Iteroiva tapa" );
    alku = System.currentTimeMillis();
    for (int i=0; i<TOISTOJA; i++) {
      System.out.println( i + ". " + fibonacci(i) );
    }
    loppu = System.currentTimeMillis();
    System.out.println("Aikaa kului " + (loppu-alku) + " ms." );
  }
  
  /**
   * Rekursiivinen ratkaisu on yksikertainen, mutta tehoton. Algoritmi ratkoo saman
   * ongelman moneen kertaan, kuten seuraavasta k‰y ilmi:
   * <pre>
   *                                   fibo(50)
   *                 fibo(48)              +               fibo(49)
   *      fibo(46)     +      fibo(47)            fibo(47)     +      fibo(48)
   * fibo(44) + fibo(45) fibo(45) + fibo(46) fibo(45) + fibo(46) fibo(46) + fibo(47)
   * 
   * </pre>
   **/ 
  public static long fibo(int n) {
    if ( n <= 1 ) return 1;
    return fibo(n-2) + fibo(n-1);
  }
  
  /**
   * Iteratiivinen ratkaisu ei ole yht‰ selv‰, mutta se on tehokas. Metodi laskee
   * luvun F(50) silm‰nr‰p‰yksess‰, kun rekursiivisen metodin suorituksen aikana 
   * ehtii hyvin juoda kahvit. 
   * @param n
   * @return
   */
  public static long fibonacci(int n) {
    if ( n <= 1 ) return 1;
    long a = 1, b = 1;
    long fibo = b;
    for(int i=1; i<n; i++) {
      fibo = a + b;
      a = b;
      b = fibo;
    }
    return fibo;
  }
  
}
