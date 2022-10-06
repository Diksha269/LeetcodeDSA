class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long total = n*(n-1)/2;
        HashMap<Integer,Integer>map = new HashMap<>();
        long ans = 0;
        for(int j = 0 ; j<n ; j++){
            int curr = j-nums[j];
            if(map.containsKey(curr)){
                ans+=map.get(curr);
              
                
            }
           map.put(curr,map.getOrDefault(curr,0)+1);
        }
       return (long)nums.length*(nums.length-1)/2 - ans;
    
    }
}