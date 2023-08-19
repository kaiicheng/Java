
public class Matches {

	public static void main(String[] args) {
		
        String Str = new String("www.helloworld.com");

        System.out.print("Output:" );
        System.out.println(Str.matches("(.*)hello(.*)"));
        
        System.out.print("Output:" );
        System.out.println(Str.matches("(.*)google(.*)"));

        System.out.print("Output:" );
        System.out.println(Str.matches("www(.*)"));
    }
}
