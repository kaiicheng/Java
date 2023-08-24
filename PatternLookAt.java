/*
 * lookingAt match the beginning of string
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternLookAt {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("\\d+"); 
		
		Matcher m=p.matcher("22bb23"); 
		System.out.println(m.lookingAt());  // true, \d+ matching 22 at the beginning 
		
		Matcher m2=p.matcher("aa2223"); 
		System.out.println(m2.lookingAt());  // false, \d+ isn't matching aa at the beginning 
	}
}
