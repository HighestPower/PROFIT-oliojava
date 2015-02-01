package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 1.2.2015
 *
 */

public class LinjaAuto
{
    private int kapasiteettiVirhe;
    private final int istuimienLukumaara;
    private int vapaidenIstuimienLukumaara;

    /**
     * Oletusmuodostin.
     */
    
    public LinjaAuto()
    {
        kapasiteettiVirhe = 0;
        istuimienLukumaara = 60;
        vapaidenIstuimienLukumaara = istuimienLukumaara;
    }
    
    /**
     * Matkustajien laskeminen pois linja-autosta.
     * 
     * @param matkustajienLukumaara Autosta poistuvien matkustajien lukumäärä.
     */
    
    public void vahenna(int matkustajienLukumaara)
    {
        int tyhjiaIstuimia = vapaidenIstuimienLukumaara + matkustajienLukumaara;
        
        if (tyhjiaIstuimia <= istuimienLukumaara)
        {
            // Henkilöitä poistunut autosta. Tyhjiä istuimia on lisää.
            vapaidenIstuimienLukumaara = tyhjiaIstuimia;
        }
        else
        {
            // Täysin mahdoton tapahtuma. Henkilöitä on poistunut enemmän
            // kuin autoon on kyytiin otettu.
            vapaidenIstuimienLukumaara = istuimienLukumaara;
        }

        kapasiteettiVirhe = 0;
    }
    
    /**
     * Uusien matkustajien kyytiin otto.
     *  
     * @param matkustajienLukumaara     Autoon nousevien matkustajien lukumäärä.
     * @return  Nolla jos matkustajat mahtuivat autoon. Miinusarvo kertoo
     * pysäkille jätettyjen matkustajien lukumäärän.
     *                                  
     */
    
    public int lisaa(int matkustajienLukumaara)
    {
        int tyhjiaIstuimia = vapaidenIstuimienLukumaara - matkustajienLukumaara;
        
        if (vapaidenIstuimienLukumaara - matkustajienLukumaara >= 0)
        {
            // Lisää matkustajia on otettu kyytiin. Tyhjiä istuimia on vähemmän.
            kapasiteettiVirhe = 0;
            vapaidenIstuimienLukumaara = tyhjiaIstuimia;
        }
        else
        {
            // Linja-auto on tullut täyteen. Yhtään tyhjää istuinta ei ole enää
            // vapaana. Osa kyytiin pyrkijöistä jouduttiin jättämään pysäkille.
            vapaidenIstuimienLukumaara = 0;
            kapasiteettiVirhe = tyhjiaIstuimia;
        }
        
        return tyhjiaIstuimia;
    }
    
    /**
     * Palauttaa maksimi henkilömäärän jonka linja-auto voi kuljettaa.
     * 
     * @return  Linja-auton maksimi kuljetuskapasitetti, henkilömäärällä mitattuna.
     */
    
    public int getIstuimienLukumaara()
    {
        return istuimienLukumaara;
    }
    
    /**
     * Palauttaa henkilömäärän joka mahtuu vielä linja-autoon.
     *  
     * @return  Henkilömäärä jonka linja-auto voi vielä ottaa kyytiin.
     */
    
    public int getVapaidenIstuimienLukumaara()
    {
        return vapaidenIstuimienLukumaara;
    }
    
    /**
     * Tulostaa tärkeimmät tiedot.
     */
    
    public void tulosta()
    {
        int istuimia = getIstuimienLukumaara();
        int vapaana = getVapaidenIstuimienLukumaara();
        
        System.out.println("Paikkatilanne: " + vapaana + " vapaana / " +
        (istuimia - vapaana) + " varattuna" +
        (kapasiteettiVirhe < 0 ? " / Pysäkille piti jättää " + -kapasiteettiVirhe : ""));
    }
    
    /**
     * Pääohjelma.
     * 
     * @param args  Ei käytössä.
     */
    
    public static void main(String[] args)
    {
        LinjaAuto auto = new LinjaAuto();
        auto.tulosta();

        auto.lisaa(3);
        auto.tulosta();
        
        auto.lisaa(1);
        auto.tulosta();
        
        auto.lisaa(8);
        auto.tulosta();

        auto.lisaa(55);
        auto.tulosta();

        auto.vahenna(3);
        auto.tulosta();

        auto.vahenna(6);
        auto.tulosta();

        auto.vahenna(20);
        auto.tulosta();

        auto.vahenna(30);
        auto.tulosta();

        auto.vahenna(2);
        auto.tulosta();
    }
}
