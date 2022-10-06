class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int low = 0;
        int high = nums.length-1;
        while(low<high)
        {
            int x = nums[low] + nums[high];
            if( x == target){
                ans[0] = low+1;
                ans[1] = high + 1;
                break;
            }
            else if(x<target) low = low + 1;
            else high = high - 1;

            
        }
        return ans;
        
    }
}


//[2,7,11,15]
// again pair
// total valid pairs will be 4*3*2*1
//(n-1)! 


