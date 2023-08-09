/*
 * 2 myPrint Methods: they have different parameters
 */

public class OverloadingMyPrintingUtility {

	// prints given int i
	public void myPrint(int i) {
		System.out.println("int i = " + i);
	}
	
	// same name, different parameter
	// prints given double d
	public void myPrint(double d) {
		System.out.println("double i = " + d);
	}
	
	public static void main(String[] args) {
		OverloadingMyPrintingUtility printingUtility = new OverloadingMyPrintingUtility();
		printingUtility.myPrint(5);
		printingUtility.myPrint(5.0);  // call same method name with different argument type
	}
}
