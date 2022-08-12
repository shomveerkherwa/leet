package problems;

import java.util.Arrays;

public class PrintElementFromBothEndInSingleLoop {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8};
		int size = nums.length;
		System.out.println(Arrays.toString(nums));
		for(int i=1; i<size; i++) {
			System.out.print(nums[i] +"\t");
			System.out.print(nums[size-1-i]);
			System.out.println();
		}

	}

}
