/*
 *******************************************************************************
 * _Character classes (cont.)_ 
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex009
{
	public static void main(String args[])
	{
		String part1="[a-p]";
		String part2="[m-r]";
		String regex="["+part1+"&&"+part2+"]";			/* intersection */
		/*
		 * a character class that contains characters that are in
		 * both character classes
		 */
		String input="c";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="n";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="r";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
