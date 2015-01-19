package jarmokarppa;
import java.util.*;

/**
 * 
 * @author Jami
 * @version 18.1.2015
 *
 */

public class StringTokens
{
    /**
     * 
     * @param args Not used
     */
    
    public static void main(String[] args)
    {
        List<String> tokens =
        parseTokens("   Yksi kaksi  kolme       neljä!!viisi   ");
        
        System.out.println
        (tokens + " --> " + tokens.size() + " tokens/words in the string");
    }
    
    /**
     * 
     * @param str String to be parsed for separate tokens.
     * @return List of tokens. will be empty if none found.
     */
    
    public static List<String> parseTokens(String str)
    {
        String[] rawTokens;
        int rawTokenIndex = 0;
        List<String> listOfTokens = new ArrayList<String>();
        
        // Use regular expression search for words.
        // Search key condition: one or more spaces.
        rawTokens = str.split(" +");

        while (rawTokenIndex < rawTokens.length)
        {
            // The split method returns extra empty item if original
            // string begins or ends with spaces. We discard those items.
            
            if (rawTokens[rawTokenIndex].isEmpty() == false)
            {
                // This is real word token. Put it into list.
                listOfTokens.add(rawTokens[rawTokenIndex]);
            }
            
            rawTokenIndex++;
        }

        return listOfTokens;
    }
}
