/**
 *  RectangleException.java
 *	Klassen RectangleException �r en klass f�r egna exceptions exceptions.
 *  2014-07-01
 *  Per Sundstr�m
 */

package ps222mw_steg4;

public class RectangleException extends RuntimeException {
	public RectangleException() {
		super("fel");	// generellt felmeddelande
	}

	public RectangleException(String i) { // skriv ut ett valfritt exceptionmeddelande
		super(i);
	}
}
