class Solution {
   
    public int maxAreaOfIsland(int[][] grid) {
          int count = 0;
      
        for(int i = 0 ; i< grid.length ; i++){
            for(int j = 0 ; j< grid[0].length ; j++){
                if(grid[i][j] == 1){

                    count = Math.max(  dfs(i,j,grid.length,grid[0].length,grid)  , count);
                   
                  
                }
            }
        }
        return count;
    }
    
   
    public int dfs(int i , int j , int r , int c , int[][] grid ){
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j] == 0 || grid[i][j] == 2 ) return 0;
     
        grid[i][j] = 2;
       
      return 1+ dfs(i,j+1,r,c,grid)+dfs(i+1,j,r,c,grid)+dfs(i-1,j,r,c,grid)+dfs(i,j-1,r,c,grid);
       
    
    }
}