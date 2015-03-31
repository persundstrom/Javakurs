/**
 *  RectangleEx.java
 *	Klassen har inputkontroll dels på negativa och nolltal, dels på input som inte är siffror 
 *  2014-07-01
 *  Per Sundström
 */

package ps222mw_steg4;

public class RectangleEx extends Rectangle {

	public RectangleEx() { // om inga parametrar skickas in skapa en rektangel med sidor 1
		setWidth(1);
		setHeight(1);
	}

	public RectangleEx(String width, String height) throws RectangleException {

		try {
			setWidth(width); // försök sätta bredden
		} 
		catch (RectangleException e) { // fånga exception från setWidth om nåt går snett
			throw new RectangleException(e.getMessage()); // kasta tillbaka felmeddelande
		}

		try {
			setHeight(height);
		} 
		catch (RectangleException e) { // exception från setHeight
			throw new RectangleException(e.getMessage());
		}
	}

	public RectangleEx(int width, int height) throws RectangleException {

		try {
			setWidth(width); // försök sätta bredden
		} 
		catch (RectangleException e) { // setWidth kastar exception RectangleExceptions som fångas här
			throw new RectangleException(e.getMessage()); // felmeddelandet skickas vidare
		}

		try {
			setHeight(height); // försök sätta höjden
		} 
		catch (RectangleException e) {
			throw new RectangleException(e.getMessage());
		}
	}

	public void setWidth(int width) throws RectangleException {

		if (width < 1) { // kolla så att width är större än noll
			throw new RectangleException("Du måste ange bredden som ett heltal större än noll");
		}

		super.setWidth(width); // använd setWidth från superklassen Rectangle
	}

	public void setHeight(int height) throws RectangleException {

		if (height < 1) { // kolla så att height är större än noll
			throw new RectangleException("Du måste ange höjden som ett heltal större än noll");
		}
		super.setHeight(height); // använd setHeight från superklassen Rectangle
	}

	public void setWidth(String i) throws RectangleException {

		try {
			setWidth(Integer.parseInt(i)); // försök göra inmatat till ett heltal
		} 
		catch (NumberFormatException e) { // det blev ett exception i string to int konverteringen
			throw new RectangleException("Du måste skriva bredden med siffor");
		} 
		catch (RectangleException e) { // exception från setWidth
			throw new RectangleException(e.getMessage());
		}
	}

	public void setHeight(String i) throws RectangleException {

		try {
			setHeight(Integer.parseInt(i)); // försök göra inmatat tal till ett heltal
		} 
		catch (NumberFormatException e) { // det blev ett exception i string to int konverteringen
			throw new RectangleException("Du måste skriva höjden med siffor");
		} 
		catch (RectangleException e) { // exception från setHeight
			throw new RectangleException(e.getMessage());
		}
	}
}
