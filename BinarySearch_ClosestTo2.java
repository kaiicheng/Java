
public class BinarySearch_ClosestTo2 {

	public static void main(String[] args) {
		
//		int[] arr = {1, 1, 2, 2, 2, 6, 7};
		int[] arr = {1, 1, 2, 2, 5, 6, 7};		
		
		int l = 0; int r = arr.length - 1;

		// target
		int k = 2;

		// not l <= r
		// think about when we only have 2, 3 two numbers 
		while (l < r - 1) {
			
			// may lead to overflow
			// int mid = (l + r) / 2
			// better way to find middle point
			// r - l + 1!
			// think about when we only have 2, 3 two numbers 
			int mid = l + (r - l) / 2;
			
			if (arr[mid] < k) {
				l = mid;
			} else {
				// need to consider the middle number, because not sure it's the last one or not
				r = mid;
			}
		}
		
		// think about when we only have 1, 1 two numbers 
		if (arr[r] < k) {
			System.out.println(r);
		} else if (arr[l] > k) {
		// think about when we only have 3, 4 two numbers 
			System.out.println(l);
		} else {
		// think about when we only have 1, 4 two numbers
		// need to compare the gap between distance (k and l) and the distance (k and right)
			System.out.println(k - arr[l] < arr[r] - k ? l: r);
		}
//		System.out.println(l);
	}
}
