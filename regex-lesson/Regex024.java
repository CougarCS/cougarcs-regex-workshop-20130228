/*
 *******************************************************************************
 * _Quantifiers and Character Classes_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex024
{
	public static void main(String args[])
	{
		String regex="[abc]+";

		String input="aaa";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="bb";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="c";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
