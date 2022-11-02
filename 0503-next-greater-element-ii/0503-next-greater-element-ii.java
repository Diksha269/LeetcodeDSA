class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int [] arr = new int[2*nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            arr[i] = nums[i];     
        }
        int j = 0;
        for(int i = nums.length ; i<arr.length ; i++){
            arr[i] = nums[j];
            j++;
        }
        int i= 1;
        while(i<arr.length){
            
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                arr[s.peek()] = arr[i];
                s.pop();
            }
            s.push(i);
            i++;
            
        }
        while(!s.isEmpty()){
           
            arr[s.peek()] = -1;
            s.pop();
        }
       
        for( i = 0 ; i<nums.length ; i++){
          
            nums[i] = arr[i];
        }
        return nums;
        
    }
}

