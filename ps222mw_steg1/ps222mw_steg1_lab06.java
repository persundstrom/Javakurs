/**
 *  ps222mw_steg1_lab06.java
 *	Skriver ur alfabetet framl�nges och bakl�nges
 *  2014-06-13
 *  Per Sundstr�m
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab06 {

	public static void main(String[] args) {
		int cnt = 65;
		while (cnt < 91) { // k�r s� l�nge r�knaren �r mindre �n 91
			System.out.printf("%c%c ", cnt + 32, cnt); // skriv ut r�knarens
														// charv�rde + 32 och
														// charv�rdet
			cnt++;
		}
		System.out.println("");
		while (cnt > (65)) {
			cnt--; // minska r�knaren
			System.out.printf("%c%c ", cnt + 32, cnt);
		}
	}

}
