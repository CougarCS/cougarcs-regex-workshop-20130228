/*
 *******************************************************************************
 * _Groups_
 * also called a subexpression
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex016
{
	public static void main(String args[])
	{
		String regex="[bchs][a](t|nd)";
		/* how to use alternation with other expressions */
		/* matches either of the expressions */
		String input="cat";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="bat";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="sand";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
