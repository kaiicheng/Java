
public class WhyOverloadAMethodMyResults {

	double total = 0.0;
	double average = 0.0;
	
	// prints total and average
	public void printResults() {
		System.out.println("Total = " + this.total + ", average = " + this.average);
	}
	
	// prints given message and prints results
	public void printResults(String message) {
		System.out.println(message + ": ");
		this.printResults();
	}
	
	public static void main(String[] args) {
		WhyOverloadAMethodMyResults myResults = new WhyOverloadAMethodMyResults();
		myResults.printResults("My results");
	}
}
