package problems.dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumCoinNeeded {
	
	
	public static void main(String[] args) {
		//int[] coins = { 1, 2, 5 }; int amount = 11;
		int[] coins = { 2 }; int amount = 3;
		
		System.out.println(coinChange(coins, amount));
		System.out.println(coinChangeDPArray(coins, amount));
	}
	
	static Map<Integer,Integer> map = new HashMap<>();
	
	// below method uses map as a DP memo
	public static int coinChange(int[] coins, int amount) {
		if(amount == 0)
			return 0;
		if(amount < 0) {
			return Integer.MAX_VALUE;
		}
		if(map.get(amount) != null) {
			return map.get(amount);
		}
		int minCoins = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int ans = coinChange(coins, amount- coins[i]);
			
			if(ans != Integer.MAX_VALUE && ans+1 < minCoins) {
				minCoins = Math.min(minCoins, ans+1);
			}
		}
		map.put(amount, minCoins);
		return minCoins;
	}
	
	 
	// below method uses map as a DP memo
	public static int coinChangeDPArray(int[] coins, int amount) {
		int[] dp = new int[amount+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		int count = countMinCoins(coins, amount, dp);
		
		return count == Integer.MAX_VALUE ? -1 : count;
	}


	private static int countMinCoins(int[] coins, int amount, int[] dp) {
		if(amount < 0) {
			return Integer.MAX_VALUE;
		}
		
		if(dp[amount] != -1)
			return dp[amount];
		
		int minCoins = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int currCoins = countMinCoins(coins, amount-coins[i], dp);
			
			if(currCoins != Integer.MAX_VALUE && currCoins+1 < minCoins) {
				minCoins = currCoins+1;
			}
		}
		dp[amount] = minCoins;
		return dp[amount];
	}
	
}
