/**
 *  ps222mw_steg2.java
 *	Programmet slumpar ett tal mellan 0 och 100. Anv�ndaren f�r sedan gissa vilket tal det �r.
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg2;

import java.util.Scanner;

public class ps222mw_steg2_lab04 {
	public static void main(String[] args) {
		SecretNumber secretNumber = new SecretNumber();
		Scanner in = new Scanner(System.in);
		System.out.println("Gissa ett tal mellan 0-100: ");
		for (int i = 0; i < SecretNumber.MAX_NUMBER_OF_GUESSES; ++i) {
			if (secretNumber.makeGuess(in.nextInt())) {
				break;
			}
		}
	}
}

class SecretNumber {
	public final static int MAX_NUMBER_OF_GUESSES = 7;
	private int secretNumber = (int) (Math.random() * 101); // skapar ett privat hemligt slumpat nummer mellan 1 och 100
	private int cnt = 7; // en r�knare som s�tts till 7

	public boolean makeGuess(int i) {
		cnt--; // minska r�knaren f�r varje gissning
		
		if (i < secretNumber) { // om det gissade talet �r mindre �n secretNumber
			System.out.println(i + " �r f�r l�gt. Du har " + cnt
					+ " gissningar kvar.");
			return false;
		} 
		else if (i > secretNumber) { // om det gissade talet �r st�rre �n
										// secretNumber
			System.out.println(i + " �r f�r h�gt. Du har " + cnt
					+ " gissningar kvar.");
			return false;
		} 
		else { // annars har man gissat r�tt :)
			cnt = MAX_NUMBER_OF_GUESSES - cnt; // r�kna ut hur m�nga gissningar man gjorde
			System.out.println("R�tt gissat. Du klarade det p� " + cnt
					+ " f�rs�k.");
			return true;
		}
	}
}