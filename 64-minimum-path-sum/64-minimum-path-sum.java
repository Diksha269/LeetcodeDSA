class Solution {
   int[][] memo;
    public int minPathSum(int[][] grid) {
        memo = new int[201][201];
        for(int i = 0 ; i<memo.length ; ++i){
            for(int j = 0 ; j<memo[0].length ; j++ ){
                memo[i][j] = -1;
            }
        }
        return (solve(grid ,0 , 0 ,  grid.length, grid[0].length ));
    }
    
    public int solve(int[][] grid , int x , int y , int m , int n){
        int [][] dp = new int[m][n];
        dp[0][0] = grid[0][0]; // minimum path to reach 0,0 from 0,0
        for(int i = 1 ; i<m ; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j = 1 ; j<n ; ++j){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for(int i = 1 ; i<m ; ++i){
            for(int j = 1 ; j<n ; ++j){
                dp[i][j] = grid[i][j]
                    +Math.min(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
       
    }
}
  