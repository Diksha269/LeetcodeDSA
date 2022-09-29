class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
         res = new ArrayList<String>();
         solve(n,n,"");
        return res;
        
        

    }
  
    public void solve(int open , int close,String ans){
        if(open<0 || close < 0) return;
        if(open == 0 && close == 0){
        System.out.println(validOrNot( ans));
            if(validOrNot( ans) == true) {
               
                res.add(ans);
                return;
            }
            return;
        }
        solve(open-1,close, ans+'(');
        solve(open , close-1 , ans+')');
        return;
        
        
    }
    public boolean validOrNot(String ans){
        //(())
        Stack<Character> st = new Stack<>();
        // st.push(ans.charAt(0));
        int i = 0, n = ans.length();
        while( i<n){
            char ch = ans.charAt(i);
            if(ch == ')'){
                if(st.size()>0 && st.peek() == '('){
                    st.pop();
                }
                else st.push(ch);
            }
            else st.push(ch);
            i++;
            
        }
        if(st.size() == 0 && i==n) return true;
        else return false;
        
    }
    
}





