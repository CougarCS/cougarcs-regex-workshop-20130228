/*
 *******************************************************************************
 * _Find_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex017
{
	public static void main(String args[])
	{
		String regex="ab|cd";
		Pattern p=Pattern.compile(regex);

		String input="ababcdghab";
		Matcher m=p.matcher(input);

		int count=0;
		while(m.find())
		{
			count++;
			int start=	m.start();
			int end=	m.end();
			System.out.println("found match starting at " +
				       start + " and ending at " + end );

			/* equivalent */
			String matched=input.substring(start,end);
//			String matched=m.group();
			System.out.println("Matched \t" + matched);
			System.out.println();
		}

		System.out.println("\n\nMatched "+count+" time(s)");
	}
}
