/*
 *******************************************************************************
 * _Dot_
 *
 * If that is all that is possible with regexes, then why not just
 * use String.equals()? What makes regexes powerful are special
 * characters called metacharacters.
 *
 * One of these metacharacters is: . (dot)
 *
 * ->	a dot matches any character (except an EOL by default)	<-
 *
 * EOL : End Of Line
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex003
{
	public static void main(String args[])
	{
		String regex="ab.";				/* . metacharacter */

		String input="abc";

		boolean match=Pattern.matches(regex,input);
		/* Pattern.matches(String regex,String input)	returns boolean	[static method] */

		System.out.println(input+" matches the regex "+regex+" : " + match );

		input="abg";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="abq";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
