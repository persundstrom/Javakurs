/**
 *  ps222mw_steg1_lab09.java
 *	Skriver ut ett stjärnmöster med hjälp av en nästlad loop och modula
 *  2014-06-13
 *  Per Sundström
 */

package ps222mw_steg1;

public class ps222mw_steg1_lab09 {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) { // kör en loop 4ggr
			for (int j = 0; j < 19; j++) { // 19 outputs bildar 2 rader
				if (j == 8 || j == 18)
					System.out.println(); // byt rad på två ställen
				else if (j == 9)
					System.out.print(" "); // första output på andra raden
				else
					System.out.print("* "); // annars skriv ut "* "
			}
		}
	}
}
