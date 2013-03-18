/*
 *******************************************************************************
 * _Escapes (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex013
{
	public static void main(String args[])
	{
		String regex="\\\\";		/* How to match a backslash */

		String input="\\";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
