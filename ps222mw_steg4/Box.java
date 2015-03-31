/**
 *  Box.java
 *	Klassen Box �rver Rectangle. Box inneh�ller metoder f�r att ber�kna volym och totalarea av en l�da.
 *  2014-07-01
 *  Per Sundstr�m
 */

package ps222mw_steg4;

public class Box extends Rectangle { // box �rver variabler och metoder fr�n klassen Rectangle
	private int depth;

	public Box() { // konstruktor f�r en l�da med sidor 0 bara f�r variablerna ska vara initierade
		setWidth(0);
		setHeight(0);
		depth = 0;
	}

	public Box(int i, int j, int k) { // konstruktor som skapar l�da med valfri l�ngd p� sidorna
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

	public int getDepth() { // metod f�r att l�sa den privata instansvariablen depth
		return depth;
	}

	public void setDepth(int i) { // metod f�r att s�tta eller �ndra den privata instansvariablen depth
		depth = i;
	}

	public String toString() { // jag m�ste overrida default toString f�r att f� r�tt output
		return ("En l�da med bredden " + getWidth() + ", h�jden " + getHeight() + " och djupet " + depth + "."); // skapar en l�sbar returnstr�ng
	}

	public boolean equals(Box lada) { // overraidar default equals och anpassar till denna klass.
		if (getWidth() == lada.getWidth() & getHeight() == lada.getHeight()	& depth == lada.depth) { // j�mf�r en l�da med en annan
			return true;
		} 
		else {
			return false;
		}
	}
}
