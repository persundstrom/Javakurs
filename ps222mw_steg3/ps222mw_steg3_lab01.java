/**
 *  ps222mw_steg3_lab01.java
 *	Programmet skapar en array och skriver ut den två gånger. Andra gången är arrayen manipulerad.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg3;

public class ps222mw_steg3_lab01 {
	public static void main(String[] args) {
		int[] heltal = {10,23,5,1,15};		//skapa ny array och lägg in värden
		int i;
		for (i = 0; i < heltal.length; i++) 		// loop som skriver ut en array
			 System.out.print(heltal[i] + " ");	
		System.out.println();		// byt rad i konsolen 
		heltal[1]*=2;		// multiplicera andra positionen med 2
		heltal[4]*=2;		// multiplicera sista positionen med 2
		for (i = 0; i < heltal.length; i++) 
			 System.out.print(heltal[i] + " ");
					
	}
	
}
