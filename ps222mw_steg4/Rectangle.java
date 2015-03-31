/**
 *  Rectangle.java
 *	Klassen innehåller information om rektangelns sidor samt metoder för att sätta och läsa dess. Dessutom finns en metod för beräkning av arean. 
 *  2014-07-01
 *  Per Sundström
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

	public String toString() { // jag måste overrida javas egen toString för att få rätt output
		return ("En rektangel med bredden " + width + " och höjden " + height + "."); // skapar en läsbar returnsträng
	}

}
