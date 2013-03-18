/*
 *******************************************************************************
 * _Pattern flags_
 *
 * When you compile a Pattern you can place flags in the argument that
 * affect how the regex acts. The flags are:
 *
 * 	Pattern.CANONICAL_EQ			
 * 	Pattern.CASE_INSENSITIVE		if used with UNICODE_CASE then
 * 						it works with all of Unicode
 * 						otherwise only with US-ASCII
 * 	Pattern.COMMENTS			allows whitespace and comments
 * 						inside of a regex
 * 						whitespace is ignored
 * 						comments start with a # and
 * 						go to the end of the line
 * 						for example:
 * 	String regex="a b* # a followed by b \n [c-f] # then a character from c to f"
 * 	is equivalent to
 * 	String regex="ab*[c-f]";
 *
 * 	Pattern.DOTALL				. (dot) matches any character including
 * 						EOL
 * 	Pattern.LITERAL				metacharacters are made literal
 * 	Pattern.MULTILINE			by default ^ and $ match
 * 						the beginning and end of the
 * 						input, with this enable they
 * 						match after and before an EOL,
 * 						respectively
 * 	Pattern.UNICODE_CASE			use with CASE_INSENSITIVE
 * 	Pattern.UNIX_LINES			only accepts '\n' as an EOL
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex026
{
	public static void main(String args[])
	{
		Pattern p=Pattern.compile("match",Pattern.CASE_INSENSITIVE);

		String input="matchMatchmAtCh";
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
