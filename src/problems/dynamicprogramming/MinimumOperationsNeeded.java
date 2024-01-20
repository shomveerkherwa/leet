package problems.dynamicprogramming;

import java.util.Arrays;

public class MinimumOperationsNeeded {

	public static void main(String[] args) {
		//String current = "02:30"; String correct = "04:35";
		String current = "00:00"; String correct = "23:59";
		
		System.out.println(convertTime(current, correct));
	}

	public static int convertTime(String current, String correct) {
		int[] currentArray = getIntArray(current);
		int currentMinutes = getMinutes(currentArray);
		int[] correctArray = getIntArray(correct);
		int correctMinutes = getMinutes(correctArray);
		int[] inp = {60,5,1};
		//return countToMakeEqual(inp, currentMinutes, correctMinutes);
		int amount = correctMinutes-currentMinutes;
		int[] dp = new int[amount+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		//return countToMakeEqual2(inp, amount, dp);
		return countToMakeEqualWithoutDp(inp, amount);
	}

	private static int countToMakeEqual2(int[] inp, int amount, int[] dp) {
		if(amount < 0) {
			return Integer.MAX_VALUE;
		}
		
		if(amount == 0)
			return 0;
		
		if(dp[amount] != -1)
			return dp[amount];
		
		int minCount = Integer.MAX_VALUE;
		for(int i=0; i< inp.length; i++) {
			int count = countToMakeEqual2(inp, amount-inp[i], dp);
			
			if(count != Integer.MAX_VALUE && count+1 < minCount) {
				minCount = Math.min(count+1,  minCount);
			}
		}
		dp[amount] = minCount;
		return minCount;
	}
	
	private static int countToMakeEqualWithoutDp(int[] inp, int amount) {
		if(amount < 0) {
			return Integer.MAX_VALUE;
		}
		
		if(amount == 0)
			return 0;
		
		int minCount = Integer.MAX_VALUE;
		for(int i=0; i< inp.length; i++) {
			int count = countToMakeEqualWithoutDp(inp, amount-inp[i]);
			
			if(count != Integer.MAX_VALUE && count+1 < minCount) {
				minCount = Math.min(count+1,  minCount);
			}
		}
		return minCount;
	}
	
	private static int countToMakeEqual(int[] inp, int current, int correct) {
		if(current == correct)
			return 0;
		if(current > correct) {
			return Integer.MAX_VALUE;
		}
		int minCount = Integer.MAX_VALUE;
		for(int i=0; i< inp.length; i++) {
			int count = countToMakeEqual(inp, current+inp[i], correct);
			
			if(count != Integer.MAX_VALUE && count+1 < minCount) {
				minCount = Math.min(count+1,  minCount);
			}
		}
		return minCount;
	}

	private static int getMinutes(String inp) {
		String[] split = inp.split(":");
		return Integer.parseInt(split[0])*60 + Integer.parseInt(split[1]);
	}
	private static int[] getIntArray(String inp) {
		String[] split = inp.split(":");
		int[] result = new int[split.length];
		int i=0;
		for(String c : split) {
			result[i++]=Integer.parseInt(c);
		}
		return result;
	}

	private static int getMinutes(int[] inp) {
		return 60*inp[0]+inp[1];
	}
}
