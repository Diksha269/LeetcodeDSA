class Solution {
    private int maxProfit(int index, int stock, int[] prices, int[][] dp) {
        if (index >= prices.length) {
            return 0;
        }
        
        if (dp[stock][index] != -1) {
            return dp[stock][index];
        }
        
        if (stock == 0) {
            dp[stock][index] = Math.max(
                maxProfit(index + 1, 1, prices, dp) - prices[index],
                maxProfit(index + 1, 0, prices, dp)
            );
        } else {
            dp[stock][index] = Math.max(
                maxProfit(index + 2, 0, prices, dp) + prices[index],
                maxProfit(index + 1, 1, prices, dp)
            );
        }
        return dp[stock][index];
    }
    
    public int maxProfit(int[] prices) {
        int[][] dp = new int[2][prices.length];
        for(int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return maxProfit(0, 0, prices, dp);
    }
}