/**
 *  ps222mw_steg4_lab02.java
 *	Programmet skapar en låda med klassen Box som ärver Rektangle. Lådans volym och totalyta beräknas och skrivs ut.
 *  2014-07-01
 *  Per Sundström
 */

package ps222mw_steg4;

import java.util.Scanner;

public class ps222mw_steg4_lab02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int width = 0, height = 0, depth = 0;
		boolean ok = false;
		String input;

		Box lada1 = new Box(5, 5, 5);
		System.out.println("Jag har:");
		System.out.println(lada1);
		System.out.println("Ange bredd på din låda: ");

		while (!ok) {
			
			try {
				ok = true; // sätt ok till true så loopen bryts om allt går bra
				input = keyboard.next(); // läs in från keyboard till variabeln input
				width = Integer.parseInt(input); // testa om det går att göra om input till integer
			} 
			catch (NumberFormatException e) { // går nåt snett kastas ett exceptions som fångas här
				System.out.println("Vänligen ange ett TAL för lådans bredd: ");
				keyboard.nextLine();
				ok = false; // se till att inte loopen bryts, dvs inte ok
			}
		}
		ok = false; // ok är true sen första loopen så den måste sättas till false
		System.out.println("Ange höjd på din låda: ");
		
		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next();
				height = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				System.out.println("Vänligen ange ett TAL för lådans höjd: ");
				keyboard.nextLine();
				ok = false;
			}
		}
		ok = false;
		System.out.println("Ange djup på din låda: ");
		
		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next();
				depth = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				System.out.println("Vänligen ange ett TAL för lådans djup: ");
				keyboard.nextLine();
				ok = false;
			}
		}
		Box lada2 = new Box(width, height, depth);
		System.out.println("Du har:");
		System.out.println(lada2);
		System.out.println("Lådans volym är " + lada2.computeVolume() + " volymenheter.");
		System.out.println("Sammanlagd area av lådans sidor är " + lada2.computeArea() + " areaenheter.");
		System.out.println();

		if (lada1.equals(lada2)) { // jämför objekten lada1 och lada2. Retuneras true är de lika
			System.out.println("Min låda rymmer lika mycket som din!");
		} 
		else {
			System.out.println("Våra lådor är inte lika stora!");
		}
		keyboard.close();
	}
}
