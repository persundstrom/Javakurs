/**
 *  ps222mw_steg3_lab10.java
 *	Programmet öppnar en fil med nummer och räknar ut summa, medelvärde och maxvärde.
 *  2014-06-19
 *  Per Sundström
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
	        fil = new Scanner(new File("src/ps222mw_steg3/heltal.txt"));  // försök öppna filen
	    } catch (FileNotFoundException e) {
	        System.out.println("Filen finns inte");	// finns inte filen, skriv ut felmeddelande
	    }
		
		while(fil.hasNext()){		// kör så länge det finns data i filen
			String tal = fil.next();       // ta in ett ord i filen som ett tal
			summa += Integer.parseInt(tal);		// lägg till ordet omvandlat till en integer till summan
			if(max < Integer.parseInt(tal))	max = Integer.parseInt(tal);		// om max är mindre än nuvarande tal, sätt max till nya talet
			cnt++;					// räkna tal i filen
		}
		avg = summa / cnt;		// räkna ut medelvärdet
		System.out.println("Summa: " + summa);		// skriv ut resultatet
		System.out.println("Medelvärde: " + avg);
		System.out.println("Maxvärde: " + max);
		fil.close();			// stäng filhanteraren
	}
}
