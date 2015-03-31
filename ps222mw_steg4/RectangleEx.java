/**
 *  RectangleEx.java
 *	Klassen har inputkontroll dels p� negativa och nolltal, dels p� input som inte �r siffror 
 *  2014-07-01
 *  Per Sundstr�m
 */

package ps222mw_steg4;

public class RectangleEx extends Rectangle {

	public RectangleEx() { // om inga parametrar skickas in skapa en rektangel med sidor 1
		setWidth(1);
		setHeight(1);
	}

	public RectangleEx(String width, String height) throws RectangleException {

		try {
			setWidth(width); // f�rs�k s�tta bredden
		} 
		catch (RectangleException e) { // f�nga exception fr�n setWidth om n�t g�r snett
			throw new RectangleException(e.getMessage()); // kasta tillbaka felmeddelande
		}

		try {
			setHeight(height);
		} 
		catch (RectangleException e) { // exception fr�n setHeight
			throw new RectangleException(e.getMessage());
		}
	}

	public RectangleEx(int width, int height) throws RectangleException {

		try {
			setWidth(width); // f�rs�k s�tta bredden
		} 
		catch (RectangleException e) { // setWidth kastar exception RectangleExceptions som f�ngas h�r
			throw new RectangleException(e.getMessage()); // felmeddelandet skickas vidare
		}

		try {
			setHeight(height); // f�rs�k s�tta h�jden
		} 
		catch (RectangleException e) {
			throw new RectangleException(e.getMessage());
		}
	}

	public void setWidth(int width) throws RectangleException {

		if (width < 1) { // kolla s� att width �r st�rre �n noll
			throw new RectangleException("Du m�ste ange bredden som ett heltal st�rre �n noll");
		}

		super.setWidth(width); // anv�nd setWidth fr�n superklassen Rectangle
	}

	public void setHeight(int height) throws RectangleException {

		if (height < 1) { // kolla s� att height �r st�rre �n noll
			throw new RectangleException("Du m�ste ange h�jden som ett heltal st�rre �n noll");
		}
		super.setHeight(height); // anv�nd setHeight fr�n superklassen Rectangle
	}

	public void setWidth(String i) throws RectangleException {

		try {
			setWidth(Integer.parseInt(i)); // f�rs�k g�ra inmatat till ett heltal
		} 
		catch (NumberFormatException e) { // det blev ett exception i string to int konverteringen
			throw new RectangleException("Du m�ste skriva bredden med siffor");
		} 
		catch (RectangleException e) { // exception fr�n setWidth
			throw new RectangleException(e.getMessage());
		}
	}

	public void setHeight(String i) throws RectangleException {

		try {
			setHeight(Integer.parseInt(i)); // f�rs�k g�ra inmatat tal till ett heltal
		} 
		catch (NumberFormatException e) { // det blev ett exception i string to int konverteringen
			throw new RectangleException("Du m�ste skriva h�jden med siffor");
		} 
		catch (RectangleException e) { // exception fr�n setHeight
			throw new RectangleException(e.getMessage());
		}
	}
}
