package problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class NumberDisappearedInArray {

	public static void main(String[] args) {
		//int nums[] = {4,3,2,7,8,2,3,1};
		int nums[] = {3, 4, -1, 1};
		for(int i=0; i< nums.length; i++){
            int index = Math.abs(nums[i]) -1;
            // if the number is a duplicate, a negative number wil be flipped to positive because 
            // of multiplication. And hence we check if the number is already negative, and if yes
            // we do not touch it.
            if(nums[index] > 0)
            	nums[index] = nums[index] * -1;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0)
                result.add(i+1);
        }
        
        result.stream().forEach(i -> System.out.println(i));
	}

}
