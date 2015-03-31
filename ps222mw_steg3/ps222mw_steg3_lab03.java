/**
 *  ps222mw_steg3_lab03.java
 *	Programmet skapar en array med valfritt antal platser som sedan fylls med inmatade heltal. Heltalen skrivs ut i omv�nd ordning.
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg3;

import java.util.Scanner;

public class ps222mw_steg3_lab03 {
	public static void main(String[] args) {
		int antal,i;
		System.out.print("Ange hur m�nga heltal du vill lagra i arrayen: ");
		Scanner keyboard = new Scanner(System.in);
		antal = keyboard.nextInt();
		int[] heltal = new int[antal];	//skapa en array med ett antal positioner
		System.out.println("Ange " + antal + " heltal:");
		
		for(i=0;i<antal;i++){	//loopa ett antal g�nger
			heltal[i]=keyboard.nextInt();	// l�s in ett antal heltal i arrayen
		}
				
		System.out.println("Talen utskrivna bakl�nges:");
		
		for (i = 0; i < heltal.length; i++){	
			System.out.print(heltal[heltal.length-i-1] + " "); // skriv ut heltalen bakl�nges
		}
			
		keyboard.close();	// st�ng keyboardhanteraren
	}	
}
