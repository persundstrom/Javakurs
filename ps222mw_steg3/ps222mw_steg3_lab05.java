/**
 *  ps222mw_steg3_lab05.java
 *	Programmet skapar en array med vald storlek och fyller med inmatade flyttal samt utför beräkningar på talen.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ps222mw_steg3_lab05 {
	public static void main(String[] args) {
		int antal, i;
		double max, min, average, summa = 0;
		DecimalFormat decimalformat = new DecimalFormat("####0.0"); // två decimaler

		System.out.print("Ange storlek på arrayen: ");
		Scanner keyboard = new Scanner(System.in);
		antal = keyboard.nextInt();
		double[] tal = new double[antal]; // skapa en array med storlek antal
		System.out.println("Ange " + antal + " flyttal:");

		for (i = 0; i < antal; i++) {	// loopa antal ggr
			tal[i] = keyboard.nextDouble(); // läs in flyttal till arrayen
		}
		max = tal[0]; // sätt max till första värdet i arrayen
		min = tal[0]; // sätt min till första värdet i arrayen

		for (i = 0; i < tal.length; i++) { // loopa igenom arrayen
			summa += tal[i]; // summera talen till variablen summa
			if (tal[i] < min) // om nuvarande tal är mindre än min
				min = tal[i];
			if (tal[i] > max) // om nuvarande tal är större än max
				max = tal[i];
		}
		average = summa / tal.length; // räkna ut medelvärde
		System.out.println("Medelvärdet av de inmatade talen är: " + decimalformat.format(average));
		System.out.println("Största talet är: " + max);
		System.out.println("Minsta talet är: " + min);

		keyboard.close();
	}
}
