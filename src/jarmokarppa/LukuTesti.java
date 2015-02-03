package jarmokarppa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Jami
 * @version 3.2.2015
 *
 */

public class LukuTesti
{
    /**
     * Paaohjelma. 
     * @param args  Ei kaytossa.
     */
    
    public static void main(String[] args)
    {
        int luku;
        boolean opOk;
        Kokonaisluku kokoLuku;
        BufferedReader nappis = new BufferedReader(new InputStreamReader(System.in));
        
        do
        {
            // Pyyda kayttajalta alkuarvoa laskentarutiinille.
            // Silmukasta poistutaan kun jokin numeraalinen luku on saatu.
            
            System.out.print("Laskenta alkaa - anna luvun alkuarvo > ");

            try
            {
                kokoLuku = new Kokonaisluku(Integer.valueOf(nappis.readLine()));
                break;  // Luku kelpaa, poistu silmukasta.
            }
            catch (NumberFormatException | IOException ex)
            {
                System.out.println("Virhe - syötä vain numeroita");
            }
        }
        while (true);
        
        do
        {
            // Suoritetaan laskentaa kunnes jokin lopetusehto on tayttynyt.
            
            String syote;
            
            System.out.print("Valitse laskutoimenpide [+ - / *] ja luku (esim: * 4) > ");
            
            try
            {
                syote = nappis.readLine();
            }
            catch (NumberFormatException | IOException ex)
            {
                System.out.println("Virhe ");
                continue;
            }
                
            if (syote.isEmpty())
            {
                break;  // Tyhja syote (pelkka Enter-painallus) lopettaa laskennan.
            }
            
            if (syote.length() < 3)
            {
                System.out.println
                ("Virhe - anna laskutoimenpide, väli ja vähintään yksi numero");
                continue;
            }

            try
            {
                // Tarkasta etta luku koostuu vain numeroista.
                luku = Integer.valueOf(syote.substring(2));
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Virhe - vääriä merkkejä lukuarvossa");
                continue;
            }
            
            opOk = true;
            
            // Suorita laskutoimenpide.
            
            switch (syote.charAt(0))
            {
                case '+':
                    kokoLuku.lisaa(luku);
                    break;
                
                case 'l':
                    kokoLuku.lisaa(new Kokonaisluku(luku));
                    break;
                    
                case '-':
                    kokoLuku.vahenna(luku);
                    break;
                
                case 'v':
                    kokoLuku.vahenna(new Kokonaisluku(luku));
                    break;
                    
                case '/':
                    kokoLuku.jaa(luku);
                    break;
                
                case 'j':
                    kokoLuku.jaa(new Kokonaisluku(luku));
                    break;
                    
                case '*':
                    kokoLuku.kerro(luku);
                    break;
                
                case 'k':
                    kokoLuku.kerro(new Kokonaisluku(luku));
                    break;
                    
                default:    // Tuntematon toimenpide ei aiheuta toimenpiteita ;)
                    System.out.println("Virhe - tuntematon laskutoimenpide");
                    opOk = false;
                    break;
            }
            
            if (opOk)
            {
                // Tulosta laskennan valitulos.
                System.out.println("Luku on nyt: " + kokoLuku.palautaArvo());
            }
        }
        while (true);

        System.out.println("Laskenta on loppunut");
    }
}
