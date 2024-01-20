package problems.arrays;

public class Jump5 {

	public static void main(String[] args) {
		int[] arr = {6,4,14,6,8,13,9,7,10,6,12}; int d = 2;
		System.out.println(maxJumps(arr,d));
	}
	
	public static int maxJumps(int[] arr, int d) {
        int maxVisited = 0;
        int[] dp = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
        	maxVisited = Math.max(maxVisited, checkCurrentIndex(arr,d,i,dp));
        }
        return maxVisited;
    }

	private static int checkCurrentIndex(int[] arr, int distance, int index, int[] dp) {
		if(dp[index] != 0)
			return dp[index];
		
		int nodeVisited = 1;
		int decrementedIndex = index - distance;
		int incrementedIndex = index + distance;
		
		// check on left side from current
		for(int i=index-1; i >= Math.max(0, decrementedIndex) && arr[index] > arr[i] ; i--) {
			nodeVisited = Math.max(nodeVisited, 1+ checkCurrentIndex(arr, distance, i, dp));
		}
		
		//check on right side from current
		for(int i=index+1; i <= Math.min(arr.length-1, incrementedIndex) && arr[index] > arr[i]; i++) {
			nodeVisited = Math.max(nodeVisited, 1+ checkCurrentIndex(arr, distance, i, dp));
		}
		dp[index] = nodeVisited;
		return nodeVisited;
	}
}
