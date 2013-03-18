/*
 *******************************************************************************
 * _Greediness (cont.)_
 *
 * Possesive quantifiers
 * 	*+	0 or more
 * 	++	1 or more
 * 	?+	0 or 1
 *
 * Sun added this to their Regex API
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex030
{
	public static void main(String args[])
	{
		/* Possesive quantifiers are just
		 * like greedy quantifiers except
		 * they never back off.
		 */
		/* I stole this example. */
		String regex="\\w++:";		/* Uses possesive quantifier */
		Pattern p=Pattern.compile(regex);

		String input="Subject:";
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
