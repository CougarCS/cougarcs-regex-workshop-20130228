/*
 *******************************************************************************
 * _Replace_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex037
{
	public static void main(String args[])
	{
		String old="The cows swing in trees. The cows live in the "
			+"rainforest";

		String changed=old.replaceAll("cows","monkeys");
		/* replace all the 'cows' with 'monkeys' */

/*		String changed=old.replaceFirst("cows","monkeys");
		/* replace the first 'cows' with 'monkeys' */

		System.out.println(changed);
		/* There are also matching Matcher.replaceAll()
		 * and Matcher.replaceFirst() methods.
		 * which would be used in the following way:
		 * 	Pattern p=Pattern.compile("cows");
		 * 	Matcher m=p.matcher(old);
		 * 	String changed=m.replaceAll("monkeys");
		 */
	}
}
