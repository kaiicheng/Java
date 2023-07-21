
public class BinarySearch_LastOccuranceOf2 {

	public static void main(String[] args) {

//		int[] arr = {1, 1, 2, 2, 2, 6, 7};
		int[] arr = {1, 1, 2, 2, 5, 6, 7};		
		
		int l = 0; int r = arr.length - 1;

		// target
		int k = 2;

		// not l <= r
		// think about when we only have 2, 3 two numbers 
		while (l < r) {
			
			// may lead to overflow
			// int mid = (l + r) / 2
			// better way to find middle point
			// r - l + 1!
			// think about when we only have 2, 3 two numbers 
			int mid = l + (r - l + 1) / 2;
			
			if (arr[mid] > k) {
				r = mid - 1;
			} else {
				// need to consider the middle number, because not sure it's the last one or not
				l = mid;
			}
		}
		
		System.out.println(l);
	}
}
