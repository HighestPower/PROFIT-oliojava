package java3esimerkit;


/**
 * Esimerkki olion luomisesta, metodien kutsumisesta ja viitemuuttujien
 * k‰ytˆst‰. Ohjelman kuuluu p‰‰tty‰ virheeseen.
 * @author Mika Vesterholm
 * @version 1.0
 */

public class OlioidenLuonti {
  public static void main(String[] args) {
    Laskuri lask;
    lask = new Laskuri();
    Laskuri toinen = new Laskuri(2);

    lask.kasvata();
    lask.lis‰‰(10);
    int laskurinArvo = lask.getLukema();

    //Luvaton, koska lukema on private
    //lask.lukema = lask.lukema + 5;

    lask.kasvata();
    toinen.lis‰‰(5);
    lask.lis‰‰(toinen.getLukema());

    toinen = lask;

    toinen = null;

    //T‰st‰ tulee virhe ohjelmaa ajettaessa!
    toinen.kasvata();
  }
}