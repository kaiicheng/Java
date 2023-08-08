
public class StringBuilderReverse {

	public static void main(String[] args) {

        String palindrome = "Dot saw I was Tod";
        
        StringBuilder sb = new StringBuilder(palindrome);
        
        sb.reverse();  // reverse it
        
        System.out.println("Class: " + sb.getClass().getSimpleName());
        System.out.println(sb);
    }
}