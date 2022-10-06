class Solution {
    
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] ans = new int[n];
        for(int i = 0 ; i< n ; i++){
            int op = 0;
            for(int j = 0 ; j<n  ; j++){
                if(boxes.charAt(j) == '1'){
                    op +=Math.abs(i-j);
                }
            }
            ans[i] = op;
        }
        return ans;
    }
}

/*
1 1 0
0 1 2
1 1 1 1 0
0 1 2 3 4
1 1 0
2 0 0

1 1 0
brute force , we are finding all the operation so all balls are in ith box
// 1 1 0
// 1,0 
//0,1  
//0,2  1,2
// we can store the answers
dp[i][j] -> reach i to j when arr[i] == 
0,0 0,1 0,2  0 1 0
1,0 1,1 1,2  1 0 0    if(arr[i] == 1 && dp[j][i]!=0){
dp[i][j] = dp[j][i];
}
else{
dp[i][j] = 
}
2,0 2,1 2,2  2 1 0


i==j 0

for(int i = 0)}{
for(int j = 0 , j< n && i != j){
 if(j==1){
  op += abs(i-j)
 }
 }
 ans+=op;
}return ans;
}





*/