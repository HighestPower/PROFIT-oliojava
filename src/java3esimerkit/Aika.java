package java3esimerkit;
/**
 * Aikojen esittämiseen soveltuva luokka. Aika esitetään tunteina, 
 * minuutteina ja sekunteina. Luokka on suunniteltu arvokeskeiseksi eli
 * olion tilaa ei voi muuttaa olion luomisen jälkeen.
 * 
 * Metodien ja rakentajan parametreissa oletetaan, että parametrien arvot
 * eivät ole negatiivisia. Minuutit ja sekunnit voivat olla suurempia kuin
 * 59. Tällöin lisätään tarvittaessa tunteja ja minuutteja, jotta ajalle
 * pätee 0 &lt;= sekunnit, minuutit &lt;= 59. Esimerkiksi 
 * 
 * new Aika(0,0,120).getMinuutit() palauttaa 2.   
 * 
 * @author Mika Vesterholm
 */
public class Aika {
  private final int tunnit, minuutit, sekunnit;
  
  /**
   * Muodostaa Aika olion, joka on alustettu annetuilla tunneilla,
   * minuuteilla ja sekunneilla. Normalisoi sekunnit ja minuutit 
   * kasvattaen tarvittaessa tunteja ja minuutteja.
   * @param t tunnit, ei saa olla negatiivinen
   * @param m minuutit, ei saa olla negatiivinen
   * @param s sekunnit, ei saa olla negatiivinen
   */
  public Aika(int t, int m, int s) {
    sekunnit = s % 60;
    m = m + s / 60;
    minuutit = m % 60;
    tunnit = t + m / 60;
  }

  /**
   * Palauttaa ajan esittämät tunnit.
   * @return ajan esittämät tunnit
   */
  public int getTunnit()   { return tunnit; }

  /**
   * Palauttaa ajan esittämät minuutit.
   * @return ajan esittämät minuutit
   */
  public int getMinuutit() { return minuutit; }

  /**
   * Palauttaa ajan esittämät sekunnit.
   * @return ajan esittämät sekunnit
   */
  public int getSekunnit() { return sekunnit; }
  
  /**
   * Palauttaa ajan sekunteina.
   * @return aika sekunteina.
   */
  public long sekunteina() {
    return sekunnit + 60 * minuutit + 3600L * tunnit;
  }

  /**
   * Palauttaa ajan tunteina desimaaliosa kuvaa minuutit ja sekunnit.
   * @return aika tunteina.
   */
  public double tunteina() {
    return tunnit + (minuutit * 60 + sekunnit) / 3600.0 ;
  }
    
  /**
   * Palauttaa ajan merkkijonona muodossa tunnit:minuutit:sekunnit.
   * @return merkkijono, jonka muoto on tunnit:minuutit:sekunnit
   */
  public String toString() { 
    return "" + tunnit + ":"  + minuutit + ":" + sekunnit; 
  }
  
  /**
   * Palauttaa ajan, jossa tähän aikaan on lisätty t tuntia. Vastaa kutsua
   * lisää(t, 0, 0).
   * @see lisää(int,int,int)
   * @param t lisättävät tunnit.
   */
  public Aika lisääTunteja(final int t) { return lisää(t, 0, 0); }
  /**
   * Palauttaa ajan, jossa tähän aikaan on lisätty m minuuttia. Vastaa 
   * kutsua lisää(0, m, 0).
   * @see lisää(int,int,int)
   * @param m lisättävät minuutit.
   */
  public Aika lisääMinuutteja(final int m) { return lisää(0, m, 0); }
  /**
   * Palauttaa ajan, jossa tähän aikaan on lisätty s sekuntia. Vastaa 
   * kutsua lisää(0, 0, s).
   * @see lisää(int,int,int)
   * @param s lisättävät sekunnit.
   */
  public Aika lisääSekunteja(final int s) { return lisää(0, 0, s); }

  /**
   * Palauttaa ajan, jossa tähän aikaan on lisätty ajan a esittämä aika.
   * @param a lisättävä aika, ei saa olla null
   * @return tämän ajan ja ajan a summan.
   */
  public Aika lisää(final Aika a) {
    return lisää(a.getTunnit(), a.getMinuutit(), a.getSekunnit());
  }

  /**
   * Palauttaa Aika olion, jossa tähän aikaan on lisätty annettu määrä 
   * tunteja, minuutteja ja sekunteja. 
   * @param t lisättävät tunnit, ei saa olla negatiivinen.
   * @param m lisättävät minuutit, ei saa olla negatiivinen.
   * @param s lisättävät sekunnit, ei saa olla negatiivinen.
   * @return ajan, jossa tähän aikaan on lisätty parametrina annettu määrä
   *         tunteja, minuutteja ja sekunteja.
   */
  public Aika lisää(final int t, final int m, final int s) {
    return new Aika(tunnit + t, minuutit + m, sekunnit + s);
  }
}
