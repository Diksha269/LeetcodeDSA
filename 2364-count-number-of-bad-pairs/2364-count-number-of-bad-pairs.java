class Solution {
    public long countBadPairs(int[] nums) {
        long res = 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int prev= map.getOrDefault(i-nums[i] , 0);
            res += prev;
            map.put(i-nums[i] , prev+1);
        }
        return (long)nums.length*(nums.length-1)/2 - res;
    }
}