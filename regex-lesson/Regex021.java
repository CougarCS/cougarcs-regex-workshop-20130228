/*
 *******************************************************************************
 * _Zero-length matches_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex021
{
	public static void main(String args[])
	{
		String regex="a*";
		Pattern p=Pattern.compile(regex);

		String input="abaaaabc";
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
		/*
		 * Explanation
		 * 1: matches one time
		 * 2: matches zero times in front of 'b'
		 * 	--- this is called a zero-length match ---
		 * 3: matches four times
		 * 4: another zero-length match in front of 'b'
		 * 5: another zero-length match in front of 'c'
		 * 6: zero-length match between c and the end of the string
		 */
	}
}
