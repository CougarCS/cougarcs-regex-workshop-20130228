/*
 *******************************************************************************
 * _Character classes (cont.)_ 
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex008
{
	public static void main(String args[])
	{
		String regex="[[a-f][149]]";			/* union */
		/*
		 * joins two character classes into one character
		 * class
		 */
/*		String regex="[[a-f][149][g-m]]";		/* multiple unions */

		String input="c";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="h";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="4";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
