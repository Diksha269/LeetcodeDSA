class Solution {
    // using backtracking
    // int count= 0;
    int [][] dp;
    public int findTargetSumWays(int[] nums, int target) {
    
        return solve(nums , target , nums.length);
       
    }
    
    public int solve(int [] nums , int target , int n){
       
        if(n==0 && target == 0) return 1; // got the required combination
        if(n==0 && target != 0) return 0; // did not got
        int pos = nums[n-1];
        int ans1 =  solve(nums, target - pos, n-1); // taking as positive
        int neg = -nums[n-1];
        int ans2 = solve(nums, target - neg, n-1);  // taking as negative
        return   ans1+ ans2;
        
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     //[1,1]
//     public void targetSum(int [] nums , int target , int sum , int i){
//         if(i == nums.length && sum == target) {
//             count++;
//             return;
//         }
//         if(i==nums.length) return;
//         targetSum(nums , target , sum - nums[i] , i+1);
//         targetSum(nums , target , sum + nums[i] , i+1);
        
        



      