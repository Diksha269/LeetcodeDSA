class Solution {
    
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int profit = 0;
        int minSoFar = arr[0];
        for(int i = 1 ; i<n ; i++ ){
         
               profit =Math.max(profit,(arr[i]-minSoFar));
        
               minSoFar = Math.min(minSoFar , arr[i]);
            
        }
        return profit;
    }}
    
   


