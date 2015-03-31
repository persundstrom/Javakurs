/**
 *  ps222mw_steg2_lab01.java
 *	Programmet skriver ut en fördefinierad fras ett antal gånger
 *  2014-06-19
 *  Per Sundström
 */

package ps222mw_steg2;

public class ps222mw_steg2_lab01 
{
	public static void main(String[] args) 
	{
		MultiDisplay multiDisplay = new MultiDisplay();
		multiDisplay.statement = "I have a dream.";
		multiDisplay.numberOfTimesToDisplay = 10;
		multiDisplay.display();
		multiDisplay.display("Make love, not war.", 5);
	}
}

class MultiDisplay 
{
	public String statement;
	public int numberOfTimesToDisplay;

	public void display(String string, int i) 
	{
		for (int a = 0; a < i; a++) 	// loopa ett givet antal gånger
		{
			System.out.println(string);		// skriv ut strängen
		}
	}

	public void display() 
	{
		display(statement, numberOfTimesToDisplay);		// skicka in data till den första konstruktorn
	}
}
