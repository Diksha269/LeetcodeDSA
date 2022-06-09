/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        root.next = null;
        while(!q.isEmpty()){
            int size = q.size();
            while(size  > 0){
                Node curr = q.poll();
                if(curr.left != null){
                    curr.left.next = curr.right;
                    q.add(curr.left);
                }
                if(curr.right != null && size == 1){
                    curr.right.next = null;
                    q.add( curr.right);
                }
                if(curr.right != null && size != 1 ){
                   curr.right.next = q.peek().left;
                   q.add( curr.right);
              }
                 size--;
            }
           
        }
        return root;
    }
}