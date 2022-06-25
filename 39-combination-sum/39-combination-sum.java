class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        solve(candidates, target , ans ,0 );
        return result;
    }
    
    
    public void solve(int [] nums , int target , List<Integer> ans , int idx){
      if(target == 0){
          // storing in result only when target has become zero
         result.add(new ArrayList<Integer>(ans));
          return;
      }
        if(idx == nums.length || target < 0) return;
        
          solve(nums, target,ans,idx+1 );
          if(target>= nums[idx]){
          ans.add(nums[idx]);
          solve(nums, target-nums[idx] ,ans,idx);
          ans.remove(ans.size()-1); // backtrack 
          }
    
   }
}