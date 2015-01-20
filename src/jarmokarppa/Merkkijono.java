package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 18.1.2015
 *
 */

public class Merkkijono
{
    /**
     * Promote every second character in string to upper case starting from second.
     * @param str Original string to be handled but not touched.
     * @return New and modified instance of a string.
     */
    
    public static String every2ndCharToUpper(String str)
    {
        int length = str.length();
        
        // Create a character array copy from original string
        // but convert all characters to upper case at same time.
        char charArray[] = (new String(str).toUpperCase()).toCharArray();

        for (int i = 0; i < length; i++)
        {
            // Do the job for whole string.
            
            if ((i % 2) == 0)
            {
                // Put back every other original character starting from first.
                charArray[i] = str.charAt(i);
            }
        }
        
        return new String(charArray); // Return modified string.
    }

    /**
     * 
     * @param args Not used
     */
    
    public static void main(String[] args)
    {
        String testString = "Aasin silta alla auringon maan taivaan pääkallon";
        
        System.out.println(every2ndCharToUpper(testString));
        // Expected print output "AAsIn sIlTa aLlA AuRiNgOn mAaN TaIvAaN PäÄkAlLoN".
    }
}
