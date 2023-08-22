import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherGreedyLength {
	public static void main(String[] args) {

		// {} mean the number of digits, {2, 8} is from 2 digits to 8 digits
		Pattern p = Pattern.compile("(\\d{2,8})(0*)");
		Matcher matcher = p.matcher("2220000000");
		boolean matches = matcher.matches();
		if (matches){
		    System.out.println(matcher.group(1)); // 22200000
		    System.out.println(matcher.group(2));// 00
		}

        // ? mean not greedy and only contain digits before 0
		Pattern p2 = Pattern.compile("(\\d{2,8}?)(0*)");
		Matcher matcher2 = p2.matcher("2220000000");
		boolean matches2 = matcher2.matches();
		if (matches2){
		    System.out.println(matcher2.group(1)); // 222
		    System.out.println(matcher2.group(2)); // 0000000
		}	
	}
}
