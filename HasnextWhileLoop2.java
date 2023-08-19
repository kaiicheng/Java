import java.util.Scanner;

public class HasnextWhileLoop2 {
	public static void main(String[] args) {
		System.out.println("Input: ");
		String s = "This is another happy week!";
		
		// create a new scanner with the specified String Object
		Scanner in = new Scanner(s);
		
		int i = 0;
		String input;
		
		while(in.hasNext()) {

			// The next() method finds and returns the next complete token from this scanner
			input = in.next();
			System.out.println(i + ": " + input);
			i++;
		}
		
		// The close() method is to close the scanner
		in.close();
	}
}
