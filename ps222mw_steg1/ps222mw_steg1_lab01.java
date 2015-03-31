/**
 *  ps222mw_steg1_lab01.java
 *	R�kna ut elf�rbrukningen och kostnader
 *  2014-06-13
 *  Per Sundstr�m
 */

package ps222mw_steg1;

import java.util.Scanner;

public class ps222mw_steg1_lab01 {

	public static final Integer FAST_KOSTNAD = 300; // s�tter fast kostnad som
													// en kontant integer
	public static final double RORLIG_KOSTNAD = 0.7493; // s�tter r�rlig kostnad
														// som en konstand
														// double

	public static void main(String[] args) {
		int forra, denna, forbrukning;
		double kostnad;

		Scanner keyboard = new Scanner(System.in); // skapa en
													// keyboardscannerobjekt
		System.out.println("Hur stor var elr�kningen f�rra m�naden?");
		forra = keyboard.nextInt(); // l�s in f�rra m�nadens f�rbrukning
		System.out.println("Hur stor var elr�kningen denna m�nad?");
		denna = keyboard.nextInt(); // l�s in f�rra m�nadens f�rbrukning
		forbrukning = denna - forra; // r�kna ut totalf�rbrukning denna m�nad
		kostnad = (forbrukning * RORLIG_KOSTNAD) + (FAST_KOSTNAD / 12); // r�knar
																		// ut
																		// kostnaden
																		// f�r
																		// f�rbrukad
																		// el
																		// under
																		// senaste
																		// m�naden
		System.out.println("F�rbrukning: " + forbrukning + "kWh");
		System.out.println("Kostnad: " + kostnad + "kr");
		keyboard.close();
	}

}
