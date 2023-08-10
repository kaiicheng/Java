
public class IllegalMethodCalls {

	public void myPrint(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {	
		IllegalMethodCalls printingUtility = new IllegalMethodCalls();
		printingUtility.myPrint(5.0);  // narrowing is illegal
	}

}
