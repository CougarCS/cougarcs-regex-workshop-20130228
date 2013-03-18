/*
 *******************************************************************************
 * _Escapes_
 * 
 * Now that you know a number of metacharacters you need to
 * know how to match that actual character.
 *
 * \[	matches an literal left square bracket
 * \.	matches a literal period
 * \\	matches a literal backslash
 *
 * Metacharacters in the Java Regex API:
 * 	([{\^-$|]})?*+.<=
 *
 * In certain cases metacharacters are not considered
 * metacharacters
 * e.g.	a hypen outside of a character class
 *
 * the same escape characters that are used in strings can be used
 * in regexen:
 * 	\n for newline
 * 	\a for bell
 * 	<backslash>uhhhh for Unicode, etc.
 * 	for example: String regex="\\u25FC"
 * 	would be used to match the Unicode character 0x25FC
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex012
{
	public static void main(String args[])
	{
		/* Problem: match an 'a','-',and '7' */
		String regex="[a-7]";		/* PatternSytaxException	*/
/*		String regex="[a\\-7]";		/*	The right way		*/

		String input="a";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="b";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="-";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
