package problems.dynamicprogramming;

import java.util.Arrays;

public class KnapSack {

	public static void main(String[] args) {
		int bagCapacity = 10;
        int n = 4;
        int[] value = {10, 40, 30, 50};
        int[] weight = {5, 4, 6, 3};

        // Populate base cases
        int[][] matrix = new int[n + 1][bagCapacity + 1];
        for (int column = 0; column < bagCapacity + 1; column++) {
            matrix[0][column] = 0;
        }
        for (int row = 0; row < n + 1; row++) {
            matrix[row][0] = 0;
        }
        
        // Main logic
        for (int item = 1; item <= n; item++) {
        	
            for (int capacity = 1; capacity <= bagCapacity; capacity++) {
                int maxValWithoutCurr = matrix[item - 1][capacity]; // This is guaranteed to exist
                int maxValWithCurr = 0; // We initialize this value to 0
                
                int currentWeight = weight[item - 1]; // We use item -1 to account for the extra row at the top
                if (capacity >= currentWeight) { // We check if the knapsack can fit the current item
                    maxValWithCurr = value[item - 1]; // If so, maxValWithCurr is at least the value of the current item
                    
                    int remainingCapacity = capacity - currentWeight; // remainingCapacity must be at least 0
                    maxValWithCurr = maxValWithCurr + matrix[item - 1][remainingCapacity]; // Add the maximum value obtainable with the remaining capacity
                }
                
                matrix[item][capacity] = Math.max(maxValWithoutCurr, maxValWithCurr); // Pick the larger of the two
            }
            
        }
        System.out.println(matrix[n][bagCapacity]); // Final answer
        System.out.println(Arrays.deepToString(matrix)); // Visualization of the table
	}

}
