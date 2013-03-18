/*
 *******************************************************************************
 * _Escapes (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex014
{
	public static void main(String args[])
	{
		/* How to match a character that is a metacharacter */

		String regex="[" +
			"\\(\\[\\{\\\\\\^\\-\\$\\|\\]\\}\\)\\?\\*\\+\\.\\<\\="
			+ "]";
		/* Really long */

/*		String regex="[" +
			Pattern.quote("([{\\^-$|]})?*+.<=")
			+ "]";
		/*	DOES NOT WORK!??!	*/
		/* Another way:
		 * call quote method of Pattern class
		 */

		String input="\\";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="-";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="[";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
