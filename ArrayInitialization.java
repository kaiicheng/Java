
public class ArrayInitialization {
	public static void main(String[] args) {
		
		int[] arr = new int[2];
		for (int a : arr) {
			System.out.println(a);
		}
		
		String[] strArr = new String[3];
		for (String a : strArr) {
			System.out.println(a);
		}
		
		String[] arr2 = { "Hello", "world", "!" };
		for (String a : arr2) {
			System.out.println(a);
		}
	}

}
