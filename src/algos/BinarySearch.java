package algos;

public class BinarySearch {

	public static void main(String[] args) {
		int[] inp = {-1,0,3,5,9,12};
		int target = 0;
		int position = binarySearch(inp, target);
		System.out.println(target +" is at index "+position);
	}

	private static int binarySearch(int[] inp, int target) {
		int left = 0;
		int right = inp.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (inp[mid] == target) {
				return mid;
			} else if (target < inp[mid]) {
				right = mid - 1;
			} else if (target > inp[mid]) {
				left = mid +1;
			}
		}
		return -1;
	}
}
