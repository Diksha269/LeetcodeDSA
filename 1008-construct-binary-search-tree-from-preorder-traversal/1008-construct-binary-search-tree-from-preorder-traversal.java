class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return solve(preorder , 0 , preorder.length-1 );
    }
    public TreeNode solve( int[] nums , int left , int right){
// if right subtree do not exist ..that means only left subtree is there
// so pass left to right as there is no mid
        
// if left subtree do not exist ...means mid is there left will become greater than right as right is passed as mid - 1 and we will return null
    
// if left and right is same means only single element is there ..no left or right subtree exists

// mid refers to start of right subtree
        
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
        
        