/**
 *  Rectangle.java
 *	Klassen inneh�ller information om rektangelns sidor samt metoder f�r att s�tta och l�sa dess. Dessutom finns en metod f�r ber�kning av arean. 
 *  2014-07-01
 *  Per Sundstr�m
 */

package ps222mw_steg4;

public class Rectangle {
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		width = 0;
		height = 0;
	}

	public int computeArea() {
		return width * height;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String toString() { // jag m�ste overrida javas egen toString f�r att f� r�tt output
		return ("En rektangel med bredden " + width + " och h�jden " + height + "."); // skapar en l�sbar returnstr�ng
	}

}
