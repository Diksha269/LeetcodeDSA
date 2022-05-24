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
import java.util.Collections;
class Solution {
 
      
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        boolean leftToRight = true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
           
            List<Integer> list = new ArrayList<>(size);
            for(int i = 0 ; i<size ; ++i){
                TreeNode curr = q.poll();
                
                    list.add(curr.val);
                
                if(curr.left != null){
                    q.add(curr.left);
                    
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
                if(!leftToRight){
                 Collections.reverse(list);
                    
                }
            leftToRight = !leftToRight;
            ans.add(list);
        }
        
        return ans;
    }
}