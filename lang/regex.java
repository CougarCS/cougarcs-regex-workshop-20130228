import java.util.regex.*;

public class regex
{
	public static void main(String args[])
	{
		String [] inputs = { "regular expression", "regex", "regexp", "not matching string" };
		Pattern p = Pattern.compile("reg(ular expression|exp?)");
		for(String input : inputs) {
			System.out.printf("\"%s\": ", input);
			Matcher m = p.matcher(input);
			if(m.find()) {
				System.out.println("matched");
				System.out.printf("\tcaptured: %s\n", m.group(1));
			} else {
				System.out.println("did not match");
			}
		}

		System.out.println("-=-=-=-");

		String[] split_words = "my string\t\twith  spaces".split("\\s+");
		for(String word: split_words) {
			System.out.printf("\"%s\"\n", word);
		}
	}
}
