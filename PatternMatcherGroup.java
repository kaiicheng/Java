import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherGroup {

	public static void main(String[] args) {
		
		// () mean grouping
		// {} mean the number of digit
        Pattern p = Pattern.compile("(\\d{3})-(\\d{4})-(\\d{3})");
        Matcher m = p.matcher("110-1340-220");
        
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            String g3 = m.group(3);
            System.out.println(g1);  // 110
            System.out.println(g2);  // 1340
            System.out.println(g3);  // 220
        } else {
            System.out.println("Matching fails!");
        }
	}
}
