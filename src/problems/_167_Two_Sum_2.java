package problems;

import java.util.Arrays;
// NOTE: This algo was rejected because of time complexity.
public class _167_Two_Sum_2 {

	public static void main(String[] args) {
		int[] numbers = {-1,0};
		int target = -1;
		int[] output = twoSum(numbers, target);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(output));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        
        for(int i=0; i< numbers.length-1; i++) {
        	
        	for(int j=i+1; j< numbers.length; j++) {
        		if(numbers[i] + numbers[j] == target) {
        			output[0] = i+1;
        			output[1] = j+1;
        		}
        	}
        }
        
        return output;
    }
}
