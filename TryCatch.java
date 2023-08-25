
public class TryCatch {
	public static void main(String[] args) {

		try {
			
			// do the "normal" code, ignoring possible exceptions
			System.out.println("Try.");
			int i = 100/0;
			System.out.println(i); // error so enable catch to handle
			
		} catch (Exception e) {

			// handle the exception
			System.out.println("Catch activated to handle error in Try.");
			
			// if not RuntimeException(), the program will continue after finally and print 3
			throw new RuntimeException();
			
		} finally {
			
			// optional finally block, will always be executed, whatever happens in try-catch
			System.out.println("Finally.");
		
		}
		System.out.println(3);
	}
}
