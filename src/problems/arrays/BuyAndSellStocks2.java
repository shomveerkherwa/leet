package problems.arrays;

public class BuyAndSellStocks2 {

	public static void main(String[] args) {
		//int[] prices = {7,1,5,3,6,4};
		int[] prices = {1,2,3,4,5,6};
		int maxProfit = getMaxProfitThatCanBeAchieved(prices);
		System.out.println("maxProfit "+maxProfit);
	}

	private static int getMaxProfitThatCanBeAchieved(int[] prices) {
		int maxProfit = 0;
		if(prices == null || prices.length < 2)
			return maxProfit; 	// 0
		for(int i=1; i < prices.length; i++) {
			if(prices[i] > prices[i-1]) {
				maxProfit += prices[i] - prices[i-1];
			}
		}
		return maxProfit;
	}

} 
