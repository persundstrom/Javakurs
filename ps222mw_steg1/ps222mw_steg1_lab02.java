/**
 *  ps222mw_steg1_lab02.java
 *	Räknar ut celsius utifrån ett inmatat temperaturvärde i fahenheit
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ps222mw_steg1_lab02 {

	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		DecimalFormat decimalformat = new DecimalFormat("##0.0"); // skapa ett
																	// eget
																	// decimalformat
		Scanner keyboard = new Scanner(System.in); // skapa en
													// keyboardscannerobjekt
		System.out.println("Ange temperaturen i fahrenheit: ");
		fahrenheit = keyboard.nextDouble(); // läs in temperatur
		celsius = ((fahrenheit - 32) * 5 / 9); // räkna om temperatur till
												// celsius
		System.out.println("Temperaturen " + fahrenheit + " °F motsvarar "
				+ decimalformat.format(celsius) + " °C"); // skriv ut
															// temperaturen med
															// det egna
															// deciamalformatet;
		keyboard.close();
	}
}
