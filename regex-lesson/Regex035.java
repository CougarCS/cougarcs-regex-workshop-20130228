/*
 *******************************************************************************
 * _Split_
 *******************************************************************************
 */

// import java.util.regex.*;

public class Regex035
{
	public static void main(String args[])
	{
		String regex="[/-]";

		String input="2006/01/01";
//		String input="2006-01-01";

/*		String regex="\\s+";
		String input="Blah blah blahblah";*/

		/* String.split(regex) */
		/* splits between the regex and the end of the String */
		String[] items= input.split(regex);

		for(int i=0;i<items.length;i++)
			System.out.println(items[i]);
	}
}
