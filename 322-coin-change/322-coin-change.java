class Solution {
    //int memo[][];
    public int coinChange(int[] coins, int amount) {
//         memo = new int[coins.length
// +1][amount+1];
//         for(int i = 0 ; i<=coins.length ; i++){
//             for(int j = 0 ; j<=amount ; j++){
//                 memo[i][j]=-1;
//             }
//         }
        int ans = solve(coins, amount, coins.length);
        if(ans >= (int)Math.pow(10,9)) return -1;
        else return ans;
        
        }
    
    public int solve(int[] coins, int amount , int n){
        int dp[][] = new int[coins.length+1][amount+1];
        for(int i = 0 ; i<= coins.length ; ++i){
            dp[i][0]= 0;
        }
        for(int i = 0 ; i<= amount ; i++){
            dp[0][i] = (int)Math.pow(10,9);
        }
        for(int i = 1 ; i<= coins.length ; ++i){
            for(int j = 1 ; j<= amount ; ++j){
                //
                if(coins[i-1]<= j){
                    dp[i][j]= Math.min(dp[i-1][j] , 1+dp[i][j-coins[i-1]]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
        
    }
}
    
//     public int solve(int[] coins, int amount ){
//     if(memo[amount] != -1) return memo[amount];
//       int ans = (int)Math.pow(10,5); 
//       if(amount == 0) return 0;
//       for(int i = 0; i<coins.length; ++i){
//           // include
//           int include = 0;
//           if(coins[i]<= amount){
//               include= 1+solve(coins , amount - coins[i]);
//               ans = Math.min(ans , include);
              
//           }
              
//           }
       
//         return memo[amount]=ans;
//     }
    
//     public int solve(int [] coins , int amount , int n ){
//       if(memo[n][amount] != -1) return memo[n][amount];
        
//         if(amount == 0) return 0;
        
//          if(n == 0) 
//         // if(amount%coins[0] == 0) return amount/coins[0];
//         return (int)Math.pow(10,9);
    
//         //take 
//         int take = (int)Math.pow(10,9); 
//         if(coins[n-1]<= amount) take = 1+solve(coins , amount - coins[n-1] , n);
//         int nottake = solve(coins , amount , n-1);
        
//         return memo[n][amount]=Math.min(take , nottake);
        
//     }
// }