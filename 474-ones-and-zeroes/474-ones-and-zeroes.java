class Solution {
  public int findMaxForm(String[] strs, int m, int n) {
    
      int len = strs.length;
      
      int[][][] dp = new int[len+1][m+1][n+1];
     for(int i = 1 ; i<= len ; i++){
        int count1=0 , count0=0;
        String str = strs[i-1];
        for(int x=0 ; x<str.length() ; x++){
            if(str.charAt(x)=='1') count1++;
            if(str.charAt(x) == '0') count0++;
        }
        for(int j = 0 ; j<= m ; j++){
            for(int k = 0 ; k<=n ; k++){
                
                if(j-count0>=0 && k-count1>=0)
                    dp[i][j][k]= Math.max(1+dp[i-1][j-count0][k-count1] , dp[i-1][j][k]);
                
                else
                    dp[i][j][k] = dp[i-1][j][k];
                
                
                
                }
            }
        }
    
    return dp[len][m][n];
}
}







     