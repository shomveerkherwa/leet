package problems;

import java.util.Arrays;

public class MergeSortedArrayApproach {

	public static void main(String[] args) {
		int[] nums1 = {4,5,6,0,0,0};
		int m = 3;
		int[] nums2 = {1,2,3};
		int n = 3;
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int tail1 = m - 1;
		int tail2 = n - 1;
		int actualTail = m + n - 1;
		
		while(tail1 >= 0 && tail2 >= 0) {
			int num = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
			nums1[actualTail--] = num;
		}
		
		// because the array already has numbers from nums1, we need not check if they need to be added again .
		// we just need to check if tail2 reached index 0;
		
		while(tail2 >= 0 && actualTail >= 0) {
			nums1[actualTail--] = nums2[tail2--];
		}
	}

}
