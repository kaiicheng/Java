
public class WhyOverloadAMethodMyCountingUtility {

	int count = 0;
	
	// increments count by given amount
	// returns count
	public int increment(int amount) {
		this.count += amount;
		return this.count;
	}
	
	
	// increments by 1 and returns count
	public int increment() {
		return this.increment(1);  // note, one method can call another of the same name
	}

	public static void main(String[] args) {
		WhyOverloadAMethodMyCountingUtility countingUtility = new WhyOverloadAMethodMyCountingUtility();
		System.out.println(countingUtility.increment());
		System.out.println(countingUtility.increment(2));
	}
}
