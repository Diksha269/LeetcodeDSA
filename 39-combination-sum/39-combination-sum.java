class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        solve(candidates, target , ans ,0 );
        return result;
    }
    
    
    public void solve(int [] nums , int target , List<Integer> ans , int idx){
      if(target == 0){
         result.add(new ArrayList<Integer>(ans));
          return;
      }
        if(idx == nums.length){
            return;}
        if(target < 0) {
            
            return;}
      
          ans.add(nums[idx]);
          solve(nums, target-nums[idx] ,ans,idx );
          ans.remove(ans.size()-1);
          solve(nums, target,ans,idx+1 );
        
    
        
    
   }
}