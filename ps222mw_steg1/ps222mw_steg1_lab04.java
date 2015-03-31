/**
 *  ps222mw_steb1_lab04.java
 *	Räknar ut upplevd temperatur utifrån verklig temperatur och vindhastighet
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

import java.text.DecimalFormat;
import java.util.Scanner;

// Teff = 13.126667+0.6215·T-13.924748·v0.16+0.4875195·T·v0.16

public class ps222mw_steg1_lab04 {
	public static void main(String[] args) {

		double temperature, windspeed;
		double calctemp;
		Scanner keyboard = new Scanner(System.in); // skapa en
		// keyboardscannerobjekt
		DecimalFormat decimalformat0 = new DecimalFormat("##0"); // skapa ett
		// eget
		// decimalformat
		System.out.println("Ange temperatur och vindhastighet: ");
		temperature = keyboard.nextDouble(); // läs in temperatur
		windspeed = keyboard.nextDouble(); // läs in vindhastighet

		calctemp = 13.126667 + 0.6215 * temperature - 13.924748
				* Math.pow(windspeed, 0.16) + 0.4875195 * temperature
				* Math.pow(windspeed, 0.16);
		System.out.println("Effektiv temperatur: "
				+ decimalformat0.format(calctemp) + " °C");
		keyboard.close();
	}
}
