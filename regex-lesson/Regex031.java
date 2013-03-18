/*
 *******************************************************************************
 * _Capturing groups_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex031
{
	public static void main(String args[])
	{
		/* Groups serve another purpose other
		 * than just for "grouping" part of
		 * the regex together. They can also
		 * be used to "capture" the text that
		 * it matched to for later use.
		 */
		String regex="(.*?)(at)";	/* using reluctant quantifier */
		/*            1    2	*/
		/* Capturing groups are numbered
		 * from left to right based on
		 * the opening parentheses.
		 * (see above)
		 */
		Pattern p=Pattern.compile(regex);

		String input="splat";
//		String input="splatcathat";
		Matcher m=p.matcher(input);

		int count=0;
		while(m.find())
		{
			count++;

			int start1=	m.start(1);
			int end1=	m.end(1);
			System.out.println("Group 1: found match starting at " +
				       start1 + " and ending at " + end1 );

			String matched1=m.group(1);
			System.out.println("\tMatched \t" + matched1);

			int start2=	m.start(2);
			int end2=	m.end(2);
			System.out.println("Group 2: found match starting at " +
				       start2 + " and ending at " + end2 );

			String matched2=m.group(2);
			System.out.println("\tMatched \t" + matched2);

			/* There is also a special group that refers
			 * to the whole regex. This is group 0 (zero).
			 */
			int start0=	m.start(0);	/* equivalent to m.start() */
			int end0=	m.end(0);	/* equivalent to m.end() */

			System.out.println("Group 0: found match starting at " +
				       start0 + " and ending at " + end0 );

			String matched0=m.group(0);	/* equivalent to m.group() */
			System.out.println("Matched \t" + matched0);

			System.out.println();
		}

		System.out.println("\n\nMatched "+count+" time(s)");
	}
}
