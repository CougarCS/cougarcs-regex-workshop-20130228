/*
 *******************************************************************************
 * _Capturing groups (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex034
{
	public static void main(String args[])
	{
		String regex="(.*?(at))";	/* a capturing group inside another */
		/*            1   2	*/

/*		String regex="(.*?)(?:at)";
		/* a non-capturing group
		 * 	(?:_expression_)
		 *  Does not capture text
		 *  and does not contribute
		 *  to groupCount()
		 */

		Pattern p=Pattern.compile(regex);

		String input="splatcathat";
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
