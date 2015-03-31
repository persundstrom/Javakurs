/**
 *  ps222mw_steg1_lab03.java
 *	Räknar ut celsius utifrån ett inmatat temperaturvärde i fahenheit
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ps222mw_steg1_lab03 {
	public static void main(String[] args) {
		double kostnad;
		int belopp;
		String antal;
		double tillbaka1, tillbaka2;
		DecimalFormat decimalformat2 = new DecimalFormat("####0.00"); // två
																		// decimaler
		DecimalFormat decimalformat0 = new DecimalFormat("##0"); // ingen
																	// decimal
		Scanner keyboard = new Scanner(System.in); // skapa en
		// keyboardscannerobjekt
		System.out.println("Ange kostnaden: ");

		kostnad = keyboard.nextDouble(); // läs in kostnaden
		System.out.println("Ange erhållet belopp: ");
		belopp = keyboard.nextInt(); // läs in erhållet belopp
		tillbaka1 = belopp - kostnad;
		tillbaka1 = (int) (tillbaka1 * 2 + 0.5) / 2d;
		System.out.println("Tillbaka: " + decimalformat2.format(tillbaka1)
				+ " kr");

		tillbaka2 = tillbaka1 % 1000;
		antal = decimalformat0.format((tillbaka1 - tillbaka2) / 1000);
		System.out.println("Antal 1000-lappar: " + antal);
		tillbaka1 = tillbaka2 % 500;
		antal = decimalformat0.format((tillbaka2 - tillbaka1) / 500);
		System.out.println(" Antal 500-lappar: " + antal);
		tillbaka2 = tillbaka1 % 100;
		antal = decimalformat0.format((tillbaka1 - tillbaka2) / 100);
		System.out.println(" Antal 100-lappar: " + antal);
		tillbaka1 = tillbaka2 % 50;
		antal = decimalformat0.format((tillbaka2 - tillbaka1) / 50);
		System.out.println("  Antal 50-lappar: " + antal);
		tillbaka2 = tillbaka1 % 20;
		antal = decimalformat0.format((tillbaka1 - tillbaka2) / 20);
		System.out.println("  Antal 20-lappar: " + antal);
		tillbaka1 = tillbaka2 % 10;
		antal = decimalformat0.format((tillbaka2 - tillbaka1) / 10);
		System.out.println("  Antal 10-kronor: " + antal);
		tillbaka2 = tillbaka1 % 5;
		antal = decimalformat0.format((tillbaka1 - tillbaka2) / 5);
		System.out.println("   Antal 5-kronor: " + antal);
		tillbaka1 = tillbaka2 % 1;
		antal = decimalformat0.format((tillbaka2 - tillbaka1) / 1);
		System.out.println("   Antal 1-kronor: " + antal);
		tillbaka2 = tillbaka1 % 0.5;
		antal = decimalformat0.format((tillbaka1 - tillbaka2) / 0.5);
		System.out.println(" Antal 50-öringar: " + antal);
		keyboard.close();
	}
}