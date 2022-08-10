class Solution {
    
    long dp[][] ;
    
    public int numRollsToTarget(int n, int k, int target) {
       dp = new long[30+1][1000+1];
        for(int i = 0 ; i<= 30; i++){
            for(int j = 0 ; j<= 1000 ; j++){
                dp[i][j]=-1;
            }
        }
        int ans = (int) solve(n , k , target);
        return ans;
    }
    public long solve(int n, int k, int target){
        
    
        if(dp[n][target] != -1) return dp[n][target];
        if(n==0 && target ==0) return 1;
        if(n==0 && target !=0) return 0;
        
        long ans = 0;
        for(int i = 1 ; i<= k ; ++i){
            
           if(target-i>=0) ans = ans + solve(n-1 , k , target - i);
           else break;
        }
        
        return dp[n][target] = ans % 1000000007;
    }
    
    
}