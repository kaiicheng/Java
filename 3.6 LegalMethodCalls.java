
public class LegalMethodCalls {

	public void myPrint(double d) {
		System.out.println(d);
	}
	
	public static void main(String[] args) {	
		LegalMethodCalls printingUtility = new LegalMethodCalls();
		printingUtility.myPrint(5);  // widening is legal, will print 5.0
	}
}
