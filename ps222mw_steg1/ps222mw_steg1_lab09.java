/**
 *  ps222mw_steg1_lab09.java
 *	Skriver ut ett stj�rnm�ster med hj�lp av en n�stlad loop och modula
 *  2014-06-13
 *  Per Sundstr�m
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab09 {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) { // k�r en loop 4ggr
			for (int j = 0; j < 19; j++) { // 19 outputs bildar 2 rader
				if (j == 8 || j == 18)
					System.out.println(); // byt rad p� tv� st�llen
				else if (j == 9)
					System.out.print(" "); // f�rsta output p� andra raden
				else
					System.out.print("* "); // annars skriv ut "* "
			}
		}
	}
}
