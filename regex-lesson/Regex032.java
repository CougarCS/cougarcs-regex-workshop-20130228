/*
 *******************************************************************************
 * _Capturing groups (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex032
{
	public static void main(String args[])
	{
		/* Backreferences specify a capturing
		 * groups text to be matched again
		 * (this is after it has already matched something)
		 */
		String regex="(\\w+)\\1";
		/*            1		*/
		/* a group of one or more word characters repeated */
		Pattern p=Pattern.compile(regex);

		String input="foofoo";
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

			int i=1;
			int gc=m.groupCount();
			/* returns the number of groups,
			 * not including group 0 (zero)
			 */

			while(i<=gc)
			{
				System.out.println("Group "+i+":");
				start=	m.start(i);
				end=	m.end(i);
				System.out.println("\tfound match starting at " +
						start + " and ending at " + end );
				matched=m.group(i);
				System.out.println("\tMatched \t" + matched);
				i++;
			}

			System.out.println();
		}

		System.out.println("\n\nMatched "+count+" time(s)");
	}
}
