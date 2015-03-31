/**
 *  ps222mw_steg1_lab05.java
 *	Räknar ut summan av tre heltal utifrån tre inmatade heltal
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

import java.util.Scanner;

public class ps222mw_steg1_lab05 {
	public static void main(String[] args) {
		int starttal, hundratal, tiotal, rest, summa;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ange ett tresiffrigt heltal: ");
		starttal = keyboard.nextInt();
		rest = starttal % 100; // dela med hundar och få resten
		hundratal = (starttal - rest) / 100; // räkna ut hur många hundra
		starttal -= (hundratal * 100); // ta bord antal hundra * 100
		rest = starttal % 10; // dela med 10 och få resten
		tiotal = (starttal - rest) / 10; // täkna ut hur antal tiotal
		summa = hundratal + tiotal + rest; // summera ihop, variablen rest
											// innehåller entalen
		System.out.println("Summan av siffrorna i heltalet är: " + summa);
		keyboard.close();
	}
}
