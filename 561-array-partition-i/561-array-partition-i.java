class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i< n ; i+=2){
            sum = sum+ nums[i];
        }
            
        return sum;
    }
}