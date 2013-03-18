/*
 *******************************************************************************
 * _Quantifiers (cont.)_
 *
 * other quantifiers
 *  X is an expression
 *  n and m are integers
 *
 *  X{n}	matches n times
 *  X{n,}	matches at least n times
 *  X{n,m}	matches n to m times (inclusive)
 * 
 * e.g.
 * String regex="a{1,3}";
 * matches
 * 	@ a
 * 	@ aa
 * 	@ aaa
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex020
{
	public static void main(String args[])
	{
		String regex="a?b";
//		String regex="(a|)b"; /* Same thing */
		/* the ? (question mark) matches the previous thing zero or one times */
		/* basically makes matching optional */

		String input="b";		/* a did not match (zero) */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="ab";			/* a matched one time */
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
