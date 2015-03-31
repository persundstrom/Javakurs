/**
 *  ps222mw_steg2_lab05.java
 *	Programmet r�knar ut avst�nd mellan tv� punkter med hj�lp av funktioner i Point-classen.
 *  2014-06-19
 *  Per Sundstr�m
 */

package ps222mw_steg2;

public class ps222mw_steg2_lab05 {
	public static void main(String[] args) {
		// Skapa tv� Point-objekty
		Point pt1 = new Point();
		Point pt2 = new Point(10, 10);
		// Satsen som f�ljer ska inte vara �till�ten� att g�ra �
		// d.v.s. vid testk�rning ska utskriften inte vara genomf�rbar:
		// System.out.println("(" + pt1.x + ", " + pt1.y + ")");
		// Skriv ut Point-objekten (virtuella metoden toString anv�nds!)
		System.out.println(pt1);
		System.out.println(pt2);
		// Tv� Point-objekt j�mf�rs (virtuella metoden equals anv�nds)
		if (pt1.equals(pt2)) {
			System.out.println("pt1 och pt2 �r lika");
		} else {
			// Avst�ndet mellan tv� Point-objekt ber�knas.
			System.out.printf("Avst�ndet mellan punkterna �r %.1f%n",
					pt1.distance(pt2));
		}
		// Point-objektet flyttas -10 i x-led och 10 i y-led.
		pt2.offset(-10, 10);
		// Point-objektet flyttas till punkten (0, 20).
		pt1.moveToXY(0, 20);
		// Skriv ut Point-objekten (virtuella metoden toString anv�nds!)
		System.out.println(pt1);
		System.out.println(pt2);
		// Tv� Point-objekt j�mf�rs (virtuella metoden equals anv�nds)
		if (pt1.equals(pt2)) {
			System.out.println("pt1 och pt2 �r lika");
		} else {
			// Avst�ndet mellan tv� Point-objekt ber�knas.
			System.out.printf("Avst�ndet mellan punkterna �r %.1f%n",
					pt1.distance(pt2));
		}
	}
}

class Point {
	private int x = 0, y = 0; // x och y s�tt till private f�r att de inte ska synas utanf�r klassen
	int diffX, diffY;
	double distance;

	public Point(int i, int j) { // konstruktor som s�tter x och y till inmatade v�rden
		x = i;
		y = j;
	}

	public Point() { // konstruktor som s�tter x och y till 0
		x = 0;
		y = 0;
	}

	public double distance(Point pt2) {
		diffX = Math.abs(x - pt2.x);
		diffY = Math.abs(y - pt2.y);
		distance = Math.sqrt(diffX * diffX + diffY * diffY);
		return distance;
	}

	public void offset(int i, int j) { // �ndrar punkten ett visst antal steg
		x += i;
		y += j;
	}

	public void moveToXY(int i, int j) { // flyttar punkten till en given position
		x = i;
		y = j;
	}

	public String toString() { // jag m�ste overrida javas egen toString f�r att f� en vettig returstr�ng
		return ("(" + x + ", " + y + ")"); // skapar en l�sbar returstr�ng
	}

	public boolean equals(Point pt) { // overridar default equals och anpassar till denna klass.
		if (x == pt.x & y == pt.y) { // om x & y i detta objekt �r samma som x & y i ett annat objekt
			return true;
		} else {
			return false;
		}
	}
}
