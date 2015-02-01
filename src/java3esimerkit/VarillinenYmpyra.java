package java3esimerkit;
//Attribuuttien määrittlely

//Tuodaan java.awt-pakkauksesta luokka Color käyttöön.
import java.awt.Color;

/**
 * Esimerkki attribuuttien määrittelystä.
 * @author Mika Vesterholm.
 */
public class VarillinenYmpyra {
  /**
   * Vakio OLETUSSÄDE, jonka arvoksi asetetaan 10. Oletussädettä ei voi 
   * muuttaa, koska muuttuja on lopullinen.
   */
  public static final int OLETUSSÄDE = 10;

  /** Keskipisteen x- ja y-koordinaatit. */
  private int x, y;

  /** Säde, jonka arvoksi sijoitetaan oletussäteen arvo. */
  private int säde = OLETUSSÄDE;

  /** 
   * Kuvion väri - viite Color-luokan olioon. Alustetaan viittamaan samaan      
   * olioon, johon Color-luokassa määritelty luokkakohtainen vakioarvoinen 
   * muuttuja RED viittaa. 
   */
  private Color väri = Color.RED;
}
