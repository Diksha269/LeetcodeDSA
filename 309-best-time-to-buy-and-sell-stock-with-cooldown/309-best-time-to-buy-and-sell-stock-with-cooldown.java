class Solution {
  Integer dp[][];
    public int maxProfit(int[] prices) {
      dp = new Integer[5001][100];
        int n = prices.length;
        int max = 0;
        for(int i = 0 ; i< n ; i++){
            max = Math.max(max ,solve(prices, 1 , i ));
            // System.out.println(max);
        }
        
        
        return max;
    }
    // 1 -> buy
    // 2
    //3
    public int solve(int [] arr , int choices, int i ){
      if(dp[i][choices] != null) return dp[i][choices] ;
        if(i==arr.length-1) {
         
            return 0;}
        
        int ans = 0;
        if(choices == 1){
        
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[i]<arr[j]) {
                    int pro = arr[j]-arr[i];
                    ans = Math.max(pro+solve(arr ,2 ,j),ans);
                  
            }
            }
            
        }
        else if(choices == 2) 
        {
           
            if(i+1 < arr.length)
            ans = Math.max(solve(arr, 3,i+1),ans);
            
        }
        else if(choices == 3){
            for(int j = i+1 ; j<arr.length ; j++){
               ans= Math.max(ans,solve(arr, 1,j));
                
            }
           
        }
        return  dp[i][choices] = ans; 
    }
}