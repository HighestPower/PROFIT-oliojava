package jarmokarppa;
import fi.jyu.mit.graphics.EasyWindow;

/**
 * 
 * @author Jami
 * @version 20.1.2015
 *
 */

public class SimpleGraphics
{
    EasyWindow window;

    /**
     * Constructor.
     * @param w Handle to window where to focus operations.
     */
    
    public SimpleGraphics(EasyWindow w)
    {
        window = w;
    }
    
    /**
     * Draw a line.
     * @param start_x X-coordinate where to begin line draw.
     * @param start_y Y-coordinate.
     * @param end_x   X-coordinate where to end line draw.
     * @param end_y   Y-coordinate.
     */
    
    public void drawLine(int start_x, int start_y, int end_x, int end_y)
    {
        window.addLine(start_x, start_y, end_x, end_y);
    }

    /**
     * Draw a square.
     * @param x     X-coordinate for top left corner of square.
     * @param y     Y-coordinate.
     * @param size  Size of square in pixels.
     */
    
    public void drawSquare(int x, int y, int size)
    {
        drawLine(x, y, x + size, y);
        drawLine(x + size, y, x + size, y + size);
        drawLine(x, y + size, x + size, y + size);
        drawLine(x, y, x, y + size);
    }
}
