/**
 *  ps222mw_steg4_lab03.java
 *	Programmet skapar en rektangel utifr�n klassen RektangleEx som har b�ttre inputkontroll �n ursprungsklassen
 *  2014-07-01
 *  Per Sundstr�m
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
				System.out.println("Ange rektangelns h�jd: ");
				height = keyboard.next();
				RectangleEx rekt = new RectangleEx(width, height);
				System.out.println(rekt);
				System.out.println();
				System.out.println("Arean ber�knas nu till " + rekt.computeArea());
			} 
			catch (RectangleException e) {
				System.out.println(e.getMessage());
				ok = false;
			}
		}

		keyboard.close();
	}
}