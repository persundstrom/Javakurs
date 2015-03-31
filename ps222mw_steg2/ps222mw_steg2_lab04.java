/**
 *  ps222mw_steg2.java
 *	Programmet slumpar ett tal mellan 0 och 100. Användaren får sedan gissa vilket tal det är.
 *  2014-06-19
 *  Per Sundström
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
	private int cnt = 7; // en räknare som sätts till 7

	public boolean makeGuess(int i) {
		cnt--; // minska räknaren för varje gissning
		
		if (i < secretNumber) { // om det gissade talet är mindre än secretNumber
			System.out.println(i + " är för lågt. Du har " + cnt
					+ " gissningar kvar.");
			return false;
		} 
		else if (i > secretNumber) { // om det gissade talet är större än
										// secretNumber
			System.out.println(i + " är för högt. Du har " + cnt
					+ " gissningar kvar.");
			return false;
		} 
		else { // annars har man gissat rätt :)
			cnt = MAX_NUMBER_OF_GUESSES - cnt; // räkna ut hur många gissningar man gjorde
			System.out.println("Rätt gissat. Du klarade det på " + cnt
					+ " försök.");
			return true;
		}
	}
}