/**
 *  ps222mw_steg3_lab04.java
 *	Programmet skapar en array med 10000 platser. Arrayen fylls med slumpade ental. Sist summeras alla treor och åttor.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg3;

public class ps222mw_steg3_lab04 {
	public static void main(String[] args) {
		int slump[] = new int[10000]; // skapa en integerarray med 10000 platser
		int i, treor = 0, attor = 0, summa;

		for (i = 0; i < 10000; i++) { // loop för att skapa en array med slumpade tal
			slump[i] = (int) (Math.random() * 10);	// slumpa tal mellan 0 och 9 till arrayen
		}

		for (i = 0; i < 10000; i++) { // loopa igenom och kolla hur många treor och åttor det finns
			if (slump[i] == 3)
				treor++; // om tre öka variabel treor
			if (slump[i] == 8)
				attor++; // om åtta öka variabel attor

		}
		summa = treor + attor; // summera ihop hur många treor och åttor
		System.out.print("Antalet framslumpade treor och åttor är: " + summa);
	}

}
