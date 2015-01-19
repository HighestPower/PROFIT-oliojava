package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 19.1.2015
 *
 */

public class Fibonacci
{
    /**
     * 
     * @param args Not used
     */
    
    public static void main(String[] args)
    {
        printoutFibonacciWithFor(1);

        printoutFibonacciWithWhile(4);
    }

    /**
     * Printout Fibonacci number sequence.
     * 
     * Expected output will be something like this.
     * FiboF: 0
     * FiboF: 1
     * FiboF: 1
     * FiboF: 2
     * FiboF: 3
     * FiboF: 5
     * FiboF: 8
     * FiboF: 13
     * FiboF: 21
     * FiboF: 34
     * FiboF: 55
     * FiboF: 89
     * 
     * @param numberOfDigits Restrict sequence length to be printout.
     * If zero then nothing is printout.
     */
    
    private static void printoutFibonacciWithFor(int numberOfDigits)
    {
        String printout;
        long number_1 = 0;
        long number_2 = 0;
        long fibonacci = 0;
        
        for (int digitCount = 0; digitCount <= numberOfDigits; )
        {
            // Calculate Fibonacci number and convert result to string expression.
            fibonacci = number_1 + number_2;
            printout = String.valueOf(fibonacci);
            
            digitCount = printout.length();
            
            if (digitCount <= numberOfDigits)
            {
                // Value is short enough to be printout.
                System.out.println("FiboF: " + printout);
            }
            
            if (number_2 >= 1)
            {
                // With this case all the rest of Fibonacci numbers are printout.
                number_1 = number_2;
                number_2 = fibonacci;
            }
            else if (number_1 == 0)
            {
                // Very first Fibonacci number the '0' is printout
                // when this loop is executed first time. Now we make
                // sure that second number the '1' will be printout correctly.
                // This case is not called again during loop execution.
                number_1 = 1;
            }
            else
            {
                // Third number, i.e. second '1' will be printout next.
                // This case is not called again during loop execution.
                number_1 = 0;
                number_2 = 1;
            }
        }
        
        return;
    }

    /**
     * 
     * @param numberOfDigits Restrict sequence length to be printout.
     * If zero then nothing is printout.
     */
    
    private static void printoutFibonacciWithWhile(int numberOfDigits)
    {
        String printout;
        long number_1 = 0;
        long number_2 = 0;
        long fibonacci = 0;
        int digitCount = 0;
        
        while (digitCount <= numberOfDigits)
        {
            // Calculate Fibonacci number and convert result to string expression.
            fibonacci = number_1 + number_2;
            printout = String.valueOf(fibonacci);
            
            digitCount = printout.length();
            
            if (digitCount <= numberOfDigits)
            {
                // Value is short enough to be printout.
                System.out.println("FiboW: " + printout);
            }
            
            if (number_2 >= 1)
            {
                // With this case all the rest of Fibonacci numbers are printout.
                number_1 = number_2;
                number_2 = fibonacci;
            }
            else if (number_1 == 0)
            {
                // Very first Fibonacci number the '0' is printout
                // when this loop is executed first time. Now we make
                // sure that second number the '1' will be printout correctly.
                // This case is not called again during loop execution.
                number_1 = 1;
            }
            else
            {
                // Third number, i.e. second '1' will be printout next.
                // This case is not called again during loop execution.
                number_1 = 0;
                number_2 = 1;
            }
        }
        
        return;
    }
}
