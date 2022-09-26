class Solution {
    public int numSquares(int n) {
        // 1 4 9 16 25 --9801
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i<10000 ; i++){
           int square = (i+1) * (i+1);
            if(square > n) break;
            arr.add(square);
        }
        int size = arr.size();
        int dp[][] = new int[size+1][n+1];
        //dp[i][j] -> i size array to sum upto j
        for(int i = 0 ; i <= size ; i++){
            for(int j = 0 ; j<= n ; j++){
               if(i== 0 && j==0) dp[i][j] = 0;
               else if(i==0 && j>0) dp[i][j] = 1000000007;
               else if(arr.get(i-1) <= j ){
                    dp[i][j] = Math.min(1+dp[i][j-arr.get(i-1)],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[size][n];
        
    }
}