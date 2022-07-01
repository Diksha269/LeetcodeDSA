

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
        if(memo[x][y] != -1) return memo[x][y];
        
        //base case
        if(x==m-1 && y==n-1) return grid[x][y];
        
        if(x>=0 && x<m && y>=0 && y<n){
            return memo[x][y]=grid[x][y] + Math.min(solve(grid,x+1 , y, m ,n ),solve(grid,x, y+1, m ,n ));}
        
        else return Integer.MAX_VALUE;
    }
}
  