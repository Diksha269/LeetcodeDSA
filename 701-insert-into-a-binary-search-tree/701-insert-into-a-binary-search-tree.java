

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            //insertion must be done
            TreeNode node = new TreeNode(val);
            return node;
        }
      TreeNode curr = root;
      while(curr != null){
          if(curr.val > val){
              // move in left subtree
              if(curr.left == null){
                  curr.left = new TreeNode(val);
                  return root;
              }
              else{
                  curr = curr.left;
              }
          }
          
          else{
              // move in right subtree
                if(curr.right == null){
                  curr.right = new TreeNode(val);
                  return root;
              }
              else{
                  curr = curr.right;
              }
          }
      }
        return null;
    }
}