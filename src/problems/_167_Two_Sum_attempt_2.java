package problems;

import java.util.Arrays;
// NOTE: This algo was rejected because of time complexity.
public class _167_Two_Sum_attempt_2 {

	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] output = twoSum(numbers, target);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(output));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int low = 0; int high = numbers.length-1;
        while (low < high) {
        	int sum = numbers[low] + numbers[high];
    		if (sum < target) {
				low++;
			} else if (sum > target) {
				high--;
			} else if (sum == target) {
				output[0] = low + 1;
				output[1] = high + 1;
				break;
			}
		}
        return output;
    }
}
