/*
 *******************************************************************************
 * _Character classes (cont.)_ 
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex006
{
	public static void main(String args[])
	{
		String regex="ab[5-8]";			/* a range (number) */

		String input="ab2";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="ab5";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="ab9";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
