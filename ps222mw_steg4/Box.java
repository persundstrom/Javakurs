/**
 *  Box.java
 *	Klassen Box ärver Rectangle. Box innehåller metoder för att beräkna volym och totalarea av en låda.
 *  2014-07-01
 *  Per Sundström
 */

package ps222mw_steg4;

public class Box extends Rectangle { // box ärver variabler och metoder från klassen Rectangle
	private int depth;

	public Box() { // konstruktor för en låda med sidor 0 bara för variablerna ska vara initierade
		setWidth(0);
		setHeight(0);
		depth = 0;
	}

	public Box(int i, int j, int k) { // konstruktor som skapar låda med valfri längd på sidorna
		setWidth(i);
		setHeight(j);
		depth = k;
	}

	public int computeVolume() {
		return getWidth() * getHeight() * depth;
	}

	public int computeArea() {
		return (getWidth() * getHeight() * 2) + (getWidth() * depth * 2) + (getHeight() * depth * 2);
	}

	public int getDepth() { // metod för att läsa den privata instansvariablen depth
		return depth;
	}

	public void setDepth(int i) { // metod för att sätta eller ändra den privata instansvariablen depth
		depth = i;
	}

	public String toString() { // jag måste overrida default toString för att få rätt output
		return ("En låda med bredden " + getWidth() + ", höjden " + getHeight() + " och djupet " + depth + "."); // skapar en läsbar returnsträng
	}

	public boolean equals(Box lada) { // overraidar default equals och anpassar till denna klass.
		if (getWidth() == lada.getWidth() & getHeight() == lada.getHeight()	& depth == lada.depth) { // jämför en låda med en annan
			return true;
		} 
		else {
			return false;
		}
	}
}
