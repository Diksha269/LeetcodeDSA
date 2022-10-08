class Solution {
    int [] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new int [1000];
        Arrays.fill(dp,-1);
        return solve(days, costs, days[0]);
    }
    
    public int solve(int [] nums , int [] costs , int day){
        if(dp[day] != -1) return dp[day];
        
         if( search(nums,day) == -1 && UpperBound(nums,day) == -1) return 0;
     
       
         if(search(nums,day) == -1){
            int x = UpperBound(nums,day);
            return dp[day]=Math.min(costs[0]+solve(nums, costs , nums[x]+1),Math.min(costs[1]+solve(nums,costs,nums[x]+7),
        costs[2]+solve(nums,costs,nums[x]+30)));
        }
        else return  dp[day]= Math.min(costs[0]+solve(nums, costs , day+1),Math.min(costs[1]+solve(nums,costs,day+7),
        costs[2]+solve(nums,costs,day+30)));
       
    }
    
  
    public  int UpperBound(int a[], int x) {// x is the key or target value
   int low = 0 ;
   int high = a.length;
   int mid = 0;
     // Till low is less than high
     while (low < high && low != a.length) {
     
        mid = low + (high - low) / 2;

        if (x >= a[mid]) {
            low = mid + 1;
        }

    
        else {
            high = mid;
        }
    }
    if (low == a.length ) {
      
         return -1;      
    }
    else return low;

    }
   public  int search(int [] arr, int x){
    int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 
			if (arr[m] == x) 
				return m; 

			if (arr[m] < x) 
				l = m + 1; 
			else
				r = m - 1; 
		} 

		return -1; 
	} 

 }
 
    
    
    
