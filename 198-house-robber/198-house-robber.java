class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length +1];
        Arrays.fill(memo,-1);
       return rob(nums , nums.length ); 
    }
    
    public int rob(int [] nums , int n){
        int[] dp = new int[n+1];
        //dp[i] means maximum amount stolen when size of nums is i.
        dp[0] = 0; // when nums is empty
        for(int i = 1 ; i<= n ; i++){
            int include = nums[i-1];
            if(i>1) include = nums[i-1] + dp[i-2];
            dp[i] = Math.max(dp[i-1] ,include );
            
        }
        return dp[n];
    }
}
    
    
    
    
    
//     // returns the maximum amount upto n;
//     public int rob(int [] nums , int n){
//         if(memo[n]!= -1) return memo[n];
//         if(n==0) return 0;
//         int include = nums[n-1];
//         if(n>2){
//          include = nums[n-1]+rob(nums , n-2); // if curr idx is included that means , n-1 can't be included 
//         }
//         int notinclude = rob(nums, n-1);
//         return memo[n]= Math.max(include ,notinclude);
//     }
// }