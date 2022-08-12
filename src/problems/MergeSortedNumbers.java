package problems;

import java.util.Arrays;

public class MergeSortedNumbers {

	public static void main(String[] args) {

		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=0, j=0, curr = 0;;
		int[] newArray = new int[nums1.length];
		
		while(i< m && j < n) {
			if(nums1[i] < nums2[j]) {
				newArray[curr++] = nums1[i++];
			} else {
				newArray[curr++] = nums2[j++];
			}
		}
		
		if(i < m) {
			while(i < m) {
				newArray[curr++] = nums1[i++];
			}
		}
		
		if(j < n) {
			while(j < n) {
				newArray[curr++] = nums2[j++];
			}
		}
		for(i=0; i< newArray.length; i++) {
			nums1[i] = newArray[i];
		}
	}
}
