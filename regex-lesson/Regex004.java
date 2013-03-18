/*
 *******************************************************************************
 * _Character classes_
 *
 * Matching almost every character is nice but sometimes you want
 * something that is specific. You can specify which characters you
 * want to match to with character classes.
 *
 * Note: These having nothing to do with objects or
 *       java.lang.Character.
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex004
{
	public static void main(String args[])
	{
		String regex="ab[cev]";			/* a character class */
		/*
		 * the letters in between the square brackets are
		 * those that can match a single character at that
		 * location
		 */
		String input="abc";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="abe";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="abd";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
