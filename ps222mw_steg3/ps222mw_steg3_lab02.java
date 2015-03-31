/**
 *  ps222mw_steg3_lab02.java
 *	Programmet skapar en array med chars och skriver ut den framlänges och baklänges.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg3;

public class ps222mw_steg3_lab02 {
	public static void main(String[] args) {
		char temp; // en temporär char-variabel
		int i; // en integer som används i loopar
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't',
				't', 'e', 'D' };

		for (i = 0; i < text.length; i++){
			System.out.print(text[i] + " ");
		}
		System.out.println(); // byt rad i konsolen

		for (i = 0; i < (text.length / 2); i++) { // loopa igenom halva arrayen
			temp = text[i]; // lägg arrayens värde i en temp-variabel
			text[i] = text[text.length - i - 1]; // flytta arrayens värde till arrayens slutvärde minus loopens värde
			text[text.length - i - 1] = temp; // flytta temp-variabeln till arrayens slutvärde minus loopens värde
		}

		for (i = 0; i < text.length; i++){
			System.out.print(text[i] + " ");
		}
	}
}
