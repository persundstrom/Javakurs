/**
 *  ps222mw_steg4_lab01.java
 *	Programmet skapar en rektangel med hj�lp av klassen Rectangle. Programmet kollar att de inmatade talen �r siffror med hj�lp av exceptions.
 *  2014-07-01
 *  Per Sundstr�m
 */

package ps222mw_steg4;

import java.util.Scanner;

public class ps222mw_steg4_lab01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int width = 0, height = 0;
		boolean ok = false;
		String input;

		System.out.println("Ange rektangelns bredd:");

		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next(); // l�s in fr�n keyboard till variabeln input
				width = Integer.parseInt(input); // f�rs�k g�ra om input till integer
			} 
			catch (NumberFormatException e) { // g�r n�t snett f�ngas NumberFormatException
				System.out
						.println("V�nligen ange ett tal f�r rektangelns bredd: ");
				keyboard.nextLine();
				ok = false; // se till att inte loopen bryts, dvs inte ok
			}
		}
		ok = false; // ok �r true sen f�rsta loopen s� den m�ste s�ttas till false
		System.out.println("Ange rektangelns h�jd:");
		
		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next();
				height = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				System.out.println("V�nligen ange ett tal f�r rektangelns h�jd: ");
				keyboard.nextLine();
				ok = false;
			}
		}

		Rectangle rekt = new Rectangle(width, height);
		System.out.println(rekt);
		System.out.println();
		System.out.println("Arean ber�knas nu till " + rekt.computeArea());
		keyboard.close();
	}
}
