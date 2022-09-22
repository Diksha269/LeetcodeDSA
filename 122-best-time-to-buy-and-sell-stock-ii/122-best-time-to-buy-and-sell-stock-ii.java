class Solution {
   
    Integer dp[][];
    public int maxProfit(int[] arr) {
  
        dp = new Integer[30001][2];
        return solve(arr , 0 , 1);
        
    }
  
    public int solve(int arr[] , int idx , int buy  ){
     
        if(dp[idx][buy] != null) return dp[idx][buy];
        if(idx == arr.length) return 0;
        int take=0;
        int notTake = 0; 
        int profit = 0;
        if(buy == 1){

            take =  -arr[idx]+solve(arr, idx+1 , 0);
             notTake = 0+solve(arr , idx+1 , 1);

              profit = Math.max(take , notTake);
        }
        else{


          take =  arr[idx]+solve(arr, idx+1 , 1);
          notTake = 0+solve(arr , idx+1 , 0);
          profit = Math.max(take , notTake);


        }
        return dp[idx][buy] = profit;
    }
}

// 7,1,5,3,6,4