package problems;

import java.util.Arrays;

public class BinarySearchInternet {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4,10, 10, 10, 40 };
        int n = arr.length;
        int x = 10;
        System.out.println(binarySearch(arr, 0, n - 1, x));
        System.out.println(binarySearchContinue(arr,x));
	}
	
	private static int binarySearchContinue(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		int idx = -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			// set the correct value of mid
			if(nums[mid] == target)
				idx = mid;
			// we continue looping even if mid = target to push to the most left index.
			if(nums[mid] >= target)
				end = mid-1;
			else
				start = mid+1;
		}
		return idx;
	}
	
	public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
}
