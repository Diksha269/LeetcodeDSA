class Solution {
    Integer dp [][];
    public int change(int amount, int[] coins) {
        dp = new Integer[301][5001];
        return solve(coins, amount , coins.length);
    }
    
    public int solve(int [] arr , int amount , int n){
        if(dp[n][amount] != null) return dp[n][amount];
        if(amount == 0) return 1;
        if(n==0 && amount != 0 ) return 0;
            
        if(arr[n-1] <= amount){
            return dp[n][amount] = solve(arr, amount , n-1)+ solve(arr,amount - arr[n-1] , n);
        }
        else return dp[n][amount] = solve(arr, amount , n-1);
    }
}