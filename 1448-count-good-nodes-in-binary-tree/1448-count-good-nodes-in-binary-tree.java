class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        if(root.left == null && root.right == null) return 1;
        solve(root , root.val);
        return count;
        
    }
    public void solve(TreeNode root , int maxSoFar ){
        
        if(root == null) return ;
        if(maxSoFar <= root.val) {
            maxSoFar = root.val;
            count++;
        }
        
        solve(root.left,maxSoFar);
        solve(root.right,maxSoFar);
         
    }
}