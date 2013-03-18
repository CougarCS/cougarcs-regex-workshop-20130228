/*
 *******************************************************************************
 * _Quantifiers_
 *
 * Quantifiers are metacharacters that say how many times a pattern
 * should match.
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex018
{
	public static void main(String args[])
	{
		String regex="a*b";
		/* the * (star) matches the previous thing zero or more times */

		String input="b";		/* a matched zero times */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="aaab";			/* a matched three times */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		/* a matched 44 times  */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

	}
}
