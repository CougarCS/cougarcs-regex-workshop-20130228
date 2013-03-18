/*
 *******************************************************************************
 * _Alternation_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex015
{
	public static void main(String args[])
	{
		String regex="foo|ba.|[c-g]";
		
		/* matches either of the expressions */
		String input="foo";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="baz";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="e";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
