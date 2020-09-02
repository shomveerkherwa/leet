package problems;

public class _11_MaxHeight2 {
	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int quantity = getMaxQuantity(height);
		System.out.println(quantity);
	}

	private static int getMaxQuantity(int[] height) {
		int max = 0;
		int left = 0;
		int right = height.length - 1;
		int currentMax = 0;
		while (left < right) {
			currentMax = Math.min(height[left], height[right]) * (right - left);
			max = max < currentMax ? currentMax : max;
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}
}
