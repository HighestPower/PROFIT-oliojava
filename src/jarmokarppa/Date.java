package jarmokarppa;

/**
 * 
 * @author Jami
 * @version 28.1.2015
 *
 */

public class Date
{
    private int rec_day;
    private int rec_month;
    private int rec_year;

    /**
     * Olion oletusmuodostin. Asettaa paivamaaraksi aina 1.1.2015.
     */
    
    public Date()
    {
        this(1);
    }

    /**
     * Muodostin jossa paivanumero parametrina. Kuukausi ja vuosiluku ovat aina 1.2015.
     *  
     * @param day       Annettu paivanumero. Ei arvotarkastusta.
     */
    
    public Date(int day)
    {
        this(day, 1);
    }
    
    /**
     * Muodostin jossa paivanumero ja kuukausi parametrit. Vuosiluku on aina 2015.
     * 
     * @param day       Annettu paivanumero. Ei arvotarkastusta.
     * @param month     Annettu kuukausi. Ei arvotarkastusta.
     */
    
    public Date(int day, int month)
    {
        this(day, month, 2015);
    }
    
    /**
     * Muodostin jossa paivanumero- kuukausi- ja vuosilukuparametrit.
     *    
     * @param day       Annettu paivanumero. Ei arvotarkastusta.
     * @param month     Annettu kuukausi. Ei arvotarkastusta.
     * @param year      Annettu vuosiluku. Ei arvotarkastusta.
     */
    
    public Date(int day, int month, int year)
    {
        rec_day = day;
        rec_month = month;
        rec_year = year;
    }

    /**
     * Palauttaa kokonaisen paivamaaran muodossa "PP.KK.VVVV". 
     */
    
    public String toString()
    {
        return "Date: " + rec_day + "." + rec_month + "." + rec_year;
    }
    
    /**
     * Vertaa kahta irrallista paivamaaraa keskenaan.
     * 
     * @param first     Ensimmainen paivamaaraolio.
     * @param second    Toinen paivamaaraolio.
     * @return  -1 jos ensimmainen paivamaara on aiempi, 1 jos myohempi, 0 jos samat.
     */
    
    public static int compareTo(Date first, Date second)
    {
        if (first.rec_year < second.rec_year)
        {
            return -1;
        }

        if (first.rec_year > second.rec_year)
        {
            return 1;
        }
        
        if (first.rec_month < second.rec_month)
        {
            return -1;
        }

        if (first.rec_month > second.rec_month)
        {
            return 1;
        }
        
        if (first.rec_day < second.rec_day)
        {
            return -1;
        }

        if (first.rec_day > second.rec_day)
        {
            return 1;
        }
        
        return 0;
    }
    
    /**
     * Vertaa kahta paivamaaraa keskenaan. Ensimmainen paivamaara on tassa oliossa
     * ja toinen on irrallisessa.
     *  
     * @param second    Toinen paivamaaraolio jota verrataan tahan.
     * @return  -1 jos ensimmainen paivamaara on aiempi, 1 jos myohempi, 0 jos samat.
     */
    public int compareTo(Date second)
    {
        return compareTo(this, second);
    }
    
    /**
     * Paaohjelma.
     * 
     * @param args      Ei kaytossa.
     */
    
    public static void main(String[] args)
    {
        Date date1 = new Date();
        System.out.println(date1.toString());
        
        Date date2 = new Date(2);
        System.out.println(date2.toString());
        
        Date date3 = new Date(3, 2);
        System.out.println(date3.toString());
        
        Date date4 = new Date(4, 3, 2016);
        System.out.println(date4.toString());
        
        Date date5 = new Date(4, 3, 2016);
        System.out.println(date5.toString());
        
        switch (compareTo(date1, date5))
        {
            case -1: // Ensimmainen paivamaara on ajassa aiempi.
                System.out.println(date1.toString() + " < " + date5.toString());
                break;
            
            case 1: // Ensimmainen paivamaara on ajassa myohempi.
                System.out.println(date1.toString() + " > " + date5.toString());
                break;
            
            case 0: // Ensimmainen ja toinen paivamaara ovat tarkalleen samat.
            default:// Tämä ei oikeasti koskaan toteudu mutta on otettu huomioon.
                System.out.println(date1.toString() + " == " + date5.toString());
                break;
        }
        
        switch (date4.compareTo(date5))
        {
            case -1:
                System.out.println(date4.toString() + " < " + date5.toString());
                break;
            
            case 1:
                System.out.println(date4.toString() + " > " + date5.toString());
                break;
            
            case 0:
            default:
                System.out.println(date4.toString() + " == " + date5.toString());
                break;
        }
        
        switch (date3.compareTo(date2))
        {
            case -1:
                System.out.println(date3.toString() + " < " + date2.toString());
                break;
            
            case 1:
                System.out.println(date3.toString() + " > " + date2.toString());
                break;
            
            case 0:
            default:
                System.out.println(date3.toString() + " == " + date2.toString());
                break;
        }
    }
}
