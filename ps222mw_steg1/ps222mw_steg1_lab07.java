/**
 *  ps222mw_steg1_lab07.java
 *	Summerar alla jämna heltal mellan 1 och 100
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab07 {
	public static void main(String[] args) {
		int summa = 0;
		for (int i = 0; i < 101; i += 2) { // kör så länge i är mindre än 101.
											// öka med 2 för varje gång.
			summa += i; // öka summan för varje gång loopen körs
		}
		System.out.println("Ringen med lotter ger intäkten " + summa + " kr"); // skriv
																				// ut
																				// resultatet
	}
}
