

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            //insertion must be done
            TreeNode node = new TreeNode(val);
            return node;
        }
        if(root.val > val){
            // move in left subtree
            root.left =  insertIntoBST(root.left, val);
        }
        else{
            //move in right subtree
          root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}