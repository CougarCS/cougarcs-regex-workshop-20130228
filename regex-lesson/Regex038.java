/*
 *******************************************************************************
 * _Replace (cont.)_
 *******************************************************************************
 */

import java.util.regex.*;

public class Regex038
{
	public static void main(String args[])
	{
		String numbers[]={ "zero","one","two","three","four",
			"five","six","seven","eight","nine"};

		Pattern p=Pattern.compile("\\b(\\d)\\b");
		String input="This is a number: 1. Another number: 5.\n"+
			"The largest digit is 9. 42, Hooray!";

		Matcher m=p.matcher(input);
		StringBuffer changed=new StringBuffer();

		while(m.find())
		{
			String group=m.group(1);
			int digit=group.charAt(0)-'0';
			m.appendReplacement(changed,numbers[digit]);
			System.out.println(changed);
			System.out.println("----");
		}
		m.appendTail(changed);
		System.out.println(changed);
	}
}
