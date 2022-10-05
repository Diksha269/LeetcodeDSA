class Solution {
    public int numIdenticalPairs(int[] nums) {
    HashMap<Integer,Integer>map = new HashMap<>();
        int ans = 0;
        //finding the frequency of each element
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            int k = entry.getValue();
            if(k >1){
                count = (k*(k-1))/2;
                ans+=count;
            }
        }
        return ans;
        
    }
}
