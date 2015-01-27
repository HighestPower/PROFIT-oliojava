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
    /**
     * Piirt‰‰ lumiukon annettuun paikkaan
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
        double keskiPallonY = y + isonPallonSade + keskiPallonSade; //ratkaise t‰h‰n keskiPallonY
        double pikkuPallonY = keskiPallonY + keskiPallonSade + pikkuPallonSade; //ratkaise t‰h‰n pikkuPallonY
            
        w.addCircle(x,y,isonPallonSade); //piirt‰‰ ison pallon
        w.addCircle(x,keskiPallonY,keskiPallonSade); //piirt‰‰ keskipallon
        w.addCircle(x,pikkuPallonY,pikkuPallonSade); //piirt‰‰ pikkupallon
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
    }
}
