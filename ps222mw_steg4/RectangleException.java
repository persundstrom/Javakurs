/**
 *  RectangleException.java
 *	Klassen RectangleException är en klass för egna exceptions exceptions.
 *  2014-07-01
 *  Per Sundström
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
