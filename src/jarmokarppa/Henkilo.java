package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 28.1.2015
 *
 */

public class Henkilo
{
    private String etuNimi;
    private String sukuNimi;
    private int syntymavuosi;

    /**
     * Olion muodostin jossa etunimi, sukunimi ja syntymavuosi parametrit.
     * 
     * @param eNimi     Henkilon etunimi.
     * @param sNimi     Henkilon sukunimi.
     * @param sVuosi    Henkilon syntymavuosi. Ei tarkastusta.
     */
    
    public Henkilo(String eNimi, String sNimi, int sVuosi)
    {
        etuNimi = eNimi;
        sukuNimi = sNimi;
        syntymavuosi = sVuosi; 
    }

    /**
     * Tekee merkkijonon etu- ja sukunimesta.
     *  
     * @return          Henkilon etu- ja sukunimi valilyonnilla erotettuna.
     */
    
    public String getNimi()
    {
        return getNimi(" ");
    }
    
    /**
     * Tekee merkkijonon etu- ja sukunimesta. Haluttu lause/merkki nimien erottimena.
     * 
     * @param separator Etu- ja sukunimen erotinlause tai -merkki.
     * @return          Henkilon etu- ja sukunimi erotinlauseella erotettuna.
     */
    
    public String getNimi(String separator)
    {
        return etuNimi + separator + sukuNimi;
    }
    
    /**
     * Palauttaa syntymavuoden.
     * 
     * @return          Henkilon syntymavuosi.
     */
    
    public int getSyntymavuosi()
    {
        return syntymavuosi;
    }

    /**
     * Tekee merkkijonon henkilon tiedoista.
     * Syntyva formaatti on "Etunimi|Sukunimi|Syntymavuosi".
     * 
     */
    
    public String toString()
    {
        return getNimi("|") + "|" + getSyntymavuosi();
    }
    
    /**
     * Paaohjelma.
     * 
     * @param args      Ei kaytossa.
     */
    
    public static void main(String[] args)
    {
        Henkilo aku = new Henkilo("Aku", "Ankka", 1934);
        
        System.out.println(aku.getNimi());  // tulostaa Aku Ankka
        System.out.println(aku.getSyntymavuosi());  // tulostaa 1934
        System.out.println(aku.toString()); // tulostaa Aku|Ankka|1934
    }
}
