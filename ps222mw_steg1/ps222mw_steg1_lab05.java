/**
 *  ps222mw_steg1_lab05.java
 *	R�knar ut summan av tre heltal utifr�n tre inmatade heltal
 *  2014-06-13
 *  Per Sundstr�m
 */

package ps222mw_steg1;

import java.util.Scanner;

public class ps222mw_steg1_lab05 {
	public static void main(String[] args) {
		int starttal, hundratal, tiotal, rest, summa;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ange ett tresiffrigt heltal: ");
		starttal = keyboard.nextInt();
		rest = starttal % 100; // dela med hundar och f� resten
		hundratal = (starttal - rest) / 100; // r�kna ut hur m�nga hundra
		starttal -= (hundratal * 100); // ta bord antal hundra * 100
		rest = starttal % 10; // dela med 10 och f� resten
		tiotal = (starttal - rest) / 10; // t�kna ut hur antal tiotal
		summa = hundratal + tiotal + rest; // summera ihop, variablen rest
											// inneh�ller entalen
		System.out.println("Summan av siffrorna i heltalet �r: " + summa);
		keyboard.close();
	}
}
