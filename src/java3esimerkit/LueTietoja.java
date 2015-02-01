package java3esimerkit;
// Käyttäjän kanssa keskusteleva ohjelma

/**
 * Esimerkki tietojen lukemisesta Lukija-luokan avulla.
 * @author Mika Vesterholm
 * @version 1.0
 */
public class LueTietoja {
  public static void main(String[] args) {
    System.out.println("Kirjoita nimesi: ");
    String nimi = Lukija.lueRivi();
    System.out.println("Kirjoita ikäsi: ");
    int ikä = Lukija.lueInt();
    System.out.println("Kirjoita pituutesi metreinä: ");
    float pituus = Lukija.lueFloat();
    System.out.println("Hei, olet " + nimi + " ja olet " + ikä
     + " vuotta vanha. Pituutesi on " + pituus + " metriä.");
  }
}
