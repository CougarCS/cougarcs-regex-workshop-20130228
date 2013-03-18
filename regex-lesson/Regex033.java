/*
 *******************************************************************************
 * _Capturing groups (cont.)_
 * 	Backreferences (more)
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex033
{
	public static void main(String args[])
	{
		String regex="(\\w+)\\123";
		/*            1		*/
		/* because there are not 123 capturing
		 * groups at this point, Java's regex API
		 * drops numbers one at a time until
		 * the backreference actually references
		 * a valid number.
		 */
		Pattern p=Pattern.compile(regex);

		String input="foofoo23";
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
