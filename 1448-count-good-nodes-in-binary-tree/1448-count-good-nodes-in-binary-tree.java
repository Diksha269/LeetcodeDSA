/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(root.val);
        if(root.left == null && root.right == null) return 1;
        solve(root , list);
        return count;
        
    }
    public void solve(TreeNode root , ArrayList<Integer> list ){
        
        if(root == null) return ;
        boolean flag = false;
        for(int i = 0 ; i<list.size() ; i++){
            if(root.val < list.get(i)) {
                flag = true;
                break;
            }
        }
        list.add(root.val);
        if(flag == false) count++;
        solve(root.left,list);
        solve(root.right,list);
        list.remove(list.size()-1);
        
        
    }
}