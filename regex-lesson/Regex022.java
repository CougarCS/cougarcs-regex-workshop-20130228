/*
 *******************************************************************************
 * _Boundaries_
 * also called anchors
 * 
 * match positions not characters
 *
 * \B matches a non-word boundary
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex022
{
	public static void main(String args[])
	{
		/*
		 * \b matches a word boundary
		 * Words have word boundary on either
		 * side so you place the _boundary matchers_
		 * on both sides.
		 */
		String regex="\\b\\w+\\b";
		Pattern p=Pattern.compile(regex);

		String input="Finally, something useful. As you can see, this regex "+
			"matches words.";
		Matcher m=p.matcher(input);

		int count=0;
		while(m.find())
		{
			count++;
			int start=	m.start();
			int end=	m.end();
			System.out.println("found match starting at " +
				       start + " and ending at " + end );

			String matched=m.group();
			System.out.println("Matched \t" + matched);
			System.out.println();
		}

		System.out.println("\n\nMatched "+count+" time(s)");
		/* Side note:
		 * \w only works for ASCII
		 * \b works for all of Unicode
		 */
	}
}
