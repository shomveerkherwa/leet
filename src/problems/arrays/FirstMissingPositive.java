package problems.arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		//int[] nums = { 3, 4, -1, 1 };
		int[] nums = { 1, 2, 3 };
		//int[] nums = {7,8,9,11,12};
		//int[] nums = {1};
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		int size = nums.length;
		
		for (int i = 0; i < size; i++) {
			int val = nums[i];
			if (val <= 0 || val > size)
				nums[i] = size+1;
		}
		
		for (int i = 0; i < size; i++) {
			int index = Math.abs(nums[i])-1;
			if(index < size && nums[index] > 0 )
				nums[index] = nums[index] * -1;
		}
		
		for (int i = 0; i < size; i++) {
            if(nums[i] > 0)
            	return i+1;
		}
		
		return size+1;
    }
}
