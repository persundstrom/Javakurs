/**
 *  ps222mw_steg3_lab10.java
 *	Programmet �ppnar en fil med nummer och r�knar ut summa, medelv�rde och maxv�rde.
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ps222mw_steg3_lab10 {
	public static void main(String[] args){
		
		int summa = 0, avg=0, max=0, cnt=0;
		
		Scanner fil = null;
	    try {
	        fil = new Scanner(new File("src/ps222mw_steg3/heltal.txt"));  // f�rs�k �ppna filen
	    } catch (FileNotFoundException e) {
	        System.out.println("Filen finns inte");	// finns inte filen, skriv ut felmeddelande
	    }
		
		while(fil.hasNext()){		// k�r s� l�nge det finns data i filen
			String tal = fil.next();       // ta in ett ord i filen som ett tal
			summa += Integer.parseInt(tal);		// l�gg till ordet omvandlat till en integer till summan
			if(max < Integer.parseInt(tal))	max = Integer.parseInt(tal);		// om max �r mindre �n nuvarande tal, s�tt max till nya talet
			cnt++;					// r�kna tal i filen
		}
		avg = summa / cnt;		// r�kna ut medelv�rdet
		System.out.println("Summa: " + summa);		// skriv ut resultatet
		System.out.println("Medelv�rde: " + avg);
		System.out.println("Maxv�rde: " + max);
		fil.close();			// st�ng filhanteraren
	}
}
