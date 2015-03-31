/**
 *  ps222mw_steg2_lab02.java
 *	Programmet kollar om in inskriven fras �r ett palindrom
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg2;

import java.util.Scanner;

public class ps222mw_steg2_lab02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String teststring;
		Palindrome palindrom = new Palindrome(); // skapa ett palindrom-objekt

		System.out.println("Ange en str�ng och tryck [Enter]: ");
		teststring = keyboard.nextLine(); // l�s in en str�ng att kolla
		teststring = palindrom.removeNoneLetters(teststring); // ta bort ickebokst�ver
		
		if (palindrom.isPalindrome(teststring)) { // kolla om metoden isPalindrome retunerar true
			System.out.println("'" + teststring + "' �r ett palindrom.");
		} 
		else { // annars returnerar den falskt
			System.out.println("'" + teststring + "' �r INTE ett palindrom.");
		}
		keyboard.close(); // st�ng keyboard
	}
}

class Palindrome {
	public boolean isPalindrome(String str) {
		String reverseStr = (new StringBuffer(str)).reverse().toString();
		return str.equalsIgnoreCase(reverseStr);
	}

	public String removeNoneLetters(String str) {
		String result = "";
		for (int i = 0; i < str.length(); ++i) {
			if (Character.isLetter(str.charAt(i))) {
				result = result + str.charAt(i);
			}
		}
		return result;
	}
}
