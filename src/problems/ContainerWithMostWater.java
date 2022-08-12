package problems;

import java.util.Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {3,9,3,4,7,2,12,6};
		int maxArea = maxArea(height);
		System.out.println(Arrays.toString(height) +" ----> "+maxArea);
	}
	
	public static int maxArea(int[] height) {
        int maxArea = 0;
        if(height == null || height.length < 2) {
        	return maxArea;
        }
        
        int left = 0;
        int right = height.length - 1;
        maxArea = Math.min(height[left], height[right])* (right-left);
        
        while(left < right) {
        	maxArea = Math.max(maxArea, Math.min(height[left], height[right])* (right-left));
        	if(height[left]< height[right]) {
        		left++;
        	}else {
        		right--;
        	}
        }
        return maxArea;
    }
}
