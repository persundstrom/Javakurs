/**
 *  ps222mw_steg1_lab08.java
 *	R�knar ut produkten av alla udda heltal mellan 1 och 15
 *  2014-06-13
 *  Per Sundstr�m
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab08 {
	public static void main(String[] args) {
		int produkt = 1;
		for (int i = 1; i < 15; i += 2) { // k�r s� l�nge i �r mindre �n 15. �ka
											// med 2 f�r varje g�ng.
			produkt *= (i + 2); // produkten av tidigare multiplicseras med
								// n�sta udda heltal
		}
		System.out.println("Produkten av alla udda heltal mellan 1 och 15 �r "
				+ produkt);
	}
}
