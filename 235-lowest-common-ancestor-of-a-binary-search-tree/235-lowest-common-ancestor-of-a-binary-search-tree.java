/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode left = null ; TreeNode right = null;
        if(root == null) return null;
        if(root == p || root == q)
            return root;
        if(root.val > p.val || root.val > q.val){
        left = lowestCommonAncestor(root.left , p , q);
        }
        if(root.val < p.val || root.val < q.val){
        right = lowestCommonAncestor(root.right , p , q);}
        if(left != null && right != null) return root;
        else{
        TreeNode ans = left == null ? right : left ;
        return ans;
        }
    }
}