class Solution {
    public int longestContinuousSubstring(String s) {
       int n = s.length();
        int count = 1,res = 1;
       for(int i = 1 ; i<n ; i++){
           if(s.charAt(i) - s.charAt(i-1) == 1) count++;
           else{
               res = Math.max(res , count);
               count = 1;
               
           }
       }
        res = Math.max(res , count);
        return res;
        
}
}