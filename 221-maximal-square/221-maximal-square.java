class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        int ans = 0;
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(i==0 || j==0){
                   if(matrix[i][j] == '1') dp[i][j] = 1;
                }
                
                else{
                    
                   if(matrix[i][j] == '1') dp[i][j] =1+ Math.min(dp[i-1][j-1] , Math.min(dp[i-1][j],dp[i][j-1]) );
                }
                
                
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans*ans;
        
        
        
        
    }
}