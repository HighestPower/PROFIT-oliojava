package jarmokarppa;

import fi.jyu.mit.graphics.EasyWindow;

/**
 * Ohjelma piirt‰‰ viisi porrasta alkaen origosta p‰‰ttyen
 * pisteesen (5,5)
 * @author // T‰ydenn‰
 * @version // T‰ydenn‰
 */
public class Stairs {

    /**
     * Aliohjelma piirt‰‰ ikkunaan yhden nousevan portaan
     * alkaen pisteest‰ (x,y) ja p‰‰ttyen pisteeseen (x+1,y+1)
     * <pre>
     *    |-------(x+1,y+1)
     *    |
     *    |
     *    |
     *   (x,y) 
     * </pre>
     * @param window
     * @param x portaan alkupisteen x
     * @param y portaan alkupisteen y
     */
    public static void porrasYlos(EasyWindow window,double x,double y)
    {
        window.addLine(x, y, x, y + 1);
        window.addLine(x, y + 1, x + 1, y + 1);
    }
    
    /**
     * Draw one staircase step downwards.
     * <pre>
     * (x, y)
     * |
     * |
     * |
     * ------- (x + 1, y - 1)
     * </pre>
     * @param window    Handle to window object to be drawn.
     * @param x         X-coordinate where to start the step. No range check.
     * @param y         Y-coordinate, no range check.
     */
    
    public static void porrasAlas(EasyWindow window, double x, double y)
    {
        window.addLine(x, y, x, y - 1);
        window.addLine(x, y - 1, x + 1, y - 1);
    }

    /**
     * 
     * @param window    Handle to window object to be drawn.
     * @param x         X-coordinate where to begin stairs. No range check.
     * @param y         Y-coordinate, no range check.
     * @param steps     Number of steps in stairs. If zero then nothing is drawn.
     */
    
    public static void piirraPortaat(EasyWindow window, double x, double y, int steps)
    {
        int step;
        
        for (step = 0; step < steps; step++)
        {
            // Draw given amount of steps to upwards.
            porrasYlos(window, x + step, y + step);
        }

        while (steps > 1)
        {
            // Draw steps to downwards. Note that there is one step less
            // to this direction. Note also that we alter here original
            // "steps" parameter.   
            porrasAlas(window, x + step, y + steps);
            step++;
            steps--;
        }
        
        if (steps == 1)
        {
            // Draw "basement" for last step but not step for ground level. 
            window.addLine(x + step, y + steps, x + step, y + steps - 1);
        }
    }
    
    /**
     * @param args ei k‰ytˆss‰
     */
    public static void main(String[] args) {
        EasyWindow window = new EasyWindow();
        window.scale(0,0,28,20);
        // Portaat ylˆs
        porrasYlos(window,0,0);
        porrasYlos(window,1,1);
        porrasYlos(window,2,2);
        porrasYlos(window,3,3);
        porrasYlos(window,4,4);
        
        //Sitten alas
        porrasAlas(window,5,5);
        porrasAlas(window,6,4);
        porrasAlas(window,7,3);
        porrasAlas(window,8,2);
        porrasAlas(window,9,1);
        
        //Ja lopulta metodi, joka piirt‰‰ halutun m‰‰r‰n portaita alkaen tietyst‰ koordinaatista
        piirraPortaat(window, 12, 0, 7);
        // eli piirraPortaat(ikkuna johon piirret‰‰n, x-koord, y-koord, montako porrasta
        window.showWindow();
    }
}