
public class DRYPrinciple {

	int first;
	int last = 3;
	
	String[] dictionary = {"a", "b", "c", "d"};
	
	// prints first, last, and dictionary info in between
	public void debug() {
		
		System.out.println("First = " + this.first + ", last = " + this.last);
		for (int i = this.first; i <= this.last; i++) {
			System.out.print(this.dictionary[i] + " ");
		}
		System.out.println();

	}
	
	// prints given checkpoint s and debugs
	public void debug(String s) {
		System.out.println("At checkpoint " + s + ":");
		this.debug();
	}
	
	public static void main(String[] args) {
		DRYPrinciple dry = new DRYPrinciple();
		dry.debug("abcd");
	}
}
