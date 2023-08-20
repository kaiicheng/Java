import java.util.regex.Pattern;

public class PatternCompile {
	public static void main(String[] args) {
		
		// create a regular expression
		Pattern p=Pattern.compile("\\w+");
		System.out.println(p.pattern());  // \w+
	}
}
