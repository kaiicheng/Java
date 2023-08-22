
public class Throw {

	public static void main(String[] args) {

		int age = 15;
				
		if (age < 18) {
			throw new IllegalArgumentException("Age can't be under 18!");
		}
	}
}
