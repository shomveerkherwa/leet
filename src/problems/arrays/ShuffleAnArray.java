package problems.arrays;

import java.util.Random;

public class ShuffleAnArray {

	int[] nums;
	 Random rand;

	 public ShuffleAnArray(int[] nums) {
	        this.nums = nums;
	        this.rand = new Random();
	 }
	    
	    public int[] reset() {
	        return nums;
	    }
	    
	    public int[] shuffle() {
		    int[] shuffNum = nums.clone();
		    for(int i=0; i<nums.length; i++) {
		    	int random = (int)(Math.random()*(nums.length - i)) + i;
				int temp = shuffNum[i];
		    	shuffNum[i] = shuffNum[random];
		    	shuffNum[random] = temp;
		    }
		    
		    return shuffNum;
	    }
}
