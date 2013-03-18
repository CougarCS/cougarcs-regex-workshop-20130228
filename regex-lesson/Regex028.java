/*
 *******************************************************************************
 * _Greediness_
 *
 * Greedy quantifiers
 * 	*	0 or more
 * 	+	1 or more
 * 	?	0 or 1
 *
 * matches as many times as possible
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex028
{
	public static void main(String args[])
	{
		/* Greedy quantifiers take up all of the
		 * characters that they can. At that point
		 * when the match fails, the greedy quantifier
		 * backs off character by character until
		 * it can get a match or there are not any
		 * characters to back off from.
		 */
		String regex=".+end";		/* Uses greedy quantifier */
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
