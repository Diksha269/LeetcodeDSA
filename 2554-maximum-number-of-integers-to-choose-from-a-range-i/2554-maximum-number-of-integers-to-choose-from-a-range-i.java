class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < banned.length ; i++){
            set.add(banned[i]);
        }
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= n ; i++){
            if(sum + i <= maxSum){
                if(!set.contains(i)){
                    count++;
                    sum += i;
                }
            }else{
                break;
            }
        }
        return count;
    }
}