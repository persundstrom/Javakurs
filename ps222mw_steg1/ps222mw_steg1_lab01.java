/**
 *  ps222mw_steg1_lab01.java
 *	Räkna ut elförbrukningen och kostnader
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

import java.util.Scanner;

public class ps222mw_steg1_lab01 {

	public static final Integer FAST_KOSTNAD = 300; // sätter fast kostnad som
													// en kontant integer
	public static final double RORLIG_KOSTNAD = 0.7493; // sätter rörlig kostnad
														// som en konstand
														// double

	public static void main(String[] args) {
		int forra, denna, forbrukning;
		double kostnad;

		Scanner keyboard = new Scanner(System.in); // skapa en
													// keyboardscannerobjekt
		System.out.println("Hur stor var elräkningen förra månaden?");
		forra = keyboard.nextInt(); // läs in förra månadens förbrukning
		System.out.println("Hur stor var elräkningen denna månad?");
		denna = keyboard.nextInt(); // läs in förra månadens förbrukning
		forbrukning = denna - forra; // räkna ut totalförbrukning denna månad
		kostnad = (forbrukning * RORLIG_KOSTNAD) + (FAST_KOSTNAD / 12); // räknar
																		// ut
																		// kostnaden
																		// för
																		// förbrukad
																		// el
																		// under
																		// senaste
																		// månaden
		System.out.println("Förbrukning: " + forbrukning + "kWh");
		System.out.println("Kostnad: " + kostnad + "kr");
		keyboard.close();
	}

}
