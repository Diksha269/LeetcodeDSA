class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int[nums.length +1];
        Arrays.fill(memo,-1);
       return rob(nums , nums.length ); 
    }
    
    public int rob(int [] nums , int n){
        if(memo[n]!= -1) return memo[n];
        if(n==0) return 0;
        int include = nums[n-1];
        if(n>2){
         include = nums[n-1]+rob(nums , n-2);
        }
        int notinclude = rob(nums, n-1);
        return memo[n]= Math.max(include ,notinclude);
    }
}