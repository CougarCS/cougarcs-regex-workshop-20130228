/*
 *******************************************************************************
 * _Predefined character classes_
 *
 *	class			range
 *	\d	a digit		[0-9]
 *	\D	a non-digit	[^\d]
 *
 *	\s	whitespace	[ \t\n\x0B\f\r]
 *	\S	non-whitspace	[^\s]
 *
 *	\w	word character	[a-zA-Z_0-9]
 *	\W	non-word	[^\w]
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex011
{
	public static void main(String args[])
	{
		String regex="\\w\\d";
		/*
		 * Note: when putting a backslash in a
		 * string you have to escape it
		 */
		String input="c4";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="a1";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="bc";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
