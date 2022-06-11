class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder , 0 , preorder.length-1 );
    }
    public TreeNode solve( int[] nums , int left , int right){
        
        if(left > right ) return null;
        TreeNode root = new TreeNode(nums[left]);
        if(left == right) return root;
        int mid = right + 1;
        int max = nums[left];
        for(int i = left + 1 ; i <= right ; ++i){
            if(nums[i] > max){
                mid = i;
                break;
            }
        }
        root.left = solve(nums , left + 1 , mid-1);
        root.right = solve(nums , mid , right);
        return root;
    }
}
        
        