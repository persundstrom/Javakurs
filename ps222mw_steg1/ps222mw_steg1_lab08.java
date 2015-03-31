/**
 *  ps222mw_steg1_lab08.java
 *	Räknar ut produkten av alla udda heltal mellan 1 och 15
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab08 {
	public static void main(String[] args) {
		int produkt = 1;
		for (int i = 1; i < 15; i += 2) { // kör så länge i är mindre än 15. öka
											// med 2 för varje gång.
			produkt *= (i + 2); // produkten av tidigare multiplicseras med
								// nästa udda heltal
		}
		System.out.println("Produkten av alla udda heltal mellan 1 och 15 är "
				+ produkt);
	}
}
