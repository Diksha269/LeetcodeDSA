class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<String>();
        for(String str : wordDict){
            set.add(str);
        }
      
        boolean f[] = new boolean [s.length()+1];
        f[0] = true;
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && set.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
        
    }
}
