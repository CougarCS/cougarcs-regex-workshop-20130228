/*
 *******************************************************************************
 * _Character classes (cont.)_ 
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex007
{
	public static void main(String args[])
	{
		String regex="ab[^cdef]";			/* negation */
//		String regex="ab[^c-f]";			/* negation with range*/
		/*
		 * by putting a ^ (caret) at the beginning of the character
		 * class, the class matches a single character that is
		 * not in the class
		 */
		String input="abc";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="abd";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="ab@";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
