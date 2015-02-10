package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 10.2.2015
 *
 */

public class Piste
{
    private double x;
    private double y;

    /**
     * Oletusmuodostin, koordinaatit nollataan.
     */
    
    public Piste()
    {
        x = 0;
        y = 0;
    }
    
    /**
     * Muodostin parametreilla.
     * 
     * @param valueX    X-koordinaatin uusi arvo. Ei arvotarkastusta. 
     * @param valueY    Y-koordinaatin uusi arvo. Ei arvotarkastusta.
     */
    
    public Piste(double valueX, double valueY)
    {
        x = valueX;
        y = valueY;
    }

    /**
     * Asettaa X-koordinaatille uuden arvon.
     * 
     * @param valueX    X-koordinaatin uusi arvo. Ei arvotarkastusta.
     */
    
    public void setX(double valueX)
    {
        x = valueX;
    }
    
    /**
     * Asettaa Y-koordinaatille uuden arvon.
     * 
     * @param valueY    Y-koordinaatin uusi arvo. Ei arvotarkastusta.
     */
    
    public void setY(double valueY)
    {
        y = valueY;
    }

    /**
     * Summaa X-koordinaattiin annetun arvon.
     * 
     * @param value     Arvo joka lis‰t‰‰n X-koordinaatin nykyiseen arvoon. Ei arvotarkastusta.
     */
    
    public void addToX(double value)
    {
        x += value;
    }
    
    /**
     * Summaa Y-koordinaattiin annetun arvon.
     * 
     * @param value     Arvo joka lis‰t‰‰n Y-koordinaatin nykyiseen arvoon. Ei arvotarkastusta.
     */
    
    public void addToY(double value)
    {
        y += value;
    }
    
    /**
     * Palauttaa X-koordinaatin nykyisen arvon.
     * 
     * @return  X-koordinaatin nykyinen arvo.
     */
    
    public double getX()
    {
        return x;
    }
    
    /**
     * Palauttaa Y-koordinaatin nykyisen arvon.
     * 
     * @return  Y-koordinaatin nykyinen arvo.
     */
    
    public double getY()
    {
        return y;
    }
}
