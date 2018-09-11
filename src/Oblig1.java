/*
 * Pajtim Aslani
 * s198588
 * AlgDat Oblig1 H18
 */

import java.util.*;

public class Oblig1 {
    private Oblig1() { }

    // Hjelpemetoder fra undervisningen

    private static void bytt(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void bytt(char[] a, int i, int j)
    {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void snu(char[] c, int v, int h)
    {
        while (v < h) bytt(c, v++, h--);
    }
    
    //Oppg1
    //Antall sammenligninger av tabellverdier blir n-1.
    //Det er flest ombyttinger hvis største verdi ligger først i tabellen, og
    //færrest ombyttinger hvis tabellen er sortert stigende.
    
    public static int maks( int[] a )
    {
        int n = a.length; 
	if( n < 1 )
            throw new NoSuchElementException( "Denne tabellen er tom" );

        if( n == 1 ) return a[0];
            
        for( int i = 0; i < n - 1; i++ ){
            if( a[i] > a[i+1] ){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        return a[n - 1];
    }
    
    public static int ombyttinger(int[] a)
    {
        int antall = 0;

        for (int i = 1; i < a.length; i++)
        {
            if (a[i - 1] > a[i])
            {
                bytt(a, i - 1, i);
                antall++;
            }
        }
        return antall;
    }

    //Oppg2
    //
    
    
}
