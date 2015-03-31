/**
 *  ps222mw_steg3_lab02.java
 *	Programmet skapar en array med chars och skriver ut den framl�nges och bakl�nges.
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg3;

public class ps222mw_steg3_lab02 {
	public static void main(String[] args) {
		char temp; // en tempor�r char-variabel
		int i; // en integer som anv�nds i loopar
		char[] text = { 't', 't', '�', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't',
				't', 'e', 'D' };

		for (i = 0; i < text.length; i++){
			System.out.print(text[i] + " ");
		}
		System.out.println(); // byt rad i konsolen

		for (i = 0; i < (text.length / 2); i++) { // loopa igenom halva arrayen
			temp = text[i]; // l�gg arrayens v�rde i en temp-variabel
			text[i] = text[text.length - i - 1]; // flytta arrayens v�rde till arrayens slutv�rde minus loopens v�rde
			text[text.length - i - 1] = temp; // flytta temp-variabeln till arrayens slutv�rde minus loopens v�rde
		}

		for (i = 0; i < text.length; i++){
			System.out.print(text[i] + " ");
		}
	}
}
