/**
 *  ps222mw_steg1_lab07.java
 *	Summerar alla j�mna heltal mellan 1 och 100
 *  2014-06-13
 *  Per Sundstr�m
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab07 {
	public static void main(String[] args) {
		int summa = 0;
		for (int i = 0; i < 101; i += 2) { // k�r s� l�nge i �r mindre �n 101.
											// �ka med 2 f�r varje g�ng.
			summa += i; // �ka summan f�r varje g�ng loopen k�rs
		}
		System.out.println("Ringen med lotter ger int�kten " + summa + " kr"); // skriv
																				// ut
																				// resultatet
	}
}
