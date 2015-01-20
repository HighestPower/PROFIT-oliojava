package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 20.1.2015
 *
 */

public class SqrIntegers
{
    /**
     * 
     * @param args Not used.
     */
    
	public static void main(String[] args)
	{
		for (int value = 0; value <= 1000; value++)
		{
		    // Take square root of the value.
		    
			if ((Math.sqrt(value) % 1) == 0.0)
			{
			    // Printout the value if it's integer.
			    System.out.println("Luku: " + value);
            }
		}
	}
}
