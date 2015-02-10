package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 9.2.2015
 *
 */

public class Koulu
{
    private Oppilas viimeinen;
    private Oppilas ensimmainen;

    /**
     * Oletusmuodostin.
     */
    
    public Koulu()
    {
        viimeinen = null;
        ensimmainen = null;
    }
    
    /**
     * Lisataan oppilas kouluun ellei jo ole siella ennestaan.
     * 
     * @param nimi      Oppilaan nimi. Kaytetaan myos estamaan tuplakirjaus.
     * @param sukupuoli Oppilaan sukupuoli: false = poika, true = tytto.
     * @return          False = oppilas oli koulussa ennestaan, true = lisatty.
     */
    
    public boolean lisaaOppilas(String nimi, boolean sukupuoli)
    {
        boolean status = false; // Pessimismia: oleta, etta oppilas on jo koulussa. 
        
        if ((nimi.length() > 0) && etsiNimi(nimi) == false)
        {
            // Lisataan uusi oppilas kouluun.
            // Sailytetaan linkki edellisen oppilaan tietoihin.
            // Linkki on null jos tama on koulun ensimmainen oppilas.
            Oppilas uusi = new Oppilas(nimi, sukupuoli, viimeinen);
            
            // Tama uusi oppilas on nyt viimeisin listalla.
            viimeinen = uusi;
            
            if (ensimmainen == null)
            {
                // Sailytetaan myös linkki koulun ensimmaiseen oppilaaseen.
                ensimmainen = uusi;
            }
            
            status = true;
        }
        
        return status;
    }

    /**
     * Palauttaa poikien tai tyttojen lukumaaran koulussa.
     *  
     * @param sukupuoli Oppilaan sukupuoli: false = poika, true = tytto.
     * @return          Lukumaara kysyttya sukupuolta.
     */
    
    public int laskeSukupuolijakaumaKoulussa(boolean sukupuoli)
    {
        int count = 0;
        Oppilas tiedot = viimeinen;

        while (tiedot != null)
        {
            // Silmukoi kunnes kaikki oppilaat listalta on kayty lapi.
            
            if (tiedot.haeSukupuoli() == sukupuoli)
            {
                // Oppilas on kysytta sukupuolta.
                count++;
            }

            // Seuraava oppilas listalta kasittelyyn.
            tiedot = tiedot.haeSeuraava();
        }
        
        return count;
    }

    /**
     * Tulostaa stdout porttiin kaikkien oppilaiden tiedot.
     * Tulostuksen muoto on: "Oppilas: Molla Maijanen[T]"
     *                       "Oppilas: Kalle Kiitäjä[P]"
     */
    
    public void tulostaOppilasTiedot()
    {
        Oppilas tiedot = viimeinen;

        while (tiedot != null)
        {
            // Kaydaan koko oppilaslista lapi, viimeeksi lisatysta alkaen ja
            // paatyen ensimmaisena annettuun oppilaaseen.
            System.out.println("Oppilas: " + tiedot.haeNimi() +
            (tiedot.haeSukupuoli() == false ? "[P]" : "[T]"));
            
            tiedot = tiedot.haeSeuraava();
        }
        
        if (viimeinen == null)
        {
            // Erikoistilanne jossa koulu on vailla oppilaita.
            System.out.println("Koulussa ei ole lainkaan oppilaita");
        }
    }

    /**
     * Hakee oppilaslistalta annettua nimea.
     *  
     * @param nimi  Haettavan oppilaan nimi.
     * @return      False = nimea ei loydy, true = nimi on jo listalla. 
     */
    
    public boolean etsiNimi(String nimi)
    {
        boolean nimiOnJo = false;
        Oppilas tiedot = viimeinen;

        while (tiedot != null)
        {
            // Kelataan koko oppilaslista lapi. Kirjainkoko merkitykseton.
            
            if (tiedot.haeNimi().equalsIgnoreCase(nimi))
            {
                // Nimi loytyi listalta. Lopetetaan silmukka.
                tiedot = null;
                nimiOnJo = true;
            }
            else
            {
                tiedot = tiedot.haeSeuraava();
            }
        }
        
        return nimiOnJo;
    }

    /**
     * Poistaa kaikki oppilaat listalta eli koulu tyhjenee.
     * 
     * @return  Oppilaiden lukumaara ennen tyhjennysta.
     */
    
    public int tyhjennaKoulu()
    {
        // Laske oppilaiden maara nyt.
        int oppilaitaOliKoulussa =
        laskeSukupuolijakaumaKoulussa(true) +
        laskeSukupuolijakaumaKoulussa(false);
        
        // Poista kaikki oppilaat.
        // Kun uusin olioviite poistetaan, poistuu myos kaikkien muiden
        // olioiden viitteet listalla, yksi kerrallaan, automaattisesti.
        // Roskien keruuta parhaimmillaan (ei tarvitse itse ajaa listaa lapi).
        viimeinen = null;
        
        return oppilaitaOliKoulussa;
    }

    /**
     * Paaohjelma.
     * 
     * @param args  Ei kaytossa.
     */
    public static void main(String[] args)
    {
        Koulu koulu = new Koulu();
        koulu.tulostaOppilasTiedot();

        // Oppilaat koulun penkille.
        koulu.lisaaOppilas("Kalle Kiitäjä", false);
        koulu.lisaaOppilas("Molla Maijanen", true);
        koulu.lisaaOppilas("Salli Überalles", true);
        koulu.lisaaOppilas("Ramona Virtanen", true);
        koulu.lisaaOppilas("Brad Pitkänen", false);
        koulu.lisaaOppilas("Ari Sari", false);
        koulu.lisaaOppilas("Sari Ari", true);
        koulu.lisaaOppilas("Molla Maijanen", true); // <-- Sama nimi toisen kerran.
        koulu.tulostaOppilasTiedot();
        
        System.out.println("Poikia koulussa on: " + koulu.laskeSukupuolijakaumaKoulussa(false) + "kpl");
        System.out.println("Tyttöjä koulussa on: " + koulu.laskeSukupuolijakaumaKoulussa(true) + "kpl");
        
        System.out.println("Koulun kaikki " + koulu.tyhjennaKoulu() + " oppilasta saivat lähteä");
        koulu.tulostaOppilasTiedot();
        
        System.out.println("Poikia kouluun jäi: " + koulu.laskeSukupuolijakaumaKoulussa(false) + "kpl");
        System.out.println("Tyttöjä kouluun jäi: " + koulu.laskeSukupuolijakaumaKoulussa(true) + "kpl");
        
        // Uudet oppilaat koulun penkille.
        koulu.lisaaOppilas("Aku Vankka", false);
        koulu.lisaaOppilas("Mad Onna", true);
        koulu.tulostaOppilasTiedot();

        System.out.println("Poikia koulussa on: " + koulu.laskeSukupuolijakaumaKoulussa(false) + "kpl");
        System.out.println("Tyttöjä koulussa on: " + koulu.laskeSukupuolijakaumaKoulussa(true) + "kpl");
    }
}
