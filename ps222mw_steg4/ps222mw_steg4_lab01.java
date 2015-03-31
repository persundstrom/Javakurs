/**
 *  ps222mw_steg4_lab01.java
 *	Programmet skapar en rektangel med hjälp av klassen Rectangle. Programmet kollar att de inmatade talen är siffror med hjälp av exceptions.
 *  2014-07-01
 *  Per Sundström
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
				input = keyboard.next(); // läs in från keyboard till variabeln input
				width = Integer.parseInt(input); // försök göra om input till integer
			} 
			catch (NumberFormatException e) { // går nåt snett fångas NumberFormatException
				System.out
						.println("Vänligen ange ett tal för rektangelns bredd: ");
				keyboard.nextLine();
				ok = false; // se till att inte loopen bryts, dvs inte ok
			}
		}
		ok = false; // ok är true sen första loopen så den måste sättas till false
		System.out.println("Ange rektangelns höjd:");
		
		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next();
				height = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				System.out.println("Vänligen ange ett tal för rektangelns höjd: ");
				keyboard.nextLine();
				ok = false;
			}
		}

		Rectangle rekt = new Rectangle(width, height);
		System.out.println(rekt);
		System.out.println();
		System.out.println("Arean beräknas nu till " + rekt.computeArea());
		keyboard.close();
	}
}
