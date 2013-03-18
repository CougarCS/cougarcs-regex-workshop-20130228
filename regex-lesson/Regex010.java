/*
 *******************************************************************************
 * _Character classes (cont.)_ 
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex010
{
	public static void main(String args[])
	{
		String regex="[[a-r]&&[^bgq]&&[^c-f]]";		/* subtraction */
		/* intersection with negation */
		String input="c";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="b";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="h";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
