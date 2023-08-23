import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatches {
	public static void main(String[] args) {
		
		// + mean matching number with multiple times (>=1)
		System.out.println(Pattern.matches("\\d+",""));  // false
		System.out.println(Pattern.matches("\\d+","2223"));  // true
		System.out.println(Pattern.matches("\\d+","2223456789"));  // true
		System.out.println(Pattern.matches("\\d+","2223aa"));  // false
		System.out.println(Pattern.matches("\\d+","22bb23"));  // false
		System.out.println();
		
		
		
		// find keyword having pattern as _o_
		// m matching characters/underscore/number
		Pattern p1 = Pattern.compile("\\wo\\w");
		Matcher matcher = p1.matcher("i dog fox wo od hhh opp ppo and 1o2 ao3");
//	    System.out.println(matcher.find());  // find
		while (matcher.find()){
		    System.out.println(matcher.group()); // dog fox
		}		
		System.out.println();
	}
}
