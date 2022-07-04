class Solution {
    int [] dp ;
    public int numDecodings(String s) {
        dp = new int[101];
        Arrays.fill(dp , -1);
       char[] str = s.toCharArray();
  
        return decodeWays(str,0);
    }
    
    public int decodeWays(char [] str , int i ){
        if(dp[i] != -1) return dp[i];
        if(str.length<=i){
            return 1;
        }
       
        
        if(str[i] == '0' ) return 0;
        
        // alone
        int ans1 = 0 ,ans2= 0,ans3=0;
        
            ans1 = decodeWays(str, i+1);
        
        // pair check if pair is not greater than 26
        if(str.length-i>=2){
       
     if(str[i]<'2')
           ans2 = decodeWays(str,i+2);
     else if(str[i]=='2' && str[i+1] <='6')
            ans3= decodeWays(str,i+2);
        }
        
        
        return dp[i] =  ans1 + ans2+ans3;
    }
}
         
