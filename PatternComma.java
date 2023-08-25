/*
 * . mean any character/number/signs
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternComma {
	public static void main(String[] args) {
	    
		Pattern p = Pattern.compile("(\\.*)(\\d*)(\\.*)");
		Matcher matcher = p.matcher("1kai3");
	    
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
