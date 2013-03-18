/*
 *******************************************************************************
 * _Split (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex036
{
	public static void main(String args[])
	{
		String regex="[/-]";
		String input="2006/01/01//";

		/* String.split(regex,limit) */
		/* -when /limit/ is 0, split behaves like String.split():
		 * 	splits as many times as possible but removes trailing
		 * 	empty strings
		 * -when /limit/ is less than 0 then it simply splits as many
		 *  times as possible
		 * -when the limit is greater than 0 then it tries to split
		 *  up to /limit-1/ times making an array that has a size of
		 *  at most /limit/
		 */
		String[] items= input.split(regex,-2);

		for(int i=0;i<items.length;i++)
			System.out.println(items[i]);

		/* There are also matching Pattern.split() methods 
		 * which would be used in the following way:
		 * 	Pattern p=Pattern.compile("[/-]");
		 * 	String items[]=p.split("2006/01/01",0);
		 */
	}
}
