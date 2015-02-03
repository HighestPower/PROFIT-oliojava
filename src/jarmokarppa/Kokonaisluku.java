package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 3.2.2015
 *
 */

public class Kokonaisluku
{
    private int arvo;

    /**
     * Oletusmuodostin. Sisainen lukuarvo nollataan.
     */
    
    public Kokonaisluku()
    {
        arvo = 0;
    }
    
    /**
     * Muodostin jossa annetaan sisaisen luvun uusi alkuarvo.
     * 
     * @param uusiArvo  Alkuarvo.
     */
    
    public Kokonaisluku(int uusiArvo)
    {
        arvo = uusiArvo;
    }
    
    /**
     * Yhteenlasku.
     *  
     * @param uusiArvo  Lukuarvo joka summataan sisaiseen lukuun.
     */
    
    public void lisaa(int uusiArvo)
    {
        arvo += uusiArvo;
    }
    
    /**
     * Kuormitettu yhteenlasku.
     * 
     * @param uusiArvo  Summattava lukuarvo oliona.
     */
    
    public void lisaa(Kokonaisluku uusiArvo)
    {
        arvo += uusiArvo.palautaArvo();
    }
    
    /**
     * Vahennyslasku.
     * 
     * @param uusiArvo  Lukuarvo joka vahennetaan sisaisesta luvusta.
     */
    
    public void vahenna(int uusiArvo)
    {
        arvo -= uusiArvo;
    }

    /**
     * Kuormitettu vahennyslasku.
     * 
     * @param uusiArvo  Vahannettava lukuarvo oliona.
     */
    
    public void vahenna(Kokonaisluku uusiArvo)
    {
        arvo -= uusiArvo.palautaArvo();
    }

    /**
     * Jakolasku.
     * 
     * @param uusiArvo  Lukuarvo jolla jaetaan sisainen luku.
     */
    
    public void jaa(int uusiArvo)
    {
        arvo /= uusiArvo;
    }
    
    /**
     * Kuormitettu jakolasku.
     * 
     * @param uusiArvo  Jakaja oliona.
     */
    
    public void jaa(Kokonaisluku uusiArvo)
    {
        arvo /= uusiArvo.palautaArvo();
    }

    /**
     * Kertolasku.
     *  
     * @param uusiArvo  Lukuarvo jolla kerrotaan sisainen luku.
     */
    
    public void kerro(int uusiArvo)
    {
        arvo *= uusiArvo;
    }
    
    /**
     * Kuormitettu kertolasku.
     * 
     * @param uusiArvo  Kertoja oliona.
     */
    
    public void kerro(Kokonaisluku uusiArvo)
    {
        arvo *= uusiArvo.palautaArvo();
    }

    /**
     * Palauttaa tamanhetkisen sisaisen lukuarvon.
     * 
     * @return  Sisainen lukuarvo.
     */
    
    public int palautaArvo()
    {
        return arvo;
    }
}
