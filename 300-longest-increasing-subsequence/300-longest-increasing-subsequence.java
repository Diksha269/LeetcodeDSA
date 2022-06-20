class Solution {
    int [] dp ;
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp , -1);
        int ans = 0;
      for(int i = nums.length - 1 ; i>=0 ; i--){
          ans = Math.max(ans ,solve(nums, i));
      }
        return ans;
    }
    
    public int solve(int [] arr , int n){
        if(dp[n] != -1) return dp[n];
        int ans = 1;
        for(int j = 0 ; j < n ; j++){
            if(arr[j] < arr[n]){
                ans = Math.max(ans , 1+solve(arr,j));
            }
        }
        return dp[n] = ans;

    }
}