class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> s = new Stack<>();
      
        int [] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        int n = nums.length;
        for(int i = 0 ; i< 2*n ; i++){
            if(s.isEmpty()) s.push(i);
            
            while(!s.isEmpty() && nums[s.peek()%n] < nums[i%n]){
                arr[s.peek()%n] = nums[i%n];
                s.pop();
            }
            s.push(i);
            
            
        }
        return arr;
        
    }
}

