/**
 *  ps222mw_steg3_lab03.java
 *	Programmet skapar en array med valfritt antal platser som sedan fylls med inmatade heltal. Heltalen skrivs ut i omvänd ordning.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg3;

import java.util.Scanner;

public class ps222mw_steg3_lab03 {
	public static void main(String[] args) {
		int antal,i;
		System.out.print("Ange hur många heltal du vill lagra i arrayen: ");
		Scanner keyboard = new Scanner(System.in);
		antal = keyboard.nextInt();
		int[] heltal = new int[antal];	//skapa en array med ett antal positioner
		System.out.println("Ange " + antal + " heltal:");
		
		for(i=0;i<antal;i++){	//loopa ett antal gånger
			heltal[i]=keyboard.nextInt();	// läs in ett antal heltal i arrayen
		}
				
		System.out.println("Talen utskrivna baklänges:");
		
		for (i = 0; i < heltal.length; i++){	
			System.out.print(heltal[heltal.length-i-1] + " "); // skriv ut heltalen baklänges
		}
			
		keyboard.close();	// stäng keyboardhanteraren
	}	
}
