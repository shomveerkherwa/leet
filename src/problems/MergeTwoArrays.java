package problems;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {1,2,3};
		int m = 3;
		int n = 3;
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		mergeByClassic(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
	
	// below logic would fail for the input
	// int[] nums1 = {4,5,6,0,0,0};
	// int[] nums2 = {1,2,3};
	// int m = 3;
	// int n = 3;
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i, j ;
		i = j = 0;
		
		while( i<m && j<n) {
			if(nums2[j] == nums1[i]) {
				i++;
			}
			else if(nums2[j] < nums1[i]) {
				int temp = nums1[i];
				nums1[i] = nums2[j];
				nums2[j] = temp;
				i++;
			}else {
				i++;
			}
		}
		
		// if there are elements left in 2nd array 
		if(j<n) {
			while(j<n) {
				nums1[i++] = nums2[j++];
			}
		}
	}
	
	// below logic would fail for the input
		// int[] nums1 = {1,2,3,0,0,0};
		// int[] nums2 = {2,5,6};
		// int m = 3;
		// int n = 3;
	public static void mergeByShifting(int[] nums1, int m, int[] nums2, int n) {
		int i, j ;
		i = j = 0;
		
		// nums1 empty space indicator
		int space = m;
		
		while( i<m && j<n) {
			if(nums1[i] > nums2[j]) {
				nums1[space++]  = nums1[i];
				nums1[i] = nums2[j];
			}
			i++;
			j++;
		}
		
		// if there are elements left in 2nd array 
		if(j<n) {
			while(j<n) {
				nums1[i++] = nums2[j++];
			}
		}
	}
	
	public static void mergeByClassic(int[] nums1, int m, int[] nums2, int n) {
		int i, j , k ;
		i = j = k = 0;
		
		int result[] = new int[m+n];
		// nums1 empty space indicator
		int space = m;
		
		while( i<m && j<n) {
			if(nums1[i] > nums2[j]) {
				result[k++]  = nums2[j++];
			} else {
				result[k++]  = nums1[i++];
			}
		}
		
		// if there are elements left in 1st array 
		if(i < m) {
			while(i<m) {
				result[k++] = nums1[i++];
			}
		}
		
		// if there are elements left in 2nd array 
		if (j < n) {
			while (j < n) {
				result[k++] = nums2[j++];
			}
		}
		
		//copy result into nums1;
		i = k = 0;
		while(i<nums1.length) {
			nums1[i++] = result[k++];
		}
	}
}
