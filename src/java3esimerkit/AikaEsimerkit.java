package java3esimerkit;
/**
 * Esimerkkejä Aika-luokan käytöstä.
 * 
 * @author mikaves
 */
public class AikaEsimerkit {
  public static void main(String[] args) {
    //Aika aika = new Aika();
    //aika.tunnit = 12; //LUVATON, attribuutti ei näy luokan ulkopuolle!
    
    Aika aika = new Aika(0,0,0);
    //Tulostaa olion toString metodin palauttaman merkkijonon.
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    aika = aika.lisääSekunteja(12);
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    aika = aika.lisääSekunteja(61);    
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    aika = aika.lisää(1,61,61);    
    System.out.println(aika);
    System.out.println(aika.sekunteina());

    System.out.println(aika.lisää(aika));
    System.out.println(aika.sekunteina());
  }
}
