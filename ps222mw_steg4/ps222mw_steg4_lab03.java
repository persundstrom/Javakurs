/**
 *  ps222mw_steg4_lab03.java
 *	Programmet skapar en rektangel utifrån klassen RektangleEx som har bättre inputkontroll än ursprungsklassen
 *  2014-07-01
 *  Per Sundström
 */

package ps222mw_steg4;

import java.util.Scanner;

public class ps222mw_steg4_lab03 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String width, height;
		boolean ok = false;

		while (!ok) {
			
			try {
				ok = true;
				System.out.println("Ange rektangelns bredd: ");
				width = keyboard.next();
				System.out.println("Ange rektangelns höjd: ");
				height = keyboard.next();
				RectangleEx rekt = new RectangleEx(width, height);
				System.out.println(rekt);
				System.out.println();
				System.out.println("Arean beräknas nu till " + rekt.computeArea());
			} 
			catch (RectangleException e) {
				System.out.println(e.getMessage());
				ok = false;
			}
		}

		keyboard.close();
	}
}