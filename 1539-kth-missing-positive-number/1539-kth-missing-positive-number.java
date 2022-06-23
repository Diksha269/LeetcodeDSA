class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int n = arr.length;
        int j = 0;
        for(int i = 1; i<=10001 && j<arr.length ; i++)
        {
            if(i == arr[j]) j++;
            else if(i != arr[j])count++;
            if(count == k) return i;
           
        }
          System.out.println(count);
       if(count != k){
           for(int i = arr[n-1]+1 ; i<=10001 ; i++ ){
               count++;
               if(count == k) return i;
           }
           System.out.println(count);
       }
        return -1;
    }
}