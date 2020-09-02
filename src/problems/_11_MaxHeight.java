package problems;

public class _11_MaxHeight {

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int quantity = getMaxQuantity(height);
		System.out.println(quantity);
	}

	private static int getMaxQuantity(int[] height) {
		int max = Math.min(height[0], height[1]) * 1;

		for (int i = 0; i < height.length -1 ; i++) {
			for(int j = i+1; j< height.length; j++) {
				int currentMax = Math.min(height[i], height[j]) * (j - i);
				max = max < currentMax ? currentMax : max;
			}
		}
		return max;
	}
}
