/*
 *******************************************************************************
 * _Embedded flag expression_
 * 	Flag				Embedded flag
 * 	Pattern.CANONICAL_EQ		----
 * 	Pattern.CASE_INSENSITIVE	(?i)
 * 	Pattern.COMMENTS		(?x)
 * 	Pattern.DOTALL			(?s)
 * 	Pattern.LITERAL			----
 * 	Pattern.MULTILINE		(?m)
 * 	Pattern.UNICODE_CASE		(?u)
 * 	Pattern.UNIX_LINES		(?d)
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex027
{
	public static void main(String args[])
	{
		String regex="(?i)fooj";	/* the embedded flag is turned on */

/*		String regex="(?i:foo)j";	/* the embedded flag only applies inside the group */

		/* to turn off a flag that was turned on when the
		 * pattern was compiled you can put a minus in front of the letter
		 *
		 * Pattern.compile("(?-i:foo)j",Pattern.CASE_INSENSITIVE).matcher("FooJ").matches();
		 * is false
		 *
		 * multiple flags can be changed by putting the flags
		 * next to each other
		 * (?i)(?s) or (?is)
		 */

		String input="fooj";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="fooJ";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="FOOj";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
