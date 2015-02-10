package jarmokarppa;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * 
 * @author Jami
 * @version 27.1.2015
 *
 */

public class Lumiukko
{
    private double sade;
    private EasyWindow window;
    
    /**
     * Oletusmuodostin.
     */
    
    public Lumiukko()
    {
        sade = 0;
        window = null;
    }
    
    /**
     * Piirt‰‰ lumiukon annettuun paikkaan.
     * 
     * @param w
     * @param x
     * @param y
     * @param isonPallonSade
     * @param keskiPallonSade
     * @param pikkuPallonSade
     */
    
    public void piirraLumiukko(EasyWindow w, double x, double y, double isonPallonSade, double keskiPallonSade, double pikkuPallonSade)
    {
        if (window == null)
        {
            // Testitarkoitus. T‰m‰ on ensimm‰inen ukko joka piirret‰‰n.
            window = w;
        }
        
        if (w == window)
        {
            // Ukot jotka piirret‰‰n t‰h‰n ikkunaan, piirret‰‰n vanhalla tyylill‰.
            
            double keskiPallonY = y + isonPallonSade + keskiPallonSade; //ratkaise t‰h‰n keskiPallonY
            double pikkuPallonY = keskiPallonY + keskiPallonSade + pikkuPallonSade; //ratkaise t‰h‰n pikkuPallonY
            
            w.addCircle(x,y,isonPallonSade); //piirt‰‰ ison pallon
            w.addCircle(x,keskiPallonY,keskiPallonSade); //piirt‰‰ keskipallon
            w.addCircle(x,pikkuPallonY,pikkuPallonSade); //piirt‰‰ pikkupallon
        }
        else
        {
            // Uusi tapa piirt‰‰ ukkoja, toiseen ikkunaan.
            
            Piste paikka = new Piste(x, y);
            piirraPallo(w, paikka, isonPallonSade);
            piirraPallo(w, paikka, keskiPallonSade);
            piirraPallo(w, paikka, pikkuPallonSade);
            piirraPallo(w, paikka);
        }
    }

    /**
     * Piirt‰‰ yhden pallon ja p‰ivitt‰‰ keskipisteen paikan.
     * 
     * @param w             Ikkuna johon piirret‰‰n.
     * @param keskipiste    Alempana olevan pallon yl‰reunan koordinaatit, p‰ivittyy.
     * @param pallonSade    Pallon s‰de joka m‰‰r‰‰ pallon koon.
     */
    
    public void piirraPallo(EasyWindow w, Piste keskipiste, double pallonSade)
    {
        // Pallon keskipiste on s‰teen verran edellisen pallon yl‰reunasta.
        keskipiste.addToY(pallonSade);
        w.addCircle(keskipiste.getX(), keskipiste.getY(), pallonSade);
        
        // T‰m‰n pallon yl‰reuna lasketaan valmiiksi seuraavaa palloa varten.
        keskipiste.addToY(pallonSade);
        
        // Jemmaa s‰de mahdollista myˆhemp‰‰ k‰yttˆ‰ varten.
        sade = pallonSade;
    }

    /**
     * Piirt‰‰ yhden pallon ja p‰ivitt‰‰ keskipisteen paikan.
     * Pallon koko on sama kuin viimeeksi uudella tapaa piirretyll‰ pallolla.
     * 
     * @param w             Ikkuna johon piirret‰‰n.
     * @param keskipiste    Alempana olevan pallon yl‰reunan koordinaatit, p‰ivittyy.
     */
    
    public void piirraPallo(EasyWindow w, Piste keskipiste)
    {
        piirraPallo(w, keskipiste, sade);
    }
    
    /**
     * Piirt‰‰ standardikokoisen lumiukon.
     *  
     * @param w
     * @param x
     * @param y
     */
    
    public void piirraLumiukko(EasyWindow w, double x, double y)
    {
        piirraLumiukko(w, x, y, 60);
    }
    
    /**
     * Piirt‰‰ lumiukon jonka ison pallon koko on haluttu.
     *  
     * @param w
     * @param x
     * @param y
     * @param isonPallonSade
     */
    
    public void piirraLumiukko(EasyWindow w, double x, double y, double isonPallonSade)
    {
        piirraLumiukko(w, x, y, isonPallonSade, 40);
    }
    
    /**
     * Piirt‰‰ lumiukon jonka ison- ja keskimm‰isen pallon koko on haluttu.
     *  
     * @param w
     * @param x
     * @param y
     * @param isonPallonSade
     * @param keskiPallonSade
     */
    
    public void piirraLumiukko(EasyWindow w, double x, double y, double isonPallonSade, double keskiPallonSade)
    {
        piirraLumiukko(w, x, y, isonPallonSade, keskiPallonSade, 20);
    }

    /**
     * P‰‰ohjelma.
     *  
     * @param args
     */
    
    public static void main(String[] args)
    {
        //Luodaan uusi ikkuna
        EasyWindow window = new EasyWindow();
        
        window.scale(0, 0, 1000, 1000);
        window.setTitle("Tavallisia lumiukkoja");
        
        //Luodaan lumiukko-olio
        Lumiukko lumiukko = new Lumiukko ();
        
        // Piirret‰‰n lumiukko (ikkuna, johon piirret‰‰n,x,y,alimman pallon s‰de, keskipallon s‰de, ylimm‰n pallon s‰de)
        lumiukko.piirraLumiukko(window,100,100,30,20,10);

        lumiukko.piirraLumiukko(window, 230, 130); // piirt‰‰ standardikokoisen lumiukon
        lumiukko.piirraLumiukko(window, 410, 150, 80);
        lumiukko.piirraLumiukko(window, 610, 150, 80, 60); 
        lumiukko.piirraLumiukko(window, 810, 150, 80, 60, 40);
        
        // N‰ytet‰‰n ikkuna
        window.showWindow();

        
        // Koek‰ytet‰‰n uusi nelj‰ palloisen lumiukon rakentelutapa.
        // Tehd‰‰n ukot ihan omaan ikkunaan testitarkoituksessa.
        EasyWindow window2 = new EasyWindow();
        
        window2.scale(0, 0, 1000, 1000);
        window2.setLocation(600, 0);
        window2.setTitle("Nykyaikaisia neli-palloisia lumiukkoja Piste-luokan avulla");
        
        // Piirret‰‰n lumiukko.
        lumiukko.piirraLumiukko(window2, 100, 70, 30, 20, 10);

        lumiukko.piirraLumiukko(window2, 230, 70);
        lumiukko.piirraLumiukko(window2, 410, 70, 80);
        lumiukko.piirraLumiukko(window2, 610, 70, 80, 60); 
        lumiukko.piirraLumiukko(window2, 810, 70, 80, 60, 40);
        
        // N‰ytet‰‰n ikkuna
        window2.showWindow();
        
    }
}
