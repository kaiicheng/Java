import java.util.regex.Pattern;

public class PatternCompile {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("\\w+");
		System.out.println(p.pattern());  // \w+
	}
}
