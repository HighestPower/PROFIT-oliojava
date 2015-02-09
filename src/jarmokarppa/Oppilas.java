package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 9.2.2015
 *
 */

public class Oppilas
{
    private String nimi;        // Oppilaan nimi.
    private boolean sukupuoli;  // false = poika, true = tytto.
    private Oppilas edellinen;  // Linkki edelliseen oppilaaseen.

    /**
     * Oletusmuodostin.
     */
    
    public Oppilas()
    {
        nimi = null;
        sukupuoli = false;
        edellinen = null;
    }
    
    /**
     * Muodostin parametreilla.
     *  
     * @param oNimi         Nimi.
     * @param oSukupuoli    Sukupuoli: false = poika, true = tytto. 
     * @param oEdellinen    Edellisen oppilaan vastaavat tiedot.
     */
    
    public Oppilas(String oNimi, boolean oSukupuoli, Oppilas oEdellinen)
    {
        nimi = oNimi;
        sukupuoli = oSukupuoli;
        edellinen = oEdellinen;
    }
    
    /**
     * Palauttaa oppilaan sukupuolen.
     * 
     * @return  Sukupuoli: false = poika, true = tytto. 
     */
    
    public boolean haeSukupuoli()
    {
        return sukupuoli;
    }

    /**
     * Palauttaa oppilaan nimen. Null jos ei ole annettu.
     * 
     * @return  Nimi.
     */
    
    public String haeNimi()
    {
        return nimi;
    }
    
    /**
     * Palauttaa seuraavan oppilaan tiedot.
     * 
     * @return  Olioviite seuraavaan oppilaan tietoihin. Null jos ei ole.
     */
    
    public Oppilas haeSeuraava()
    {
        return edellinen;
    }
}
