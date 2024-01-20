package revision;

import java.util.Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		//int[] height = {1,8,6,2,5,4,8,3,7};
		int[] height = {2,3,4,5,18,17,6};
		System.out.println(Arrays.toString(height));
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int area = 0;
		
		int left  = 0;
		int right = height.length - 1;
		
		while(left < right) {
			int length = Math.min(height[left], height[right]);
			int breadth = right - left;
			area = Math.max(area,   length*breadth);
			
			if(height[left] <=height[right])
				left++;
			else 
				right--;
		}
		return area;
    }
}
