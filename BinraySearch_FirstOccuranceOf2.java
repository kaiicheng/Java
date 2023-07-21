
public class BinraySearch_FirstOccuranceOf2 {

	public static void main(String[] args) {

		int[] arr = {1, 1, 2, 2, 2, 6, 7};
//		int[] arr = {1, 1, 1, 2, 2, 6, 7};		
		
		int l = 0; int r = arr.length - 1;

		// target
		int k = 2;

		// not l <= r
		// think about when we only have 2, 3 two numbers 
		while (l < r) {
			
			// may lead to overflow
			// int mid = (l + r) / 2
			// better way to find middle point
			int mid = l + (r - l) / 2;
			
			if (arr[mid] < k) {
				l = mid + 1;
			} else {
				// need to consider the middle number, because not sure it's the first one or not
				r = mid;
			}
		}
		
		System.out.println(l);
	}
}
