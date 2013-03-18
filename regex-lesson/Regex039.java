/*
 *******************************************************************************
 * _Replace (cont.)_
 *******************************************************************************
 */

import java.io.*;
import java.util.regex.*;

public class Regex039
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("Regex039");
		BufferedReader br=new BufferedReader(new FileReader(f));
		BufferedWriter bw=new BufferedWriter(new FileWriter("Regex039.html"));

		/* The parts of the Strings that have angle brackets "[<>]" are HTML */
		bw.write("<html>\n");
		bw.write("\t<title>HTML Table Made with Regex</title>\n\n");
		bw.write("\t<body>\n");
		bw.write("\t\t<table border cellpadding=15>\n");

		Pattern p=Pattern.compile("\\G(\\d+)(\\s+|$)");
		/* \G  is a boundary matcher that  matches
		 * at the end of the previous match
		 */
		Matcher m=p.matcher("");

		while(br.ready())
		{
			String input=br.readLine();

			m.reset(input);
			/* Gives the matcher a new input and puts the matcher
			 * back at the start.
			 */

			System.out.println(m);
			bw.write("\t\t\t<tr>\n");


			String replacementString="\t\t\t\t<td align=\"right\"> $1 </td>\n";

			StringBuffer replaced=new StringBuffer();
			while(m.find())
				m.appendReplacement(replaced,replacementString);
			// Note that there is not an appendTail()

			/* $1 stands for the first capturing groups text
			 * to use an actual $ (dollar sign) you can escape it
			 * with a backslash (\$). This also means that a literal
			 * backslash in a String would be written as four
			 * backslashes.
			 *
			 * Another way to quote is to call
			 * 	Matcher.quoteReplacement(String replacementString)
			 * which is a static method.
			 */

			bw.write(replaced.toString());

			System.out.println(m);

			System.out.println();

			bw.write("\t\t\t</tr>\n\n");
		}

		bw.write("\t\t</table>\n");
		bw.write("\t</body>\n");
		bw.write("</html>\n");

		br.close();
		bw.close();
	}
}
