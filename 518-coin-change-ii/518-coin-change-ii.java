class Solution {
    Integer dp [][];
    public int change(int amount, int[] coins) {
        dp = new Integer[301][5001];
        return solveWithTabulation(coins, amount );
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
    
    public int solveWithTabulation(int [] arr , int amount){
        int n = arr.length;
        int [][] dp = new int[n+1][amount+1];
        // dp[i][j] -> total unique ways of getting j amount with i coins
        
        dp[0][0] = 1;
        for(int i = 1 ; i<= n ; i++){
            dp[i][0] = 1;
        }
        for(int i = 1 ; i<= amount ; i++){
            dp[0][i] = 0;
        }
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<= amount; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
        
        
    }
}