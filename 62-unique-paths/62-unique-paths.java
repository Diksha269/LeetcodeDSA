class Solution {
    
    Integer dp [][];
    public int uniquePaths(int m, int n) {
        dp = new Integer[m+1][n+1];
        return solve(0, 0, m , n);
       
    }
    public int solve(int row , int col , int m , int n  ){
        if(dp[row][col] != null) return dp[row][col];
        if(row == m-1 && col == n-1){
           
            return 1;
        } 
         int right = 0 , down = 0;
        if(row < m && row >= 0 && col < n && col >= 0){
           
            right =  solve(row , col+1 , m , n);
            
            
            down =   solve(row+1 , col , m , n);
            return dp[row][col] = down+right;
            
        }
        else{
            return 0;
        }
        
        
    }
}