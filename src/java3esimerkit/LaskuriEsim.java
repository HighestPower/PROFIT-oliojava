package java3esimerkit;
/**
 * 
 * @author Ari Tuhkala
 *
 */
public class LaskuriEsim {
	  /** Laskurin lukema. */
	  private int lukema = 0;

	  /** Kasvattaa laskurin arvoa yhdell‰. */
	  public void kasvata() {
	    lukema++;
	  }

	  /** Palauttaa laskurin lukeman arvon.
	   * @return lukema 
	   */
	  public int getLukema() {
	    return lukema;
	  }

	  /** Asettaa laskurin lukeman arvon.
	   * @param uusiLukema
	   */
	  public void setLukema(int uusiLukema) {
	    lukema = uusiLukema;
	  }

	  /** Lis‰‰ laskurin lukeman arvoa parametrina annetun lis‰yksen verran.
	   *@param lis‰ys 
	   */
	  public void lis‰‰(int lis‰ys) {
	    lukema = lukema + lis‰ys;
	  }

	  /**
	   * Lis‰‰ laskurin lukemaan tulon kertoja * kerrottava. Palauttaa lis‰tyn
	   * tulon.
	   * @param kertoja 
	   * @param kerrottava
	   * @return lis‰tyn arvon
	   */
	  public int lis‰‰Tulo(int kertoja, int kerrottava) {
	    int tulo = kertoja * kerrottava;
	    lukema = lukema + tulo;
	    return tulo;
	  }
	  
	  /** P‰‰ohjelma ajamista varten.
	   * 
	   * @param args
	   */
	  public static void main (String[] args) {
		  LaskuriEsim laskuri = new LaskuriEsim();
		  
		  System.out.println("Laskurin arvo on aluksi: " + laskuri.getLukema());
		  
		  //Kasvatetaan laskurin lukemaa yhdell‰
		  laskuri.kasvata();
		  
		  System.out.println("Laskurin arvo on nyt: " + laskuri.getLukema());
		  
		  //Lis‰t‰‰n laskuriin tietty lukema
		  laskuri.lis‰‰(20);
		  
		  System.out.println("Laskurin arvo on lis‰yksen j‰lkeen: " + laskuri.toString());
	  }
}
