/*
 *******************************************************************************
 * _Quantifiers and Groups_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex025
{
	public static void main(String args[])
	{
		String regex="(foo)+";

		String input="foofoofoo";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="foo";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
