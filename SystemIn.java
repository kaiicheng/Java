import java.io.InputStream;

public class SystemIn {

	public static void main(String[] args) {
		
        // Input
        InputStream in = System.in;
        char c;
        
        try {
            System.out.print("Input: ");
            while ((c = (char) in.read()) > 0) {

                System.out.print(c);

                if (c == '\n')  // next line sign
                    System.out.print("Input: ");
            }
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
	}
}
