
public class BinarySearch {
		
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		int k = 3;
		
		int l = 0; int r = arr.length - 1;
			
		int ans = -1;
		
		while (l <= r) {
			// may lead to overflow
			// int mid = (l + r) / 2
			// better way to find middle point
			int mid = l + (r - l) / 2;
			
			if (arr[mid] == k) {
				ans = mid;
				break;
			} else if (arr[mid] > k) {
				// not including mid, so mid + 1
				r = mid - 1;
			} else {
				// not including mid, so mid + 1
				l = mid + 1;
			}
		}
		
		System.out.println(ans);
//		return -1;
	}
}
