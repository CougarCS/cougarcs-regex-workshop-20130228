/*
 *******************************************************************************
 * _Boundaries (cont.)_
 *
 * \A matches the beginning of the input 
 * \Z matches the end of the input except
 *    for the final terminator, if any 
 * \z matches the end of the input 
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex023
{
	public static void main(String args[])
	{
		String regex="^\\w+$";
		/*
		 * ^ (caret) matches the beginning of the line
		 * $ (dollar) matches the end of the line
		 */

		String input="word";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="two words";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));

		input="these three words";
		System.out.println(input+" matches the regex "+regex+" : "
				+ Pattern.matches(regex,input));
	}
}
