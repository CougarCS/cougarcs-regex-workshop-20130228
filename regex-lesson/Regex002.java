/*
 *******************************************************************************
 * _How to make a simple regex_
 *
 * When writing a regex most characters match themselves. For
 * example if one wrote the regex "abc" it would only match the
 * string "abc". These characters are called literals.
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex002
{
	public static void main(String args[])
	{
		String regex="##/##/##";
		String input="##/##/##";

		Pattern p=Pattern.compile(regex);
		/* Pattern.compile(String regex)	returns Pattern */

		Matcher m=p.matcher(input);
		/* Pattern.matcher(String input)	returns Matcher */

		System.out.println(m);
		System.out.println(input+" matches the regex "+regex+" : "
				+ m.matches());
		System.out.println(m);
		/* Matcher.matches()			returns boolean */
	}
}
