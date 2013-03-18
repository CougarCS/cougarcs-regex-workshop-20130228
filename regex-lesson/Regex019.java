/*
 *******************************************************************************
 * _Quantifiers (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex019
{
	public static void main(String args[])
	{
		String regex="a+b";
		/* the + (plus) matches the previous thing one or more times */

		String input="b";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="ab";			/* a matched one time */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		/* a matched 44 times  */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

	}
}
