/*
 *******************************************************************************
 * _Greediness (cont.)_
 *
 * Reluctant quantifiers
 * also called lazy quantifiers
 * 	*?	0 or more
 * 	+?	1 or more
 * 	??	0 or 1
 *
 * matches as few times as possible
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex029
{
	public static void main(String args[])
	{
		/* Reluctant quantifiers start at
		 * the beginning and eat up one
		 * character at a time until it
		 * can get a match.
		 */
		String regex=".+?end";		/* Uses reluctant quantifier */
/*		String regex=".+?";		/*    See what happens?      */
/*		String regex=".*?";		/*    Not very useful regex  */
		Pattern p=Pattern.compile(regex);

		String input="charend_somemorecharend_otherchar";
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
	}
}
