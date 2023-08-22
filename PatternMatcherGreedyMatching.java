import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherGreedyMatching {

	public static void main(String[] args) {
        
		// \\d+ is greedy to contain all digits
		Pattern pattern = Pattern.compile("(\\d+)(0*)");
        Matcher matcher = pattern.matcher("1230000");
        if (matcher.matches()) {
            System.out.println("group1=" + matcher.group(1)); // "1230000"
            System.out.println("group2=" + matcher.group(2)); // ""
        }
        System.out.println();

        // ? mean not greedy and only contain digits before 0
        Pattern pattern2 = Pattern.compile("(\\d+?)(0*)");
        Matcher matcher2 = pattern2.matcher("1230000");
        if (matcher2.matches()) {
            System.out.println("group1=" + matcher2.group(1)); // "123"
            System.out.println("group2=" + matcher2.group(2)); // "0000"
        }
        System.out.println();
        
	}
}
