class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<String>();
        for(String str : wordDict){
            set.add(str);
        }
        
        int dp[] = new int [s.length()];
        if(set.contains(s.substring(0,1))) dp[0]  = 1;
        else dp[0] = 0;
        for(int i = 1 ; i<s.length() ; i++){
            for(int j = 0 ; j<=i ; j++){
                if(j>0 && dp[j-1] == 1 && set.contains(s.substring(j,i+1))){
                   dp[i] = 1;
                  
                    
                }
                if(j==0 && set.contains(s.substring(j,i+1))){
                   dp[i] = 1;
                  
                    
                }
                
                
            }
        }
        return dp[s.length()-1]>0;
        
    }
}
