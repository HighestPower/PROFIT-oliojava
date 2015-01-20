package jarmokarppa;
import java.util.Random;
import fi.jyu.mit.graphics.EasyWindow;

/**
 * 
 * @author Jami
 * @version 20.1.2015
 *
 */

public class GeneralMain
{
    /**
     * 
     * @param args Not used.
     */
    
    public static void main(String[] args)
    {
        // Instance object for printout.
        HelloWorld hell = new HelloWorld();

        // Make your point.
        hell.yellToWorld("Here's Jami!");
        
        // Make window.
        EasyWindow w = new EasyWindow(100, 100);
        
        // Set its size.
        w.setBounds(500, 100, 1000, 1000);

        // Throw squares into window.
        
        for (int c = 0; c < 150; c++)
        {
            // Initialize random number generator.
            Random rand = new Random();
            
            // Setup graphic services.
            SimpleGraphics sg = new SimpleGraphics(w);
            
            // Draw one square at random location inside of window.
            // Make sure that square will be inside of window frames.
            sg.drawSquare(rand.nextInt(850) + 50, rand.nextInt(850) + 50, 30);
        }
    }
}