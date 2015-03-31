/**
 *  ps222mw_steg3_lab05.java
 *	Programmet skapar en array med vald storlek och fyller med inmatade flyttal samt utf�r ber�kningar p� talen.
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ps222mw_steg3_lab05 {
	public static void main(String[] args) {
		int antal, i;
		double max, min, average, summa = 0;
		DecimalFormat decimalformat = new DecimalFormat("####0.0"); // tv� decimaler

		System.out.print("Ange storlek p� arrayen: ");
		Scanner keyboard = new Scanner(System.in);
		antal = keyboard.nextInt();
		double[] tal = new double[antal]; // skapa en array med storlek antal
		System.out.println("Ange " + antal + " flyttal:");

		for (i = 0; i < antal; i++) {	// loopa antal ggr
			tal[i] = keyboard.nextDouble(); // l�s in flyttal till arrayen
		}
		max = tal[0]; // s�tt max till f�rsta v�rdet i arrayen
		min = tal[0]; // s�tt min till f�rsta v�rdet i arrayen

		for (i = 0; i < tal.length; i++) { // loopa igenom arrayen
			summa += tal[i]; // summera talen till variablen summa
			if (tal[i] < min) // om nuvarande tal �r mindre �n min
				min = tal[i];
			if (tal[i] > max) // om nuvarande tal �r st�rre �n max
				max = tal[i];
		}
		average = summa / tal.length; // r�kna ut medelv�rde
		System.out.println("Medelv�rdet av de inmatade talen �r: " + decimalformat.format(average));
		System.out.println("St�rsta talet �r: " + max);
		System.out.println("Minsta talet �r: " + min);

		keyboard.close();
	}
}
