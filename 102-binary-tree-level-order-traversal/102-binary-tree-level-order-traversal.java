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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> innerans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode>bfs = new LinkedList<>();
        bfs.add(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            while(size-- > 0){
                TreeNode curr = bfs.poll();
                innerans.add(curr.val);
                if(curr.left != null){
                    bfs.add(curr.left);
                }
                if(curr.right != null){
                    bfs.add(curr.right);
                }
            }
            
            ans.add(new ArrayList(innerans));
            innerans = new ArrayList<>();
        }
        return ans;
    }
}