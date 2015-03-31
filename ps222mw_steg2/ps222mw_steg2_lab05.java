/**
 *  ps222mw_steg2_lab05.java
 *	Programmet räknar ut avstånd mellan två punkter med hjälp av funktioner i Point-classen.
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg2;

public class ps222mw_steg2_lab05 {
	public static void main(String[] args) {
		// Skapa två Point-objekty
		Point pt1 = new Point();
		Point pt2 = new Point(10, 10);
		// Satsen som följer ska inte vara ”tillåten” att göra –
		// d.v.s. vid testkörning ska utskriften inte vara genomförbar:
		// System.out.println("(" + pt1.x + ", " + pt1.y + ")");
		// Skriv ut Point-objekten (virtuella metoden toString används!)
		System.out.println(pt1);
		System.out.println(pt2);
		// Två Point-objekt jämförs (virtuella metoden equals används)
		if (pt1.equals(pt2)) {
			System.out.println("pt1 och pt2 är lika");
		} else {
			// Avståndet mellan två Point-objekt beräknas.
			System.out.printf("Avståndet mellan punkterna är %.1f%n",
					pt1.distance(pt2));
		}
		// Point-objektet flyttas -10 i x-led och 10 i y-led.
		pt2.offset(-10, 10);
		// Point-objektet flyttas till punkten (0, 20).
		pt1.moveToXY(0, 20);
		// Skriv ut Point-objekten (virtuella metoden toString används!)
		System.out.println(pt1);
		System.out.println(pt2);
		// Två Point-objekt jämförs (virtuella metoden equals används)
		if (pt1.equals(pt2)) {
			System.out.println("pt1 och pt2 är lika");
		} else {
			// Avståndet mellan två Point-objekt beräknas.
			System.out.printf("Avståndet mellan punkterna är %.1f%n",
					pt1.distance(pt2));
		}
	}
}

class Point {
	private int x = 0, y = 0; // x och y sätt till private för att de inte ska synas utanför klassen
	int diffX, diffY;
	double distance;

	public Point(int i, int j) { // konstruktor som sätter x och y till inmatade värden
		x = i;
		y = j;
	}

	public Point() { // konstruktor som sätter x och y till 0
		x = 0;
		y = 0;
	}

	public double distance(Point pt2) {
		diffX = Math.abs(x - pt2.x);
		diffY = Math.abs(y - pt2.y);
		distance = Math.sqrt(diffX * diffX + diffY * diffY);
		return distance;
	}

	public void offset(int i, int j) { // ändrar punkten ett visst antal steg
		x += i;
		y += j;
	}

	public void moveToXY(int i, int j) { // flyttar punkten till en given position
		x = i;
		y = j;
	}

	public String toString() { // jag måste overrida javas egen toString för att få en vettig retursträng
		return ("(" + x + ", " + y + ")"); // skapar en läsbar retursträng
	}

	public boolean equals(Point pt) { // overridar default equals och anpassar till denna klass.
		if (x == pt.x & y == pt.y) { // om x & y i detta objekt är samma som x & y i ett annat objekt
			return true;
		} else {
			return false;
		}
	}
}
