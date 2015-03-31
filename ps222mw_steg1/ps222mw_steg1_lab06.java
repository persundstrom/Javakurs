/**
 *  ps222mw_steg1_lab06.java
 *	Skriver ur alfabetet framlänges och baklänges
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab06 {

	public static void main(String[] args) {
		int cnt = 65;
		while (cnt < 91) { // kör så länge räknaren är mindre än 91
			System.out.printf("%c%c ", cnt + 32, cnt); // skriv ut räknarens
														// charvärde + 32 och
														// charvärdet
			cnt++;
		}
		System.out.println("");
		while (cnt > (65)) {
			cnt--; // minska räknaren
			System.out.printf("%c%c ", cnt + 32, cnt);
		}
	}

}
