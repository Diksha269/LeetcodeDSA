class Solution {
    Integer [][] dp;
    public int maxProfit(int[] arr) {
    dp = new Integer[30001][2];
    int max = 0;
    for(int i = 0 ; i<arr.length ; i++){
        max = Math.max(max , solve(arr ,  i , 1));
        
    }
        return max;
       
        
    }
  
    public int solve(int arr[] , int idx , int buy ){
       if(dp[idx][buy] != null) return dp[idx][buy];
        // System.out.println(idx);
        if(idx == arr.length - 1) return 0;
        
        int ans = 0;
        if(buy == 1){
           for(int i = idx + 1; i<arr.length ; i++){
               if(arr[i]>arr[idx]){
                int pro = arr[i]-arr[idx];
                ans = Math.max(ans,pro+solve(arr, i , 0));
           }
           }
        }
        else{
            // we need to buy
          for(int i = idx + 1; i<arr.length ; i++){
              ans =  Math.max(ans,solve(arr, i , 1));
           }
        }
        return dp[idx][buy]= ans;
        
    }
}

// 7,1,5,3,6,4