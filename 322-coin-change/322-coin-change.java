class Solution {
    int min = Integer.MAX_VALUE-1;
    int memo[];
    public int coinChange(int[] coins, int amount) {
        memo = new int[amount+1];
        Arrays.fill(memo , -1);
        System.out.println(min);
        int ans = solve(coins, amount);
        System.out.println(ans);
        if(ans >= (int)Math.pow(10,5)) return -1;
        else return ans;
        
        }
    
    public int solve(int[] coins, int amount ){
    if(memo[amount] != -1) return memo[amount];
      int ans = (int)Math.pow(10,5); 
      if(amount == 0) return 0;
      for(int i = 0; i<coins.length; ++i){
          // include
          int include = 0;
          if(coins[i]<= amount){
              include= 1+solve(coins , amount - coins[i]);
              ans = Math.min(ans , include);
              
          }
              
          }
       
        return memo[amount]=ans;
    }
}