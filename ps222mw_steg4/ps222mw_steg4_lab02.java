/**
 *  ps222mw_steg4_lab02.java
 *	Programmet skapar en l�da med klassen Box som �rver Rektangle. L�dans volym och totalyta ber�knas och skrivs ut.
 *  2014-07-01
 *  Per Sundstr�m
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
		System.out.println("Ange bredd p� din l�da: ");

		while (!ok) {
			
			try {
				ok = true; // s�tt ok till true s� loopen bryts om allt g�r bra
				input = keyboard.next(); // l�s in fr�n keyboard till variabeln input
				width = Integer.parseInt(input); // testa om det g�r att g�ra om input till integer
			} 
			catch (NumberFormatException e) { // g�r n�t snett kastas ett exceptions som f�ngas h�r
				System.out.println("V�nligen ange ett TAL f�r l�dans bredd: ");
				keyboard.nextLine();
				ok = false; // se till att inte loopen bryts, dvs inte ok
			}
		}
		ok = false; // ok �r true sen f�rsta loopen s� den m�ste s�ttas till false
		System.out.println("Ange h�jd p� din l�da: ");
		
		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next();
				height = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				System.out.println("V�nligen ange ett TAL f�r l�dans h�jd: ");
				keyboard.nextLine();
				ok = false;
			}
		}
		ok = false;
		System.out.println("Ange djup p� din l�da: ");
		
		while (!ok) {
			
			try {
				ok = true;
				input = keyboard.next();
				depth = Integer.parseInt(input);
			} 
			catch (NumberFormatException e) {
				System.out.println("V�nligen ange ett TAL f�r l�dans djup: ");
				keyboard.nextLine();
				ok = false;
			}
		}
		Box lada2 = new Box(width, height, depth);
		System.out.println("Du har:");
		System.out.println(lada2);
		System.out.println("L�dans volym �r " + lada2.computeVolume() + " volymenheter.");
		System.out.println("Sammanlagd area av l�dans sidor �r " + lada2.computeArea() + " areaenheter.");
		System.out.println();

		if (lada1.equals(lada2)) { // j�mf�r objekten lada1 och lada2. Retuneras true �r de lika
			System.out.println("Min l�da rymmer lika mycket som din!");
		} 
		else {
			System.out.println("V�ra l�dor �r inte lika stora!");
		}
		keyboard.close();
	}
}
